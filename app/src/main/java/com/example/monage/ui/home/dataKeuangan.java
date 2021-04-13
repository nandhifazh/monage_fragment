package com.example.monage.ui.home;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class dataKeuangan implements Parcelable {

    String tanggal;
    String kategori;
    String harga;
    String catatan;

    public dataKeuangan(String tanggal, String kategori, String harga, String catatan) {
        this.tanggal = tanggal;
        this.kategori = kategori;
        this.harga = harga;
        this.catatan = catatan;
    }

    protected dataKeuangan(Parcel in) {
        tanggal = in.readString();
        kategori = in.readString();
        harga = in.readString();
        catatan = in.readString();
    }

    public static final Creator<dataKeuangan> CREATOR = new Creator<dataKeuangan>() {
        @Override
        public dataKeuangan createFromParcel(Parcel in) {
            return new dataKeuangan(in);
        }

        @Override
        public dataKeuangan[] newArray(int size) {
            return new dataKeuangan[size];
        }
    };

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tanggal);
        dest.writeString(kategori);
        dest.writeString(harga);
        dest.writeString(catatan);
    }
}