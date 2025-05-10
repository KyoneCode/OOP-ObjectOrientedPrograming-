/**
 * Nama File  : main.java
 * Nama    : Hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi  : main koleksi.
 */
public class main {
    public static void main(String[] args) {
        koleksi<String> koleksi = new koleksi<>();
        koleksi.add("Satu");
        koleksi.add("Dua");
        koleksi.add("Tiga");
        koleksi.add("Empat");
        koleksi.add("Lima");
        koleksi.add("Enam"); 
        koleksi.add("Tujuh"); 
        koleksi.add("Delapan");
        koleksi.add("Sembilan");
        koleksi.add("Sepuluh");
        koleksi.add("Sebelas");
        koleksi.add("Dua Belas");
        
        System.out.println("Sebelum diProses");
        koleksi.showAll();
        
        koleksi.setsize(10);// Mengatur ukuran koleksi menjadi 10

        System.out.println("Setelah SetSize:");
        koleksi.showAll();

        koleksi.delete(2); // Menghapus elemen pada indeks 2 (Tiga)

        System.out.println("\nSetelah penghapusan:");
        koleksi.showAll();

        koleksi.setIsi(2, "Tiga Baru"); // ganti elemen indeks 2 menjadi "Tiga Baru"
        System.out.println("\nSetelah SetIsi:");
        koleksi.showAll();
    }    
}
