
public class Dosen {
    //atribut
    private String nip;
    private String nama;
    private String prodi;
    //method
    //konstruktor
    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    //selektor mutator
    public String getNama(){
        return nama;
    }

    public String getNip(){
        return nip;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNama(String x){
        nama = x;
    }

    public void setNip(String x){
        nip = x;
    }

    public void setProdi(String x){
        prodi = x;
    }
}
