/*
File : Mkubus.java 27/02/2024
Penulis : Johanes D.K
NIM : 24060122140155
Deskripsi : Kelas main 
*/

public class Mkubus{

    public static void main(String[] args){
        kubus kubus1 = new kubus(4);

        double volumekubus1 = kubus1.hitungvol();
        System.out.println("volume kubus1: " + volumekubus1);

        double luaspermukaankubus1 = kubus1.hitungluaspermukaan();
        System.out.println("luas permukaan kubus1" + luaspermukaankubus1);
    }
}