package PostTest;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programer("Mira");
        Pegawai pegawai2 = new Manajer   ("Joko");
        Pegawai pegawai3 = new Manajer   ("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai p : emps) {
            p.tampilData();
            System.out.println(); 
        }
    }
}