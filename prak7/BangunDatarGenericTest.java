/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak7;

/**
 *
 * @author Johanes D.K
 */
public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran 1 = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = 
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(1);
        System.out.println("Keliling lingkaran : " +bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get(). getClass().getName());
        
        
    }
    
}
