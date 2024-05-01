/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

/**
 *
 * @author Johanes D.K
 */
public class Senjata {

    static int getJumlahpeluru() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String bunyi;
    private boolean menusuk;
    int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi; 
        this.menusuk = false;
        this.peluru = peluru;
    }
    private String getBunyi(){
        return bunyi;
    }
    private int getPeluru(){
        return peluru;
    }
    public boolean getJumlahPeluru(){
        return Senjata.getJumlahpeluru() >0;
    }
    public boolean getMenusuk(){
        return menusuk;
    }
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    private void setPeluru(int peluru){
        this.peluru = peluru;
    }
    private void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    public String Menusuk(){
        if(isMenusuk()){
            return "JLEB!" ;
        }else{
            return "gagal menusuk, bayonet belum terpasang";
        }
    }
    

    private boolean isMenusuk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void menembak(){
        int getJumlahpeluru = 0;
    if(getJumlahpeluru >= 1){
        System.out.println("tar");
        int jumlahpeluru = 0;
        jumlahpeluru--;
    }
}
    public void tambahpeluru(int jumlah){
    System.out.println("peluru berhasil ditambah: " +jumlah );
    peluru += jumlah;
}
    public void cekSisaPeluru(){
        String jumlahpeluru = null;
    System.out.println("peluru sisa: " + jumlahpeluru);
}
}
