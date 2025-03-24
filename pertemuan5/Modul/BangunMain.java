package pertemuan5.Modul;
public class BangunMain {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(2, 4, "Merah", "Putih");
        BangunDatar L1 = new Lingkaran(3, 1, "Biru", "Putih");

        P1.printInfo();
        L1.printInfo();
        boolean isEqual = P1.isEqualLuas(L1);
        System.out.println("Luas sama: " + isEqual);



    }   
}
