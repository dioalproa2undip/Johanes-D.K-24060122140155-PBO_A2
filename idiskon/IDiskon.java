/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiskon;

/**
 *
 * @author Johanes D.K
 */
interface IDiskon {
    public double hitungDiskon(int harga);
}
public class DiskonLambda {
    public static void main(String[] args){
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3 );
            }
        };
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka :"+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon lebaran :"+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Biasa :"+diskonBiasa.hitungDiskon(45000));
    }
}
    

