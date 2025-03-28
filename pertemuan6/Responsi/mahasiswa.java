//Nama: Hadyan Kholish Prasetio
//C2
//24060123140197
public class mahasiswa extends civitas {
    //atribut
    private String NIM;
    private double Semester;
    private fakultas Fakultas;
    private static int counterMahasiswa = 0;
    //konstruktor
    public mahasiswa(){}
    public mahasiswa(String nama, String email, String NIM, double Semester, fakultas Fakultas){
        super(nama, email);
        this.NIM = NIM;
        this.Semester = Semester;
        this.Fakultas = Fakultas;
        counterMahasiswa++;
    }
    //mutator
    public String getNIM() {
        return NIM;
    }
    public fakultas getFakultas() {
        return Fakultas;
    }
    public double getSemester() {
        return Semester;
    }
    public void setFakultas(fakultas fakultas) {
        Fakultas = fakultas;
    }
    public void setNIM(String nIM) {
        NIM = nIM;
    }
    public void setSemester(double semester) {
        Semester = semester;
    }
    public int getCounterMahasiswa() {
        return counterMahasiswa;
    }
    public double getUKT() {
    double ukt = Fakultas.getUKT();
    double semester = getSemester() - 1;
    return ukt - (ukt * 0.05 * semester);
    }
    public void printInfo() {
        System.out.println("Mahasiswa: " + getNama() + " (" + NIM + ")");
        System.out.println("Email: " + getEmail());
        System.out.println("Fakultas: " + Fakultas.getNama());
        System.out.println("Semester: " + getSemester());
        System.out.println("Biaya UKT: Rp" + getUKT());
        System.out.println();
    }
}

