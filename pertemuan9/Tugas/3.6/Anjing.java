/**
 * Nama File  : Anjing.java
 * Nama    : Hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi  : kelas anjing yang merupakan subclass dari Anabul.
 */
public class Anjing extends Anabul{
    //construk
    public Anjing(){}
    public Anjing(String Nama){
        super(Nama);
    }

    //mutator
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }
    @Override
    public void Bersuara() {
        System.out.println("Guk-Guk");
    }
}