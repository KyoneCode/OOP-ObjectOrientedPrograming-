package Tugas;
public class Burung extends Anabul{
    //construk
    public Burung(){}
    public Burung(String Nama){
        super(Nama);
    }
    //mutator
    @Override
    public void Gerak() {
        System.out.println("Terbang");
    }
    @Override
    public void Bersuara() {
        System.out.println("Cuit");
    }
}
