//Nama: Hadyan Kholish Prasetio
//C2
//24060123140197
public abstract class civitas {
    private String nama;
    private String email;
    private static int counterCivitas = 0;
    //konst
    public civitas (){}
    public civitas (String nama, String email){
        this.nama = nama;
        this.email = email;
        counterCivitas ++;
    }
    //mutator
    public String getEmail() {
        return email;
    }
    public String getNama() {
        return nama;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getCounterCivitas() {
        return counterCivitas;
    }
    public abstract void printInfo();
}
