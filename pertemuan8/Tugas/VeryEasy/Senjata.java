public class Senjata {
    private String bunyi;
    private int peluru;
    //konstruct
    public Senjata(String bunyi){
        this.bunyi=bunyi;;
        this.peluru = 0;
    }
    //metode
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
        public void menembak(int x){
        for(int i = 1; i <=x && i <= peluru; i++){
            System.out.println(getBunyi());
            peluru = peluru - 1;
        }
    }
}
