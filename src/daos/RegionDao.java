/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Region;
import tools.Connections;

/**
 *
 * @author ASUS
 */
public class RegionDao {

    private Connection connection;

    /**
     *
     */
    public RegionDao() {
        this.connection = new Connections().getConnection();
    }

    /**
     * Fucntion untuk mengambil semua data di tabel regions
     *
     * @return regions
     */
    public List<Region> selectRegions() {
        List<Region> regions = new ArrayList<>();
        String query = "SELECT * FROM regions ORDER BY 1";
        try {
            // Statement s = this.connection.createStatement(); cocok untuk yabg statis tanpa parameter
            PreparedStatement ps = this.connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { //next itu untuk looping selanjutnya (karna yg di next adlh rs.next dan rs itu
                Region region = new Region();
                region.setId(rs.getInt(1)); // 1 itu untuk Column Index
                region.setName(rs.getString("region_name")); //ini panggil nama column
                regions.add(region);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return regions;
    }

    /**
     * Function untuk manambahkan / menyimpan ke tabel regions
     *
     * @param id
     * @param name
     * @return true or false if true insert success else insert failed
     */
    //public boolean createRegion(int id, String name) {
    public boolean createRegion(Region region) {
        boolean result = false;
        String query = "Insert into regions(region_name,region_id) values(?,?)";
        return execute(query, region);
    }

    /**
     * Function untuk mengubah data di tabel regions
     *
     * @param id
     * @param name
     * @return true or false if true update success else update failed
     */
    public boolean updateRegion(Region region) {
        boolean result = false;
        String query = "Update regions set region_name = ? where region_id = ? ";
        return execute(query, region);
    }

    /**
     * Function untuk delete data di tabel ragions
     *
     * @param id
     * @return true false if true delete success else delete failed
     */
    public boolean deleteRegion(Region region) {
        boolean result = false;
        String query = "Delete from regions where region_id = ?";
        return execute(query, region);
    }

    /**
     * Funtion untuk mencari data regions berdasarkan id or name
     *
     * @param key
     * @return true false if true delete success else delete failed
     */
    public List<Region> searchRegion(String key) {
        List<Region> regions = new ArrayList<>();
        String query = "select * from regions where region_id like ?"
                + " OR lower(region_name) like ? ";
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setString(1, "%" + key + "%");
            ps.setString(2, "%" + key + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { //next itu untuk looping selanjutnya (karna yg di next adlh rs.next dan rs itu
                Region region = new Region();
                region.setId(rs.getInt(1)); // 1 itu untuk Column Index
                region.setName(rs.getString("region_name")); //ini panggil nama column
                regions.add(region); //add itu untuk list
            }

        } catch (Exception e) {
        }
        return regions;
    }

    /**
     * Function untuk mengambil data berdasarkan region_id
     *
     * @param id
     * @return
     */
    public Region selectById(int id) {
        Region region = new Region();
        String query = "select * from regions where region_id = ?";
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                region.setId(rs.getInt(1));
                region.setName(rs.getString("region_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return region;
    }

    public Region selectByName(String name) {
        Region region = new Region();
        String query = "select * from regions where region_name = ?";
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                region.setId(rs.getInt(1));
                region.setName(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return region;
    }

    /**
     * ini function untuk menyederhadakan function CRUD yang sama Note : harus
     * perhatikan urutan dari masing" query ang dibutuhkan
     *
     * @param query
     * @param name
     * @param id
     * @return false if true maka akan di jalankan
     */
//    private boolean execute(String query, String name, int id) {
    private boolean execute(String query, Region region) {
        boolean result = false;
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            if (region.getName() == null) {
                ps.setInt(1, region.getId());
            } else {
                ps.setString(1, region.getName());
                ps.setInt(2, region.getId());
            }
            ps.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
