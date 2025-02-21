
/*
nama File   :   Titik.java
Deskripsi   :   Berisi atribut dan method dalam class titik
Pembuat     :   Hadyan Kholish Prasetio
Tanggal     :   19/02/2025
*/

public class Titik {
    /**************Atribut***************/    
    double Absis;
    double Ordinat;
    static int countertitik = 0;
    /***************Method***********/
    //konstriktor untuk membuat titik (0,0)
    public Titik(){
        Absis = 0;
        Ordinat = 0;
        countertitik++;
    }

    public Titik(double Absis, double Ordinat){
        this.Absis = Absis;
        this.Ordinat = Ordinat;
        countertitik++;
    }

    //mengembalikan nilai counterTitik
    public static int getcountertitik(){
        return countertitik;
    }

    //memprint nilai counter titik

    static void printcountertitik(){
        System.out.println(countertitik);
    }
    //mengembalikan nilai absis
    public double getAbsis(){
        return Absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return Ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        Absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        Ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    public void geser(double x, double y){
        Absis = Absis + x;
        Ordinat = Ordinat + y;
    }

    //mencetak kordinat titik
    public void printTitik(){
        System.out.println("Titik (" + Absis + "," + Ordinat + ")");
    }

    //mengembalikan nilai kuadran 
    public int getkuadran(){
        if (Absis >= 1 && Ordinat >=1){
            return 1;
        }
        else if(Absis >= 1 && Ordinat <= -1){
            return 2;
        }
        else if(Absis <= -1 && Ordinat <= -1){
            return 3;
        }
        else if (Absis <= -1 && Ordinat >=1){
            return 4;
        }
        else{
            return 0;
        }
    }

    //mengembalikan jarak pusat
    public double getjarakpusat(){
        return Math.sqrt(getAbsis()*getAbsis()+getOrdinat()*getOrdinat());
    }

    //mengembalikan jarak kedua titik
    public double getjarak(Titik T){
        return Math.sqrt((T.getAbsis()-getAbsis())*(T.getAbsis()-getAbsis())) + ((T.getOrdinat()-getOrdinat())*(T.getOrdinat()-getOrdinat()));
    }

    //merefleksikan titik pada sumbu X
    public void refleksiX(){
        Ordinat = Ordinat * -1;
    }

    //merefleksikan titik pada sumbu Y
    public void refleksiY(){
        Absis = Absis *-1;
    }

    //mengembalikan nilai refleksi titik terhadap sb X
    public Titik getRefleksiX(){
        return new Titik(Absis, -Ordinat);
    }

    //mengembalikan nilai refleksi titik thd sb Y
    public Titik getRefleksiY(){
        return new Titik(-Absis, Ordinat);
    }
}// end of class titik
 
