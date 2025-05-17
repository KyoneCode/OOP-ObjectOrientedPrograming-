
//Nama: Hadyan Kholish Prasetio
//NIM: 24060123140197
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        //membuat koneksi, nama db,user,password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        // System.out.println("Driver loaded");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pbo","root","");  
        

        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
    }
}
