/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

import static latihanmedium.Senjata.getJumlahpeluru;

/**
 *
 * @author Johanes D.K
 */
public class KontrolSenjata extends Senjata{
    private Senjata senjata;
    private boolean menusuk;
    private int menembak;

    public KontrolSenjata(String bunyi) {
        super(bunyi);
    }

    
    /**
     *
     * @param s
     */
  
public boolean isAdaPeluru(){
    return Senjata.getJumlahpeluru() >0;
}
public boolean isPeluru(int jumlahPeluru){
    return Senjata.getJumlahpeluru() >= getJumlahpeluru();
}

public String Menusuk(){
    if(menusuk){
        return "jlub !";
    }else{
        return "gagal memasang bayonet";
    }
}
 public void siapMenembak(int jumlah) {
        System.out.println("siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            senjata.menembak();
        }
    }


}

   