/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persondao;

/**
 *
 * @author Johanes D.K
 */
import java.sql.*;
public class MySQLPersonDao implements PersonDao {
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        Class.forName("com.mysql.jdbc.driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost.pbo", "root", "");
        String query = "INSERT INTO person(name)VALUES(' "+name+" ')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}
