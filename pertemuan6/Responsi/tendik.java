//Nama: Hadyan Kholish Prasetio
//C2
//24060123140197
public class tendik extends Karyawan{
    //atribud
    private univ Univ;
    private static int countTendik;
    private final double gaji = 4000000;
    //konstruktor
    public tendik(){}
    public tendik(String nama, String email, String NIP, int masaKerja){
        super(nama, email, NIP, masaKerja);
        countTendik++;
    }
    //mut
    public univ getUniv() {
        return Univ;
    }
    public static int getCountTendik() {
        return countTendik;
    }
    public double getGajiK() {
        return gaji +(getMasaKerja() * 0.01 * gaji );
    }
    public void printInfo() {
        System.out.println("Tendik: " + getNama()+ " (" +getNIP() + ")");
        System.out.println("Email: " + getEmail());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Gaji: Rp" + getGajiK());
        System.out.println();
    }
}
