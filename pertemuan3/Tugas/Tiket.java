/* Nama File    : Tiket.java
 * Deskripsi    : AYO BELI IKET :)
 * Pembuat      : Hadyan Kholish Prasetio/24060123140197
 * Tanggal      : 10 Maret 2025
 */
public class Tiket {
	public static void pesanJumlahTiket(int jumlahTiket) {
    	// Asumsi jumlah tiket yang tersedia (boleh diganti)
        int tiketTersedia = 100;

    // To DO : Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert (jumlahTiket > 0):"Jumlah Pesanan tidak boleh kurang dari nol";
   	// To Do : Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
        assert (jumlahTiket <= tiketTersedia):"kok lebih ?";
   	System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

	public static void isEWallet(int EWallet) {

 		// To Do : Memeriksa apakah index e-wallet yang dipilih valid
        if (EWallet > 0 && EWallet <= 4) {
            System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
		// To Do : Assertion untuk memastikan e-wallet yang dipilih valid
    } else {
        assert(EWallet > 0 && EWallet <= 4): "Pilihan e-wallet tidak valid!";
     }
  }

	private static String getEWallet(int index) {
		switch (index) {
			case 1:
    		return "OVO";
			case 2:
    		return "GoPay";
			case 3:
    		return "DANA";
			case 4:
    		return "LinkAja";
			default:
    		return "";
		}
	}
}
