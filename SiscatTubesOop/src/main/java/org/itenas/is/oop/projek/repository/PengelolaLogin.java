package org.itenas.is.oop.projek.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.itenas.is.oop.projek.utils.PengelolaKoneksi;
/**
 *
 * @author asus
 */
public class PengelolaLogin {
    private PengelolaKoneksi conMan;
    private Connection conn;

    public int masuk(String pengguna, String sandi) {
        int status = 0;
        conMan = new PengelolaKoneksi();
        conn = conMan.masuk();  // Memperbaiki penggunaan metode logOn ke masuk()

        String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, pengguna);
            stmt.setString(2, sandi);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                if (pengguna.equals(rs.getString("username")) && sandi.equals(rs.getString("password"))) {
                    status = 1;
                } else {
                    status = 0;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Kesalahan saat masuk: " + ex.getMessage());
        }
        return status;
    }

    public int daftar(String pengguna, String sandi) {
        int status = 0;
        String query = "INSERT INTO admin (username, password) VALUES (?, ?)";
        conMan = new PengelolaKoneksi();
        conn = conMan.masuk();  // Memperbaiki penggunaan metode logOn ke masuk()

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, pengguna);
            stmt.setString(2, sandi);
            stmt.executeUpdate();
            status = 1;  // Menetapkan status 1 jika registrasi berhasil
        } catch (SQLException ex) {
            System.out.println("Kesalahan saat daftar: " + ex.getMessage());
        }
        return status;
    }
}

