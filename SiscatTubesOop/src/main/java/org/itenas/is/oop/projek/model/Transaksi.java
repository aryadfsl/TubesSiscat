package org.itenas.is.oop.projek.model;

import java.util.Date;

/**
 *
 * @author asus
 */
public abstract class Transaksi {
    protected Date tanggal;
    protected String kategori;
    protected String deskripsi;
    protected double jumlah;

    public Transaksi(Date tanggal, String kategori, String deskripsi, double jumlah) {
        this.tanggal = tanggal;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
        setJumlah(jumlah);
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        if (jumlah < 0) {
            throw new IllegalArgumentException("Jumlah tidak boleh negatif");
        }
        this.jumlah = jumlah;
    }
}

