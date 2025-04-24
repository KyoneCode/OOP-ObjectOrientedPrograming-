package PostTest;

public class Programer extends Pegawai {
    private int bonus = 450000;

    //konstruktor
    public Programer(String Nama){
        super(Nama);
    }
    public Programer(){}
    
    //setter getter
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : "+ getBonus());
    }
    
}
