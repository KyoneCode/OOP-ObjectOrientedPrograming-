package oop_objectorientedprogramming.pertemuan4.kelas_modul;


public class lingkaran extends BangunDatar {
    //atribut
    private double jari;
    private static int counterLingkaran = 0;
    //method
    /*konstruktor*/
    public lingkaran(){
        jari = 0;
        jmlSisi = 0;
        warna = "";
        border = "";
        counterLingkaran++;
    }
    public lingkaran(double jari, double jmlSisi, String warna, String border){
        this.jari = jari;
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterLingkaran++;
    }
    //print counter
    public double printcounter(){
        return counterLingkaran;
    }
    //setter getter
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getluas(){
        return Math.PI * getJari() * getJari();
    }

    public double getkeliling(){
        return 2 * Math.PI * getJari();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari :"+getJari());
    }
}

