
public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();


        // Titik T2 = T1;
        Titik T2 = new Titik(3,5);
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        //counter titik
        System.out.println("Jumlah objek titik = " + Titik.getcountertitik());
        System.out.println("Jumlah objek T2 = " + T2.getcountertitik());
        Titik T3 = new Titik(3,10);

        //kuadran
        System.out.println("*8888*****************************Kuadran****************************888");
        T3.printTitik();
        System.out.println("titik T3 ada di kuadran:"+T3.getkuadran());
        //jarak
        System.out.println("*8888*****************************Jarak****************************888");
        System.out.println("jarak titik T3 ke pusat adalah " + T3.getjarakpusat());
        System.out.println("jarak T3 dan T1 adalah : " + T3.getjarak(T1));

        //reflaksi
        System.out.println("*8888*****************************Refleksi****************************888");
        System.out.println("nilai T3 sebelum Refleksi X");
        T3.printTitik();
        T3.refleksiX();
        System.out.println("nilai T3 sesudah Refleksi X");
        T3.printTitik();

        System.out.println("nilai T2 sebelum Refleksi Y");
        T2.printTitik();
        T2.refleksiY();
        System.out.println("nilai T2 sesudah Refleksi Y");
        T2.printTitik();
        
        Titik T4 = T3.getRefleksiX();
        System.out.println("Get refleksi T3: (kembali lagi ke sebelum refleksi X disimpan di T4)");
        T4.printTitik();

        Titik T5 = T2.getRefleksiY();
        System.out.println("Get refleksi T2: (kembali lagi ke sebelum refleksi Y disimpan di T5)");
        T5.printTitik();
    }
}
