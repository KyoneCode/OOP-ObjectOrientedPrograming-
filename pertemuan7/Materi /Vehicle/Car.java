package pertemuan7.Materi.Vehicle;
public class Car extends Vehicle {
    @Override
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}
