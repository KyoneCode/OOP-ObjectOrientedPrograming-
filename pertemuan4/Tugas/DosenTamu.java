package pertemuan4.Tugas;

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    protected String NIDK;
    protected LocalDate TBK; // Tanggal Berakhir Kontrak

    // Konstruktor
    public DosenTamu() {}

    public DosenTamu(String NIDK, String NIP, String Nama, LocalDate TanggalLahir, String Fakultas, LocalDate TMT, String Jabatan, String GajiPokok, LocalDate TBK) {
        super(NIP, Nama, TanggalLahir, Fakultas, TMT, Jabatan, GajiPokok);
        this.NIDK = NIDK;
        this.TBK = TBK;
    }

    public String getNIDK() {
        return NIDK;
    }

    public void setNIDK(String nIDK) {
        NIDK = nIDK;
    }

    public LocalDate getTBK() {
        return TBK;
    }

    public void setTBK(LocalDate TBK) {
        this.TBK = TBK;
    }

    // Menghitung sisa kontrak dalam format "X tahun Y bulan"
    public String hitungSisaKontrak() {
        Period selisih = Period.between(LocalDate.now(), TBK);
        return String.format("%d tahun %d bulan", selisih.getYears(), selisih.getMonths());
    }

    public double MasaKerjaTahun(){
        return Period.between(TMT, LocalDate.now()).getYears();

    }
    public double Tunjangan(){
        int gaji = Integer.parseInt(getGajiPokok());
        return Math.round((25.0/1000) * MasaKerjaTahun() * gaji);
    }
    @Override
    public void printInfo() {
        System.out.println("==================================");
        System.out.println("        DATA DOSEN TAMU");
        System.out.println("==================================");
        System.out.println("NIP          : " + NIP);
        System.out.println("NIDK         : " + NIDK);
        System.out.println("Nama         : " + Nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir.format(FORMATTER));
        System.out.println("TMT          : " + TMT.format(FORMATTER));
        System.out.println("Jabatan      : " + Jabatan);
        System.out.println("Fakultas     : " + Fakultas);
        System.out.println("Masa Kerja   : " + hitungMasaKerja());
        System.out.println("Sisa Kontrak : " + hitungSisaKontrak());
        System.out.println("TBK          : " + TBK.format(FORMATTER));
        System.out.println("Gaji Pokok   : Rp." + GajiPokok+".00");
        System.out.println("Tunjangan    : " + "2,5% x "+ MasaKerjaTahun() + " x Rp. " + GajiPokok+ " = Rp. "+ Tunjangan()+"0");

    }
}
