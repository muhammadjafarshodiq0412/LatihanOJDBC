package tools;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author ASUS
 */
public class Connections {

    private Connection connection = null;
    
    /**
     * Bootcamp 15 Nov 2019
     * ini pembuatan koneksi dengan oracle
     * @return this.connection (karna bukan void jadi harus ada nilai yang di kembalikan)
     */
    public Connection getConnection() {
        try {
            OracleDataSource dataSource = new OracleDataSource();
            dataSource.setDriverType("thin"); 
            dataSource.setServerName("localhost");
            dataSource.setPortNumber(1521);
            dataSource.setServiceName("XE"); //
            dataSource.setDatabaseName("HR");
            dataSource.setUser("system");
            dataSource.setPassword("jafar");
            this.connection = dataSource.getConnection();
            this.connection.createStatement().execute("alter session set current_schema = HR");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return this.connection;
    }

}
