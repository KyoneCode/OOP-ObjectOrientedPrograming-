public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi=bunyi;;
        this.peluru = 0;
        this.menusuk = false;
    }
    public void setBunyi(String bunyi){
    this.bunyi = bunyi;   
    }
    public String getBunyi(){
        return this.bunyi;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    public int getPeluru(){
        return peluru;
    }
    public boolean isMenusuk(){
        return this.menusuk;
    }
    public void setMenusuk(boolean tusuk){
        this.menusuk=tusuk;
    }
}

