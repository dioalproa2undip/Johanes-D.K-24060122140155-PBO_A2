/*
Mbujursangkar.java 18/03/2024
nama : Johanes D.K
deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

class Mbujursangkar{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        bujursangkar bs = new bujursangkar();
        System.out.println("masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("luas bujur sangkar dengan sisi" +sisi+"satuan adalah" +bs.hitungLuas(sisi));
    }
}