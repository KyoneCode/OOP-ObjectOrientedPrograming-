// package pertemuan1;
// package pertemuan1;
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
    Titik(){
        Absis = 0;
        Ordinat = 0;
        countertitik++;
    }

    Titik(double Absis, double Ordinat){
        this.Absis = Absis;
        this.Ordinat = Ordinat;
        countertitik++;
    }

    //mengembalikan nilai counterTitik
    static int getcountertitik(){
        return countertitik;
    }

    //memprint nilai counter titik

    static void printcountertitik(){
        System.out.println(countertitik);
    }
    //mengembalikan nilai absis
    double getAbsis(){
        return Absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return Ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        Absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        Ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y){
        Absis = Absis + x;
        Ordinat = Ordinat + y;
    }

    //mencetak kordinat titik
    void printTitik(){
        System.out.println("Titik (" + Absis + "," + Ordinat + ")");
    }

    //mengembalikan nilai kuadran 
    int getkuadran(){
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
    double getjarakpusat(){
        return Math.sqrt(getAbsis()*getAbsis()+getOrdinat()*getOrdinat());
    }

    //mengembalikan jarak kedua titik
    double getjarak(Titik T){
        return Math.sqrt((T.getAbsis()-getAbsis())*(T.getAbsis()-getAbsis())) + ((T.getOrdinat()-getOrdinat())*(T.getOrdinat()-getOrdinat()));
    }

    //merefleksikan titik pada sumbu X
    void refleksiX(){
        Ordinat = Ordinat * -1;
    }

    //merefleksikan titik pada sumbu Y
    void refleksiY(){
        Absis = Absis *-1;
    }

    //mengembalikan nilai refleksi titik terhadap sb X
    Titik getRefleksiX(){
        return new Titik(Absis, -Ordinat);
    }

    //mengembalikan nilai refleksi titik thd sb Y
    Titik getRefleksiY(){
        return new Titik(-Absis, Ordinat);
    }
}// end of class titik
 
