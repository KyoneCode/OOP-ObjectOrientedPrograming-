/**
 * Nama File  : Burung.java
 * Nama    : Hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi  : kelas burung yang merupakan subclass dari Anabul.
 */
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