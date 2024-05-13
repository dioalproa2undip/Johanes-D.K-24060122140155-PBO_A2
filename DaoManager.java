/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persondao;

/**
 *
 * @author Johanes D.K
 */
public class DaoManager {
    private PersonDao personDao;
    
    public void setPersonDao(PersonDao person){
        personDao = person;
    }
    public PersonDao getPersonDao(){
        return personDao;
    }
}
