/*
Mlingkaran.java 18/03/2024
Nama : Johanes D.K
Deskripsi : implementasi cara menghitung luas lingkaran
*/

import java.util.Scanner;

public class Mlingkaran{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("masukkan jari jari lingkaran : ");
        double jejari = scan.nextDouble();
        lingkaran l = new lingkaran(jejari);
        System.out.println("luas lingkaran adalah " +jejari+"satuan adalah " +l.hitungLuas());
    }
}

