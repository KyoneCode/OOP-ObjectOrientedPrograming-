
//Nama: Hadyan Kholish Prasetio
//C2
//24060123140197
public class fakultas {
    //atribut
    private univ Univ;
    private String nama;
    private double UKT;
    private double gajip;
    //konstruktor
    public fakultas(){}
    public fakultas(String nama, double UKT, double gajip){
        this.nama = nama;
        this.UKT = UKT;
        this.gajip = gajip;
    }
    //muttator
    public univ getUniv() {
        return Univ;
    }
    public double getGaji() {
        return gajip;
    }
    public String getNama() {
        return nama;
    }
    public double getUKT() {
        return UKT;
    }
    public void setGaji(double gajip) {
        this.gajip = gajip;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUKT(double uKT) {
        UKT = uKT;
    }
    
}

