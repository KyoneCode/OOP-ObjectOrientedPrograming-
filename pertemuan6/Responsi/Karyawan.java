//Nama: Hadyan Kholish Prasetio
//C2
//24060123140197
public abstract class Karyawan extends civitas{
    //atri
    private String NIP;
    private int masaKerja;
    private static int counterKaryawan;
    //konstruk
    public Karyawan(){}
    public Karyawan(String nama, String email, String NIP, int masaKerja){
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }
    //mutator
    public String getNIP() {
        return NIP;
    }
    public int getMasaKerja() {
        return masaKerja;
    }
    public int getCounterKaryawan() {
        return counterKaryawan;
    }
    public abstract double getGajiK();
}
