/*
File  : bangundatar.java 18/03/2024
Nama : Johanes D.K
Deskripsi : kelas abstrak, berisi abstraksi bangun datar
*/

public abstract class bangundatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }
    public double getLuas(){
        return luas;
    }
}