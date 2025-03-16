package pertemuan4.Tugas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat objek DosenTetap
        DosenTetap dosenTetap = new DosenTetap(
            "123456789",  
            "1987654321", 
            "Dr. Andi Saputra", 
            LocalDate.of(1970, 5, 15), 
            "Teknik Informatika", 
            LocalDate.of(2000, 3, 1), 
            "Dosen Tetap", 
            "10000000",
            65 
        );

        // Membuat objek DosenTamu
        DosenTamu dosenTamu = new DosenTamu(
            "987654321",  
            "1122334455", 
            "Prof. Budi Santoso", 
            LocalDate.of(1980, 10, 20), 
            "Ekonomi", 
            LocalDate.of(2015, 6, 1), 
            "Dosen Tamu", 
            "8000000",  
            LocalDate.of(2026, 12, 31)
        );

        // Membuat objek Tendik
        Tendik tendik = new Tendik(
            "5566778899", 
            "Siti Aminah", 
            LocalDate.of(1985, 2, 10), 
            "Sumber Daya", 
            LocalDate.of(2010, 9, 1),
            "Tendik",
            "6000000",
            55 
        );

        // Menampilkan informasi setiap objek
        dosenTetap.printInfo();
        System.out.println();
        dosenTamu.printInfo();
        System.out.println();
        tendik.printInfo();
    }
}
