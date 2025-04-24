package PostTest;

public class Manajer extends Pegawai{
    private int Tunjangan = 700000;

    //konstruktor
    public Manajer(String Nama){
        super(Nama);
    }
    public Manajer(){}
    
    //setter getter
    public int getTunjangan() {
        return Tunjangan;
    }
    public void setBonus(int bonus) {
        this.Tunjangan = bonus;
    }
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : "+ getTunjangan());
    }
}
