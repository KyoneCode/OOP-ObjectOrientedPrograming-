/**
 * File : Lingkaran.java
 * Nama : hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 */
public class Lingkaran extends BangunDatar {
    //atribut
    private double jejari;
    //konstruktor
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }

    public double hitungLuas() {
        return 3.14 * jejari * jejari;
    }
}
