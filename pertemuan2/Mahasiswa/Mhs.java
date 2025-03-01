
import java.util.ArrayList;

public class Mhs{
    //atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> ListMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //konstruktor
    public Mhs(){
        nim = "";
        nama = "";
        prodi = "";
        ListMatKul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    public Mhs(String nim, String nama, String prodi, Dosen dosen, Kendaraan kendaraan){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ListMatKul = new ArrayList<>();
        this.dosenWali = dosen;
        this.kendaraan = kendaraan;
    }

    //selektor dan mutator

    public String getNim(){
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNama(String x) {
        this.nama = x;
    }

    public void setNim(String x) {
        this.nim = x;
    }

    public void setProdi(String x) {
        this.prodi = x;
    }

    public void setDosenWali(Dosen x) {
        this.dosenWali = x;
    }

    public void setKendaraan(Kendaraan x) {
        this.kendaraan = x;
    }

    public void AddMatKul(MataKuliah x) {
        ListMatKul.add(x);
    }

    public double getJumlahSKS(){
        double count = 0;
        for (int i = 0; i < ListMatKul.size() ; i++) {
            count += ListMatKul.get(i).getSks();
        }
        return count;
    } 

    public double getJumlahMatKul(){
        return ListMatKul.size();
    }

    public void printMhs(){
        System.out.println("Nim: "+getNim());
        System.out.println("Nama: "+getNama());
        System.out.println("Prodi: "+getProdi());
    }

    public void printDetailMhs(){
        System.out.println("Nim: "+getNim());
        System.out.println("Nama: "+getNama());
        System.out.println("Prodi: "+getProdi());
        System.out.println("Matkul: ");
        for(int i=0;i<ListMatKul.size();i++){
            System.out.println("-"+ListMatKul.get(i).getNama());
        } 
        System.out.println("DosWal: "+getDosenWali().getNama()+"("+getDosenWali().getNip()+", "+getDosenWali().getProdi()+")");
        System.out.println("Kendaraan: "+"("+getKendaraan().getNoPlat()+", "+getKendaraan().getJenis()+")");
    }

}
