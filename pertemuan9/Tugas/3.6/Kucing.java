/**
 * Nama File  : Kucing.java
 * Nama    : Hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi  : kelas Kucing yang merupakan subclass dari Anabul.
 */
public class Kucing extends Anabul{
    
    //konstrtruc
    public Kucing(){}
    public Kucing(String Nama){
        super(Nama);
    }
    //mutator
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }
    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }
    
}