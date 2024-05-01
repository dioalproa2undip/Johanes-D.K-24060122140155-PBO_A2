/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantutorial;

/**
 *
 * @author Johanes D.K
 */
public class TestSenjata {
    
    public static void main(String[] args){
        Senjata AK47 = new Senjata("TAR!",5);
        System.out.println("jumlah peluru AK47: "+ AK47.tembak);
        System.out.println("AK47 mengisi peluru");
        AK47.setJumlahpeluru(5);
        System.out.println("Jumlah peluru AK47: " +AK47.tembak);
        
        System.out.println("AK47 menembak");
        AK47.menembak("TAR");
    }
    
}
