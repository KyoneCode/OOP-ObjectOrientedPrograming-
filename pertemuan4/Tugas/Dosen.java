package pertemuan4.Tugas;

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    //abstract
    protected String Fakultas;
    //konstruktor
    public Dosen(){}
    public Dosen(String NIP, String Nama, LocalDate TanggalLahir, String Fakultas, LocalDate TMT, String Jabatan, String GajiPokok){
        super(NIP, Nama, TanggalLahir, TMT, Jabatan, GajiPokok);
        this.Fakultas=Fakultas;
    }
    public String getFakultas() {
        return Fakultas;
    }
    public void setFakultas(String fakultas) {
        Fakultas = fakultas;
    }
    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        super.printInfo();
        System.out.println("Fakultas     : " + Fakultas);
    }

}
