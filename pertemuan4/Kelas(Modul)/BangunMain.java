package oop_objectorientedprogramming.pertemuan4.kelas_modul;

public class BangunMain {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(2, 4, "Merah", "Putih");
        Lingkaran L1 = new Lingkaran(3, 1, "Biru", "Putih");
    
        P1.printInfo();
        L1.printInfo();
    
    }   
}
