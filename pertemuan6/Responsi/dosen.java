//Nama: Hadyan Kholish Prasetio
//C2
//24060123140197
public class dosen extends Karyawan{
    //atribud
    private fakultas Fakultas;
    private static int counterDosen;
    //kons
    public dosen(){}
    public dosen(String nama, String email, String NIP, int masaKerja, fakultas Fakultas){
        super(nama, email, NIP, masaKerja);
        this.Fakultas = Fakultas;
        counterDosen ++;
    }
    //mut
    public fakultas getFakultas() {
        return Fakultas;
    }
    public static int getCounterDosen() {
        return counterDosen;
    }
    public double getGajiK() {
        double gaji= getFakultas().getGaji();
        return gaji + (getMasaKerja() * 0.01 * gaji);
    }

    public void printInfo() {
        System.out.println("Dosen: " + getNama() + " (" + getNIP() + ")");
        System.out.println("Email: " + getEmail());
        System.out.println("Fakultas: " + Fakultas.getNama());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Gaji: Rp" + getGajiK());
        System.out.println();
    }   
    
}
