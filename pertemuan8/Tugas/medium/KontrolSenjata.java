
public class KontrolSenjata {
    private Senjata senjata;
    //konstruk
    KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    //metode
    public boolean isAdaPeluru(){
        if(senjata.getPeluru() >= 1){
            return true;
        }
        else{
            return false;
        }
    }

    public void isiPeluru(int jumlah){
        int total = senjata.getPeluru()+jumlah;
        senjata.setPeluru(total);
        System.out.println("Peluru berhasil ditambah: "+jumlah);
    }

    public void menembak(int x){
        System.out.println("Siap menembak "+x+" kali");
        if (senjata.getPeluru() > 0){
            for(int i = 1; i <=x ; i++){//ini belom selesai
                if(senjata.getPeluru() > 0){
                    System.out.println(senjata.getBunyi());
                    int total = senjata.getPeluru() - 1;
                    senjata.setPeluru(total);
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println("Peluru sisa: "+ senjata.getPeluru());
        }
        else{
            System.out.println("Peluru habis");
        }
    }

    public String menusuk(){
        if (senjata.isMenusuk()){ //ini di suruhnya function 
            return "Jleb";
        }
        else{
            return "Gagal menusuk, tidak ada bayonet";
        }
    }

    public void pasangBayonet(){
        senjata.setMenusuk(true);
    }
}
