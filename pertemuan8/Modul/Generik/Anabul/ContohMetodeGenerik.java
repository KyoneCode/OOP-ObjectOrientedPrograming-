
public class ContohMetodeGenerik {
    public static void main (String[] args){
        Datum<Anabul> AnabulG = new Datum<>();
        Anabul a = new Anjing("Audi");
        Anabul b = new Kucing("Budi");
        Anabul c = new Burung("Cudi");
        System.out.println("Anjing~~~~~~~~~");
        AnabulG.setIsi(a);
        AnabulG.getIsi().Gerak();
        AnabulG.getIsi().Bersuara();
        System.out.println("Kucing~~~~~~~~");
        AnabulG.setIsi(b);
        AnabulG.getIsi().Gerak();
        AnabulG.getIsi().Bersuara();
        System.out.println("Burung~~~~~~");
        AnabulG.setIsi(c);
        AnabulG.getIsi().Gerak();
        AnabulG.getIsi().Bersuara();
    }
}
