package org.itenas.is.oop.projek.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author asus
 */
public class PengelolaKoneksi {
    private Connection koneksi;
    private String url = "jdbc:mysql://localhost:3306/tubes";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String username = "root";
    private String password = "basdat2024";
    
    public Connection masuk() {
        if (koneksi == null) {
            try {
                Class.forName(driver).newInstance();
                koneksi = DriverManager.getConnection(url, username, password);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return koneksi;
    }
    
    public Connection keluar() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
            }
        } catch (SQLException ex) {
            System.out.println("Kesalahan saat memutus koneksi: " + ex.getMessage());
        }
        return koneksi;
    }
}

