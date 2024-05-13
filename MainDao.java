/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persondao;

/**
 *
 * @author Johanes D.K
 */
public class MainDao{
    public static void main(String args[]){
        Person person = new Person("Indra");
        DaoManager m = new DaoManager();
        m.setPersonDao(new MySQLPersonDao());
        try{
            m.getPersonDao().savePerson(person);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
