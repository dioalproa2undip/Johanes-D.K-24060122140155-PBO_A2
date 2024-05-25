/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johanes D.K
 */
public class LATIHANEASY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<IFlyer> koleksiBisaTerbang;
        koleksiBisaTerbang = new ArrayList<>();
        
        IFlyer superman = new Superman("superman");
        IFlyer superboy = new Superman("superboy");
        IFlyer supergirl = new Superman("supergirl");
        IFlyer merpati = new Bird();
        IFlyer eagle = new Bird();
        
        koleksiBisaTerbang.add(merpati);
        koleksiBisaTerbang.add(eagle);
        koleksiBisaTerbang.add(superman);
        koleksiBisaTerbang.add(supergirl);
        koleksiBisaTerbang.add(superboy);
        
        for (IFlyer bisaTerbang : koleksiBisaTerbang){
            if(bisaTerbang instanceof Superman){
                System.out.println("I'm " +((Superman)bisaTerbang).getName());
                System.out.println("Bangsa :" + bisaTerbang.getClass().getSuperclass().getSimpleName());
                System.out.print("Makan: " );
                ((Animal) bisaTerbang).eat();
                System.out.println("");
            }else{
                System.out.println("I'm " +bisaTerbang.getClass().getSimpleName());
                System.out.println("Bisa Terbang ");
                System.out.print("Makan: ");
                ((Animal)bisaTerbang).eat();
                System.out.println("");
                        
            }
        }
    }
    
}
