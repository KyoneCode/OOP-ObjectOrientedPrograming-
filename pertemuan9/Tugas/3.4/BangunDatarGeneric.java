/**
 * File : BangunDatarGeneric.java
 * Nama : hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi : Kelas generic untuk mengelola objek BangunDatar
 */
public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
}
