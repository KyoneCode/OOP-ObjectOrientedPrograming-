/**
 * File : Segitiga.java
 * Nama    : Hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 */
public class Segitiga extends BangunDatar {
    //atribut
    private double alas;
    private double tinggi;
    
    // konstruktor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double hitungKeliling() {
        return 3 * alas; 
    }
    
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}