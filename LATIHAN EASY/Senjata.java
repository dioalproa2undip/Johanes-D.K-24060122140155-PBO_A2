/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantutorial;

/**
 *
 * @author Johanes D.K
 */
public class Senjata {
    private String bunyi;
    private int jumlahpeluru;
    String getJumlahpeluru;
    String tembak;
    Senjata(String bunyi, int jumlahpeluru){
        this.bunyi = bunyi;
        this.jumlahpeluru =jumlahpeluru;
    }
    private String getBunyi(){
        return bunyi;
    }
    private void setBunyi(String bunyi){
        this.bunyi= bunyi;
    }
    private int getJumlahpeluru(){
        return jumlahpeluru;
    }
    void setJumlahpeluru(int peluru){
        this.jumlahpeluru = peluru;
    }
    public void isiPeluru(int jumlah){
        System.out.println("Isi Peluru");
        jumlahpeluru += jumlah;
        System.out.println("jumlah peluru");
    }
    public void tembak(){
        if (jumlahpeluru > 0){
            System.out.println("TAR!");
            jumlahpeluru--;
            System.out.println("sisa peluru = " +jumlahpeluru);
            
        }else{
            System.out.println("peluru habis bro");
        }
    }
    public void menembak(String bunyi){
        System.out.println(getBunyi() + "menembak:" + bunyi);
        
        
    }

    void tembak(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    


