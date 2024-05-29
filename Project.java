/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Johanes D.K
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Map<String, String> mahasiswa = new HashMap<>();
       mahasiswa.put("24060122142422", "Prima");
       mahasiswa.put("24060133124204", "Alez");
       mahasiswa.put("240601342124", "Cia");
       
       mahasiswa.forEach((nim, nama) -> System.out.println("NIM :" + nim + ", Nama:" + nama));
    }
    
}
