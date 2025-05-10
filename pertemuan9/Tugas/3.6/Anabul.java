/**
 * Nama File  : Anabul.java
 * Nama    : Hadyan Kholish Prasetio
 * NIM : 24060123140197
 * Deskripsi  : kelas anabul.
 */
public class Anabul {
    private String Nama;
    //const
    public Anabul(String Nama){
        this.Nama = Nama;
    }
    public Anabul(){}
    //setter getter
    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public void Gerak(){
        System.out.println("Joged dieunhaylangla");
    }
    public void Bersuara(){
        System.out.println("Mengucapkan Mohon maaf Lahir Batin");
    }
}