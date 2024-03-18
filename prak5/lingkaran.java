/*
lingkaran.java 18/03/2024
Nama : Johanes D.K
deskripsi : kelas implementasi Iarea berupa cara menghitung luas lingkaran
*/

import static java.lang.Math.PI;

class lingkaran implements Iarea{
    private double jejari;

    public lingkaran(double r){
        jejari = r;
    }
    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}