package org.itenas.is.oop.projek.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.itenas.is.oop.projek.model.Transaksi;
import org.itenas.is.oop.projek.repository.PengelolaTransaksi;

/**
 *
 * @author asus
 */
public class LayananTransaksi {
    private PengelolaTransaksi repository;

    public LayananTransaksi(Connection koneksi) {
        this.repository = new PengelolaTransaksi(koneksi);
    }

    public void tambahTransaksi(Transaksi transaksi) throws SQLException {
        repository.tambahTransaksi(transaksi);
    }

    public List<Transaksi> ambilSemuaTransaksi() throws SQLException {
        return repository.ambilSemuaTransaksi();
    }

    public void perbaruiTransaksi(Transaksi transaksi, int id) throws SQLException {
        repository.perbaruiTransaksi(transaksi, id);
    }

    public void hapusTransaksi(int id) throws SQLException {
        repository.hapusTransaksi(id);
    }
}
