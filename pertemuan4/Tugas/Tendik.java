package Java.Pertemuan4.tugas;

import java.time.LocalDate;
import java.time.Period;


public class Tendik extends Pegawai{
    //abstract
    protected String Bidang;
    //konstruktor
    public Tendik(){}
    public Tendik(String NIP, String Nama, LocalDate TanggalLahir, String Bidang, LocalDate TMT, String Jabatan, String GajiPokok){
        super(NIP, Nama, TanggalLahir, TMT, Jabatan, GajiPokok);
        this.Bidang = Bidang;
    }
    public String getBidang() {
        return Bidang;
    }
    public void setBidang(String bidang) {
        Bidang = bidang;
    }
    public LocalDate hitungBUP() {
        LocalDate usiaPensiun = getTanggalLahir().plusYears(55); 
        return usiaPensiun.withDayOfMonth(1).plusMonths(1); 
    }
    public double MasaKerjaTahun(){
        return Period.between(TMT, LocalDate.now()).getYears();
    }
    public double Tunjangan(){
        int gaji = Integer.parseInt(getGajiPokok());
        return Math.round((1.0/100) * MasaKerjaTahun() * gaji);
    }

    @Override
    public void printInfo() {
        System.out.println("==================================");
        System.out.println("        DATA TENDIK");
        System.out.println("==================================");
        System.out.println("NIP          : " + NIP);
        System.out.println("Nama         : " + Nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir.format(FORMATTER));
        System.out.println("TMT          : " + TMT.format(FORMATTER));
        System.out.println("Jabatan      : " + Jabatan);
        System.out.println("Bidang       : " + Bidang);
        System.out.println("Masa Kerja   : " + hitungMasaKerja());
        System.out.println("BUP          : " + hitungBUP().format(FORMATTER));
        System.out.println("Gaji Pokok   : " + GajiPokok);
        System.out.println("Tunjangan    : " + "1% x "+ MasaKerjaTahun() + " x Rp. " + GajiPokok+ " = Rp. "+ Tunjangan()+"0");
    }
}
