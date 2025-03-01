

public class MataKuliah {
    //atribut
    private String idMatKul;
    private int sks;

    //konstruktor
    public MataKuliah(){
        idMatKul = "";
        sks = 0;
    }

    public MataKuliah(String idString, int sks){
        this.idMatKul = idMatKul;
        this.sks = sks;
    }

    //selektor dan mutator
    public String getIdMatKul() {
        return idMatKul;
    }

    public int getSks() {
        return sks;
    }

    public void setIdMatKul(String x) {
        this.idMatKul = x;
    }
    public void setSks(int x) {
        this.sks = x;
    }
}
