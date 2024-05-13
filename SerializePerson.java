/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persondao;

/**
 *
 * @author Johanes D.K
 */
import java.io.*;
public class SerializePerson {
    class Person implements Serializable{
        private String name;
        public Person(String n){
            name = n;
        }
        public String getName(){
            return name;
        }
    }
}
