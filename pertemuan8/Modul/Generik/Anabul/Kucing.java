
public class Kucing extends Anabul{
    
    //konstrtruc
    public Kucing(){}
    public Kucing(String Nama){
        super(Nama);
    }
    //mutator
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }
    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }
    
}