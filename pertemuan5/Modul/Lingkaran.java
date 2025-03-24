package pertemuan5.Modul;
public class Lingkaran extends BangunDatar implements IResize{
    //atribut
    private double jari;
    private static int counterLingkaran = 0;
    //method
    /*konstruktor*/
    public Lingkaran(){
        jari = 0;
        counterLingkaran++;
    }
    public Lingkaran(double jari, double jmlSisi, String warna, String border){
        super(jmlSisi, warna, border);
        this.jari = jari;
        counterLingkaran++;
    }
    //print counter
    public double printcounter(){
        return counterLingkaran;
    }
    //setter getter
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getluas(){
        return Math.PI * getJari() * getJari();
    }

    public double getkeliling(){
        return 2 * Math.PI * getJari();
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jari :"+getJari());
    }

    public void zoomIn() {
        jari = jari*1.1;
    }
    
    public void zoomOut() {
        jari = jari *0.9;
    }
    
    public void zoom(int percent) {
        jari = jari * percent/100;
    }
}

