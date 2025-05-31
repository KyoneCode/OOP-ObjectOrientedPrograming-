package jdbc.service;

import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    private Connection koneksi; 

    // Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    /* Membuat objek Mahasiswa*/
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nama = rs.getString("nama");
        return new Mahasiswa(id, nama);
    }

    /* Menambahkan data mahasiswa ke database */
    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil ditambahkan.");
        } 
        catch (SQLException e) {
            System.out.println("Gagal menambahkan data: " + e.getMessage());
        }
    }

    /* Update data mahasiswa */
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil diupdate.");
        } 
        catch (SQLException e) {
            System.out.println("Gagal mengupdate data: " + e.getMessage());
        }
    }

    /* Hapus data mahasiswa sesuai id */
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil dihapus.");
        } 
        catch (SQLException e) {
            System.out.println("Gagal menghapus data: " + e.getMessage());
        }
    }

    /* Ambil mahasiswa berdasarkan id */
    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return makeMhsObject(rs);
                }
            }
        } 
        catch (SQLException e) {
            System.out.println("Gagal mengambil data: " + e.getMessage());
        }
        return null;
    }

    /* Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                list.add(mhs);
            }
        } 
        catch (SQLException e) {
            System.out.println("Gagal mengambil data: " + e.getMessage());
        }
        return list;
    }

    public void indexReset() {
        try {
            String createNewTable = "CREATE TABLE mahasiswa_new LIKE mahasiswa";
            try (Statement stmt = koneksi.createStatement()) {
                stmt.executeUpdate(createNewTable);
                System.out.println("Tabel baru berhasil dibuat.");
            }

            String copyData = "INSERT INTO mahasiswa_new (nama) SELECT nama FROM mahasiswa ORDER BY id";
            try (Statement stmt = koneksi.createStatement()) {
                int rowsAffected = stmt.executeUpdate(copyData);
                System.out.println("Data berhasil dicopy: " + rowsAffected + " rows.");
            }

            String dropOldTable = "DROP TABLE mahasiswa";
            try (Statement stmt = koneksi.createStatement()) {
                stmt.executeUpdate(dropOldTable);
                System.out.println("Tabel lama berhasil dihapus.");
            }

            String renameTable = "RENAME TABLE mahasiswa_new TO mahasiswa";
            try (Statement stmt = koneksi.createStatement()) {
                stmt.executeUpdate(renameTable);
                System.out.println("Tabel berhasil di-rename.");
            }

            System.out.println("Reset auto increment berhasil! ID sekarang berurutan dari 1.");

        } catch (SQLException e) {
            System.out.println("Gagal reset auto increment: " + e.getMessage());

            try {
                String cleanup = "DROP TABLE IF EXISTS mahasiswa_new";
                try (Statement stmt = koneksi.createStatement()) {
                    stmt.executeUpdate(cleanup);
                    System.out.println("Cleanup tabel temporary berhasil.");
                }
            } catch (SQLException cleanupError) {
                System.out.println("Warning: Gagal cleanup tabel temporary: " + cleanupError.getMessage());
            }
        }
    }

    public boolean isEmpty() {
        String sql = "SELECT COUNT(*) FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } 
        catch (SQLException e) {
            System.out.println("Gagal memeriksa apakah tabel kosong: " + e.getMessage());
        }
        return false;
    }

    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi berhasil ditutup.");
            }
        } 
        catch (SQLException e) {
            System.out.println("Gagal menutup koneksi: " + e.getMessage());
        }
        
        
        
        
    }
}