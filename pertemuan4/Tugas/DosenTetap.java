package pertemuan4.Tugas;


import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    //abstract
    protected String NIDN;
    //konstruktor
    public DosenTetap(){}
    public DosenTetap(String NIDN, String NIP, String Nama, LocalDate TanggalLahir, String Fakultas, LocalDate TMT, String Jabatan, String GajiPokok){
        super(NIP, Nama, TanggalLahir, Fakultas, TMT, Jabatan, GajiPokok);
        this.NIDN=NIDN;
    }
    public String getNIDN() {
        return NIDN;
    }
    public void setNIDN(String nIDN) {
        NIDN = nIDN;
    }
    public LocalDate hitungBUP() {
        LocalDate usiaPensiun = getTanggalLahir().plusYears(65); // Tambah 60 tahun dari tanggal lahir
        return usiaPensiun.withDayOfMonth(1).plusMonths(1); // Geser ke tanggal 1 bulan berikutnya
    }

    public double MasaKerjaTahun(){
        return Period.between(TMT, LocalDate.now()).getYears();
    }
    public double Tunjangan(){
        int gaji = Integer.parseInt(getGajiPokok());
        return Math.round((2.0/100) * MasaKerjaTahun() * gaji);
    }
    @Override
    public void printInfo() {
        System.out.println("==================================");
        System.out.println("        DATA DOSEN TETAP");
        System.out.println("==================================");
        System.out.println("NIP          : " + NIP);
        System.out.println("NIDN         : " + NIDN);
        System.out.println("Nama         : " + Nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir.format(FORMATTER));
        System.out.println("TMT          : " + TMT.format(FORMATTER));
        System.out.println("Jabatan      : " + Jabatan);
        System.out.println("Fakultas     : " + Fakultas);
        System.out.println("Masa Kerja   : " + hitungMasaKerja());
        System.out.println("BUP          : " + hitungBUP().format(FORMATTER));
        System.out.println("Gaji Pokok   : " + GajiPokok);
        System.out.println("Tunjangan    : " + "2% x "+ MasaKerjaTahun() + " x Rp. " + GajiPokok+ " = Rp. "+ Tunjangan()+"0");
    }
}
