/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

/**
 *
 * @author Johanes D.K
 */
public class TestSenjata {
  
    public static void main(String[] args) {
        Senjata senjata1 = new Senjata("TAR");
        KontrolSenjata kontrolSenjata1 = new KontrolSenjata(senjata1);

        kontrolSenjata1.siapMenembak(2);
        senjata1.cekSisaPeluru();
        kontrolSenjata1.siapMenembak(5);
        senjata1.cekSisaPeluru();

        Senjata senjata2 = new Senjata("TAR");
        KontrolSenjata kontrolSenjata2 = new KontrolSenjata(senjata2);

        kontrolSenjata2.siapMenembak(1);
        senjata2.cekSisaPeluru();
        kontrolSenjata2.siapMenembak(2);
        senjata2.cekSisaPeluru();
    }
}
    

