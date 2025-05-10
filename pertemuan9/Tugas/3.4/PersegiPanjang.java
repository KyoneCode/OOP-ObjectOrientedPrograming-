/**
 * File : PersegiPanjang.java
 * Nama : hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi : implementasi Persegi Panjang sebagai BangunDatar
 */
public class PersegiPanjang extends BangunDatar{
    //atribut
    private double panjang;
    private double lebar;
    
    //konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    public double hitungLuas() {
        return panjang * lebar;
    }
}
