
public class Kendaraan {
    //atribut
    private String noPlat;
    private String jenis;

    //konstruktor    
    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selektor dan mutator
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String x){
        noPlat = x;
    }

    public void setJenis(String x){
        jenis = x;
    }
}



