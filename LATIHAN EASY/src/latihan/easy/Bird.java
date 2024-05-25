/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.easy;

/**
 *
 * @author Johanes D.K
 */
public class Bird extends Animal implements IFlyer{
    
    @Override
    public void takeOff(){
        System.out.println("bird take off");
    }
    
    @Override
    public void land(){
        System.out.println("bird land");
    }
    
    @Override
    public void fly(){
        System.out.println("bird fly");
    }
    
    @Override
    public void eat(){
        System.out.println("makanan burung");
    }
    
    
}
