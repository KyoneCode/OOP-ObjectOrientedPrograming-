//Nama: Hadyan Kholish Prasetio
//C2
//24060123140197
public class Main {
    public static void main(String[] args) {
        fakultas fsm = new fakultas("FSM", 5000000, 7000000);
        fakultas feb = new fakultas("FEB", 4500000, 6500000);
        
        mahasiswa mhs1 = new mahasiswa("Andi", "andi@PBO.com", "726954", 4, fsm);
        mahasiswa mhs2 = new mahasiswa("Budi", "budi@PBO.com", "263253", 2, feb);
        
        dosen dosen1 = new dosen("Dr. Siti", "siti@PBO.com", "13612414214", 10, fsm);
        tendik tendik1 = new tendik("Pak Joko", "joko@PBO.com", "124125711", 5);
        
        mhs1.printInfo();
        mhs2.printInfo();
        dosen1.printInfo();
        tendik1.printInfo();
    }
}

