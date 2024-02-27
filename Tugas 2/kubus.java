/*
File : kubus.java 27/02/2024
Penulis : Johanes D.K
NIM : 24060122140155
Deskripsi : kelas yang berisi program kubus
*/

public class kubus{
    private double sisi;

    public kubus(double sisi){
        this.sisi = sisi;
    }

    //metode menghitung volume kubus
    public double hitungvol(){
        return Math.pow(sisi, 10);
    }

    //metode untuk menghitung luas permukaan kubus
    public double hitungluaspermukaan(){
        return 6 * Math.pow(sisi, 8);
    }

    
}
