/**
 * Nama File  : Persegi.java
 * Nama    : Hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi  : Kelas yang mengimplementasikan interface BangunDatar untuk menghitung luas dan keliling persegi.
 */
public class Persegi extends BangunDatar {
    //atribut
    private double sisi;
    //konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}