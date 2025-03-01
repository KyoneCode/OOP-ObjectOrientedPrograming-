
public class MainMhs {
    public static void main(String[]args){
        //bikin
        Dosen D1 = new Dosen("123", "Wanto", "IF");
        Kendaraan Zx999RR = new Kendaraan("B 1241 TO", "Motor");
        MataKuliah ASA = new MataKuliah("12","Analisa dan Strat Algo", 4);
        MataKuliah MBD = new MataKuliah("22", "Manajemen Basis Data", 4);
        MataKuliah STD = new MataKuliah("11", "Struktur Data", 4);
        MataKuliah DB = new MataKuliah("21", "DataBase", 4);
        MataKuliah AGM = new MataKuliah("31","Agama",  2);
        MataKuliah ING = new MataKuliah("41","BHS engles" ,3);
        Mhs Tio = new Mhs();

        Tio.setDosenWali(D1);
        Tio.setKendaraan(Zx999RR);
        Tio.setNama("Hadyan PraTio");
        Tio.setNim("23197");
        Tio.setProdi("IF");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%  PRINT MAHASISWA  %%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
        Tio.printMhs();

        Tio.AddMatKul(ASA);
        Tio.AddMatKul(MBD);
        Tio.AddMatKul(STD);
        Tio.AddMatKul(DB);
        Tio.AddMatKul(AGM);
        Tio.AddMatKul(ING);
        
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%  PRINT DETAIL  %%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
        Tio.printDetailMhs();
        
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%  GET JUMLAH MATKUL  %%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
        double matkul = Tio.getJumlahMatKul();
        System.out.println(matkul);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%  GET JUMLAH SKS  %%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
        double sks = Tio.getJumlahSKS();
        System.out.println(sks);
    }
}
