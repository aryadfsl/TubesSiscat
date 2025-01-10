package org.itenas.is.oop.projek.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.itenas.is.oop.projek.model.Transaksi;
import org.itenas.is.oop.projek.model.TransaksiPemasukan;
import org.itenas.is.oop.projek.model.TransaksiPengeluaran;

public class PengelolaTransaksi {
    private Connection koneksi;

    public PengelolaTransaksi(Connection koneksi) {
        this.koneksi = koneksi;
    }

    public void tambahTransaksi(Transaksi transaksi) throws SQLException {
        String sql = "INSERT INTO base_transaction (date, category, description, amount, type) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setDate(1, new java.sql.Date(transaksi.getTanggal().getTime()));
            stmt.setString(2, transaksi.getKategori());
            stmt.setString(3, transaksi.getDeskripsi());
            stmt.setDouble(4, transaksi.getJumlah());
            stmt.setString(5, transaksi instanceof TransaksiPemasukan ? "income" : "expense");
            stmt.executeUpdate();
        }
    }

    public List<Transaksi> ambilSemuaTransaksi() throws SQLException {
        List<Transaksi> transaksiList = new ArrayList<>();
        String sql = "SELECT * FROM base_transaction";
        try (Statement stmt = koneksi.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Transaksi transaksi = buatTransaksiDariResultSet(rs);
                transaksiList.add(transaksi);
            }
        }
        return transaksiList;
    }

    public List<Transaksi> ambilTransaksiBerdasarkanKategori(String kategori) throws SQLException {
        List<Transaksi> transaksiList = new ArrayList<>();
        String sql = "SELECT * FROM base_transaction WHERE category = ?";
        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setString(1, kategori);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Transaksi transaksi = buatTransaksiDariResultSet(rs);
                    transaksiList.add(transaksi);
                }
            }
        }
        return transaksiList;
    }

    public Transaksi ambilTransaksiBerdasarkanId(int id) throws SQLException {
        String sql = "SELECT * FROM base_transaction WHERE id = ?";
        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return buatTransaksiDariResultSet(rs);
                }
            }
        }
        return null;
    }

    public void perbaruiTransaksi(Transaksi transaksi, int id) throws SQLException {
        String sql = "UPDATE base_transaction SET date = ?, category = ?, description = ?, amount = ?, type = ? WHERE id = ?";
        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setDate(1, new java.sql.Date(transaksi.getTanggal().getTime()));
            stmt.setString(2, transaksi.getKategori());
            stmt.setString(3, transaksi.getDeskripsi());
            stmt.setDouble(4, transaksi.getJumlah());
            stmt.setString(5, transaksi instanceof TransaksiPemasukan ? "income" : "expense");
            stmt.setInt(6, id);
            stmt.executeUpdate();
        }
    }

    public void hapusTransaksi(int id) throws SQLException {
        String sql = "DELETE FROM base_transaction WHERE id = ?";
        try (PreparedStatement stmt = koneksi.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    private Transaksi buatTransaksiDariResultSet(ResultSet rs) throws SQLException {
        String type = rs.getString("type");
        if ("income".equals(type)) {
            return new TransaksiPemasukan(
                rs.getDate("date"),
                rs.getString("category"),
                rs.getString("description"),
                rs.getDouble("amount")
            );
        } else {
            return new TransaksiPengeluaran(
                rs.getDate("date"),
                rs.getString("category"),
                rs.getString("description"),
                rs.getDouble("amount")
            );
        }
    }
}

