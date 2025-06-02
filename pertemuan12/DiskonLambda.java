interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args) {

        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // lambda 
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        /*
         * Ekspresi lambda di atas tidak menggunakan kurung kurawal
         * dan tidak ada kata kunci return.
         * Jika ekspresi lambda hanya memiliki satu pernyataan,
         * maka pernyataan tersebut akan dieksekusi
         * dan hasilnya akan dikembalikan secara otomatis.
         */

        // lambda dengan blok statement
        IDiskon diskonBiasa = harga -> {
            return harga - (harga * 0.1);   
        };

        /*
         * Ekspresi lambda di atas menggunakan blok statement
         * yang dikelilingi oleh kurung kurawal.
         * Kita harus menggunakan kata kunci return
         * untuk mengembalikan nilai dari fungsi.
         */


        System.err.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(100000));
        System.err.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(100000));
        System.err.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(100000));



    }
}
