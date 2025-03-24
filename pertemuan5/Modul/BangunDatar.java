
public abstract class BangunDatar {
    /*atribut*/
    private double jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public abstract double getluas();
    /*Method*/
    //konstruktor
    public BangunDatar(){
        jmlSisi = 0;
        warna = "";
        border = "";
        counterBangunDatar ++;
    }

    public BangunDatar(double jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    //print counter
    public double printcounter(){
        return counterBangunDatar;
    }
    //setter getter
    public double getjmlSisi(){
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    public void setJmlSisi(double jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo(){
        System.out.println("JmlSisi :"+getjmlSisi());
        System.out.println("warna: "+getWarna());
        System.out.println("border: "+getBorder());
        
    }
    public boolean isEqualLuas(BangunDatar x){
        return this.getluas() == x.getluas();
    }
}

//