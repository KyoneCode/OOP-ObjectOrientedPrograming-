
public class Persegi extends BangunDatar implements IResize{
    //atribut
    private double sisi;
    private static int counterPersegi = 0;
    //metode
    /*konstruktor*/
    public Persegi(){
        sisi = 0;
        counterPersegi++;
    }
    public Persegi(double sisi, double jmlSisi, String warna, String border){
        super(jmlSisi, warna, border);
        this.sisi = sisi;
        counterPersegi++;
    }
    //print counter
    public double printcounter(){
        return counterPersegi;
    }
    //setter getter

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getluas() {
        return getSisi() * getSisi();
    }

    public double getkeliling() {
        return 4* getSisi();
    }
    
    public double getdiagonal () {
        return Math.sqrt(getSisi()*getSisi()+getSisi()*getSisi());
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi :"+getSisi());
    }
    
    public void zoomIn() {
        sisi = sisi*1.1;
    }
    
    public void zoomOut() {
        sisi = sisi *0.9;
    }
    
    public void zoom(int percent) {
        sisi = sisi * percent/100;
    }
}