

public class MataKuliah {
    //atribut
    private String idMatKul;
    private String nama;
    private int sks;

    //konstruktor
    public MataKuliah(){
        idMatKul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah(String idString, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor dan mutator
    public String getIdMatKul() {
        return idMatKul;
    }
    
    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public void setIdMatKul(String x) {
        this.idMatKul = x;
    }
    
    public void setNama(String x) {
        this.nama = x;
    }
    
    public void setSks(int x) {
        this.sks = x;
    }
}
