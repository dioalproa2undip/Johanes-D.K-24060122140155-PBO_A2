/*
File : Mtitik.java 19/02/2024
Penulis : Johanes D.K
NIM : 24060122140155
Deskripsi : Kelas yang berisi program utama untuk memanfaatkan kelas titik
*/

public class Mtitik{
    public static void main(strin[] args){
        Titik t1,t2,t3;
        t1 = new Titik(); t1.setAbsis(1); t1.setOrdinat(2);
        t2 = new Titik(); t2.setAbsis(3); t2.setOrdinat(4);
        t3 = new Titik(5,6);

        system.out.println("jumlah objek titik  :"+t1.getCounterTitik());
        system.out.println("t1("+t1.getAbsis()+", "+t1.getOrdinat()+")");
        system.out.println("t2("+t2.getAbsis()+", "+t2.getOrdinat()+")");
        system.out.println("t3("+t3.getAbsis()+", "+t3.getOrdinat()+")");
    }
}