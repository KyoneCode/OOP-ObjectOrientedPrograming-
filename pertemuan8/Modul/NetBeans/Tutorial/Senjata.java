/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author TUF GAMING
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    
    public Senjata(String bunyi){
        this.bunyi=bunyi;
        this.menusuk=false;
    }
    public void setBunyi(String bunyi){
    this.bunyi = bunyi;   
    }
    public String getBunyi(){
        return this.bunyi;
    }
    public boolean isMenusuk(){
        return this.menusuk;
    }
    public void setMenusuk(boolean tusuk){
        this.menusuk=tusuk;
    }
    public void menembak(int x){
        for(int i = 1; i <=x ; i++){
            System.out.println(getBunyi());
        }
    }
    public void pasangBayonet(){
        menusuk = true;
    }
    public void menusuk(){
        if (menusuk) {
            System.out.println("Jleb!");
        }
        else{
            System.out.println("Gagal, Belum pasang Bayonet!!");
        }
    }
    
}
