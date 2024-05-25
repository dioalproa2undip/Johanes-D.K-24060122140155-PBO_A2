/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.easy;

/**
 *
 * @author Johanes D.K
 */
public class Superman extends Kryptonian {
    private String name;
    
    public Superman(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void takeOff(){
        System.out.println(name + " takeoff");
    }
    
    @Override
    public void land(){
        System.out.println(name + " land");
    }
    
    @Override
    public void fly(){
        System.out.println(name + " fly");
    }
    
    @Override
    public void eat(){
        System.out.println("Nasi Goreng");
    }
    
    
}
