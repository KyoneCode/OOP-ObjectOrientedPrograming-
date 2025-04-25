package Tugas;
public class Main {
    public static void main(String[] args){
        Anabul meeng = new Kucing("Meeng");
        Anabul gugug = new Anjing("Gugug");
        Anabul purpur = new Burung("PurPur");
        Anabul A1 = new Anabul("CHATGPT");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        tampilkanInfo("kucing", meeng);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        tampilkanInfo("anjing", gugug);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        tampilkanInfo("burung", purpur);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        tampilkanInfo("default", A1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void tampilkanInfo(String jenis, Anabul hewan) {
        System.out.println("Ini anabul jenis " + jenis);
        System.out.println("Gerak : ");
        hewan.Gerak();
        System.out.println("Suara : ");
        hewan.Bersuara();
    }
}
