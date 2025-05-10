/**
 * Nama File  : koleksi.java
 * Nama    : Hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi  : kelas koleksi yang di realisasikan di jawa!!!.
 */
import java.util.ArrayList;
public class koleksi<K> {
    //atribut
    private int NbElm;
    private ArrayList<K> wadah;

    //konstruktor
    public koleksi(){
        NbElm = 0;
        this.wadah = new ArrayList<>();
    }

    //method
    public K getisi(int i){
        if (i < NbElm) { 
            return wadah.get(i);
        } 
        else {
            System.out.println("Indeksnya di luar batas elemen epektip");
            return null;
        }
    }

    public void setIsi(int i, K isi){
        if (i < NbElm) { 
            wadah.set(i, isi);
        } 
        else {
            System.out.println("Indeksnya di luar batas elemen epektip");
        }
    }

    public int getSize(){
        return NbElm;
    }


    public void setsize(int size) {
        if (size >= 0) {
            NbElm = size;
            while (wadah.size() > NbElm) {
                wadah.remove(wadah.size() - 1);
            }
        } 
        else {
            System.out.println("Ukuran tidak valid! Ukuran harus lebih dari 0.");
        }
    }

    public void add(K isi){
        wadah.add(isi);
        NbElm++;
    }

    public void delete(int i){
        if (i<0 || i >= NbElm) {
            System.out.println("Indeksnya di luar batas elemen epektip");
        } 
        else {
            wadah.remove(i);
            NbElm--;
        }
    }

    public void showAll(){
        for (int i = 0; i < NbElm; i++) {
            System.out.println("Elemen ke-" + i + " : " + wadah.get(i));
        }
    }

}
