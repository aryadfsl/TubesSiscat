package org.itenas.is.oop.projek.model;

import java.util.Date;
import org.itenas.is.oop.projek.service.DetailTransaksi;
/** 
 *
 * @author asus
 */
public class TransaksiPemasukan extends Transaksi implements DetailTransaksi {
    public TransaksiPemasukan(Date tanggal, String kategori, String deskripsi, double jumlah) {
        super(tanggal, kategori, deskripsi, jumlah);
    }

    @Override
    public String getDetail() {
        return "Pemasukan: " + deskripsi + " pada " + tanggal + " Jumlah: " + jumlah;
    }
}
