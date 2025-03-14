package oop_objectorientedprogramming.pertemuan4.kelas_modul;


public class BangunDatar {
    /*atribut*/
    protected double jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;
    /*Method*/
    //konstruktor
    public BangunDatar(){
        jmlSisi = 0;
        warna = "";
        border = "";
        counterBangunDatar ++;
    }

    public BangunDatar(double jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    //print counter
    public double printcounter(){
        return counterBangunDatar;
    }
    //setter getter
    public double getjmlSisi(){
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    public void setJmlSisi(double jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo(){
        System.out.println("JmlSisi :"+getjmlSisi());
        System.out.println("warna: "+getWarna());
        System.out.println("border: "+getBorder());
        
    }
}

/*
1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
Persegi dan Lingkaran? 
2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada
kelas Persegi dan Lingkaran?

Jawab:
1. kalo BangunDatar dikasih FINAL.. nanti persegi sama lingkaran jadi gabisa pake BangunDatar sebagai parents.. yang mana bisa menyebakan errorr
2. printInfo jadi gabisa di override pada class persegi dan lingkaran.. buat nampilin lengkap jadi harus di tambahin jmlSisi warna dan border manual ke print info di kelas lingkaran dan perseegi
*/

