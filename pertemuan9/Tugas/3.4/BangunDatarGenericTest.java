/**
 * File : BangunDatarGenericTest.java
 * Nama : hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi : main dari bangun datar generic
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        System.out.println();
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("Luas lingkaran : " + bdg.hitungLuas());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());

        System.out.println();
        Persegi p = new Persegi(4);
        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<Persegi>();
        bdg2.set(p);
        System.out.println("keliling persegi : " + bdg2.hitungKeliling());
        System.out.println("Luas Persegi : " + bdg2.hitungLuas());
        System.out.println("tipe generic : " + bdg2.get().getClass().getName());

        System.out.println();
        Segitiga s = new Segitiga(3, 4);
        BangunDatarGeneric<Segitiga> bdg3 = new BangunDatarGeneric<Segitiga>();
        bdg3.set(s);
        System.out.println("keliling segitiga : " + bdg3.hitungKeliling());
        System.out.println("Luas Segitiga : " + bdg3.hitungLuas());
        System.out.println("tipe generic : " + bdg3.get().getClass().getName());
    
        System.out.println();
        PersegiPanjang pp = new PersegiPanjang(5, 4);
        BangunDatarGeneric<PersegiPanjang> bdg4 = new BangunDatarGeneric<PersegiPanjang>();
        bdg4.set(pp);
        System.out.println("Keliling PersegiPanjang : "+ bdg4.hitungKeliling());
        System.out.println("Luas PersegiPanjang : " + bdg4.hitungLuas());
        System.out.println("tipe generic : "+bdg4.get().getClass().getName());
    }
}

