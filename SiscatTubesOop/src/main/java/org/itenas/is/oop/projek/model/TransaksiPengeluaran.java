package org.itenas.is.oop.projek.model;

import java.util.Date;
import org.itenas.is.oop.projek.service.DetailTransaksi;
/**
 *
 * @author asus
 */
public class TransaksiPengeluaran extends Transaksi implements DetailTransaksi {
    public TransaksiPengeluaran(Date tanggal, String kategori, String deskripsi, double jumlah) {
        super(tanggal, kategori, deskripsi, jumlah);
    }

    @Override
    public String getDetail() {
        return "Pengeluaran: " + deskripsi + " pada " + tanggal + " Jumlah: " + jumlah;
    }
}
