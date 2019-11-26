/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.RegionController;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ASUS
 */
public class Region extends javax.swing.JInternalFrame {

    models.Region region = new models.Region();
    RegionController regionController = new RegionController();

    /**
     * Creates new form Region
     */
    public Region() {
        initComponents();
        bindingTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        bt_add = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        tSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegions = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Region");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Region Details"));

        tid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tidMouseClicked(evt);
            }
        });
        tid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tidKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        tname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnameKeyTyped(evt);
            }
        });

        bt_add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_add.setText("Save");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        bt_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_delete.setText("Delete");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bt_add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_delete))
                            .addComponent(tname))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tname, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_delete)
                    .addComponent(bt_add)))
        );

        tSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tSearchKeyTyped(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblRegions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblRegions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblRegionsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegions);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblRegionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegionsMousePressed
        int row = tblRegions.getSelectedRow();
        tid.setText((String) tblRegions.getValueAt(row, 0).toString());
        tname.setText((String) tblRegions.getValueAt(row, 1));
        tid.setEnabled(false);
    }//GEN-LAST:event_tblRegionsMousePressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        bindingTabelSearch();
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        String id = tid.getText();
        String name = tname.getText();
        if (id.equals("")) {
              JOptionPane.showMessageDialog(null, "ID required");
        }
        else if (name.equals("")) {
              JOptionPane.showMessageDialog(null, "Name required");
        }
        else{
        int a = regionController.selectById(id).getId();
        if (Integer.parseInt(id) == a) {
            JOptionPane.showMessageDialog(this, regionController.update(id, name));
            reset();
        } else {
            JOptionPane.showMessageDialog(this, regionController.create(id, name));
            reset();
        }
        }
        bindingTabel();
    }//GEN-LAST:event_bt_addActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
     if(JOptionPane.showConfirmDialog(this, "Delete Data?","Confirmation",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){   
        String id = tid.getText();
        JOptionPane.showMessageDialog(this, regionController.delete(id));
        reset();
        bindingTabel();
     }
     
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void tidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tidKeyTyped
        filterHuruf(evt);
    }//GEN-LAST:event_tidKeyTyped

    private void tnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnameKeyTyped
        filterAngka(evt);
    }//GEN-LAST:event_tnameKeyTyped

    private void tidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tidMouseClicked
        reset();
        tid.requestFocus();
    }//GEN-LAST:event_tidMouseClicked

    private void tSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tSearchKeyTyped
        bindingTabelSearch();
    }//GEN-LAST:event_tSearchKeyTyped

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        String id = tid.getText();
        String name = tname.getText();
        int a = regionController.selectById(id).getId();
        if (Integer.parseInt(id) == a) {
            JOptionPane.showMessageDialog(this, regionController.update(id, name));
            reset();
        } else {
            JOptionPane.showMessageDialog(this, regionController.create(id, name));
        }
        bindingTabel();
    }//GEN-LAST:event_tnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tSearch;
    private javax.swing.JTable tblRegions;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tname;
    // End of variables declaration//GEN-END:variables
public void reset() {
        tid.setEnabled(true);
        tid.setText("");
        tname.setText("");
    }

    void filterHuruf(KeyEvent a) {
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Just Allowed Number Type");
        }
    }

    public void filterAngka(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!((c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SPACE)
                || (c == KeyEvent.VK_ENTER)))) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Just Allowed Character Type");
        }
    }

    private void bindingTabel() {

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(
                new String[]{
                    "ID",
                    "REGION NAME"
                }
        );

        for (models.Region r : regionController.getAll()) {
            Object[] o = new Object[2];
            o[0] = r.getId();
            o[1] = r.getName();
            tableModel.addRow(o);
        }
        tblRegions.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblRegions.setModel(tableModel);
    }

    private void bindingTabelSearch() {
        String search = tSearch.getText();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(
                new String[]{
                    "ID",
                    "REGION NAME"
                }
        );

        for (models.Region r : regionController.search(search)) {
            Object[] o = new Object[2];
            o[0] = r.getId();
            o[1] = r.getName();
            tableModel.addRow(o);
        }
        tblRegions.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblRegions.setModel(tableModel);
    }
    
//    private void filter(String query){
//        TableRowSorter<DefaultTableModel> transient = new TableRowSorter<DefaultTableModel>(tblRegions);
//    }

}