package oop_objectorientedprogramming.pertemuan4.kelas_modul;


public class Persegi extends BangunDatar{
    //atribut
    private double sisi;
    private static int counterPersegi = 0;
    //metode
    /*konstruktor*/
    public Persegi(){
        sisi = 0;
        jmlSisi = 0;
        warna = "";
        border = "";
        counterPersegi++;
    }
    public Persegi(double sisi, double jmlSisi, String warna, String border){
        this.sisi = sisi;
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterPersegi++;
    }
    //print counter
    public double printcounter(){
        return counterPersegi;
    }
    //setter getter

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getluas() {
        return getSisi() * getSisi();
    }

    public double getkeliling() {
        return 4* getSisi();
    }
    
    public double getdiagonal () {
        return Math.sqrt(getSisi()*getSisi()+getSisi()*getSisi());
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi :"+getSisi());
    }
}
