package jdbc.utilities;
import java.sql.*;

public class MysqlUtility {
    
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Konfigurasi username dan password
                String url = "jdbc:mysql://localhost:3306/pboprak";
                // Ganti username dan password
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil!");
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Gagal load driver: " + cnfe.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi: " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
