package Pertemuan4.tugas;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Pegawai {
    //atribut
    protected String NIP;
    protected String Nama;
    protected LocalDate TanggalLahir;
    protected LocalDate TMT;
    protected String Jabatan;
    protected String GajiPokok;
    //konstruktor
    protected static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("d MMMM yyyy");
    
    public Pegawai(){}
    public Pegawai(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, String Jabatan, String GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.Jabatan = Jabatan;
        this.GajiPokok = GajiPokok;
    }

    public String hitungMasaKerja() {
        Period selisih = Period.between(TMT, LocalDate.now());
        return String.format("%d tahun %d bulan", selisih.getYears(), selisih.getMonths());
    }
    public String getNIP() {
        return NIP;
    }
    public String getNama() {
        return Nama;
    }
    public LocalDate getTanggalLahir() {
        return TanggalLahir;
    }
    public LocalDate getTMT() {
        return TMT;
    }
    public String getJabatan() {
        return Jabatan;
    }
    public String getGajiPokok() {
        return GajiPokok;
    }
    public void setNIP(String nIP) {
        NIP = nIP;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public void setTanggalLahir(LocalDate tanggalLahir) {
        TanggalLahir = tanggalLahir;
    }
    public void setTMT(LocalDate tMT) {
        TMT = tMT;
    }
    public void setJabatan(String jabatan) {
        Jabatan = jabatan;
    }
    public void setGajiPokok(String gajiPokok) {
        GajiPokok = gajiPokok;
    }
    public void printInfo() {
        System.out.println("==================================");
        System.out.println("        DATA PEGAWAI");
        System.out.println("==================================");
        System.out.println("NIP          : " + NIP);
        System.out.println("Nama         : " + Nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir.format(FORMATTER));
        System.out.println("TMT          : " + TMT);
        System.out.println("Jabatan      : " + Jabatan);
        System.out.println("Masa Kerja   : " + hitungMasaKerja());
        System.out.println("Gaji Pokok   : " + GajiPokok);
    }
    

}
