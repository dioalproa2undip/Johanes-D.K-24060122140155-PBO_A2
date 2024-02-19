/*
File : MtitikOver.java 19/02/2024
Penulis : Johanes D.K
NIM : 24060122140155
Deskripsi : Kelas yang berisi program utama untuk memanfaatkan kelas titik dengan overloading konstruktor
*/

public class MTitikOver{
    public static void main(String[] args){
        titik t1,t2,t3;
        t1 = new titik(); t1.setAbsis(1); t1.setOrdinat(2);
        t2 = new titik(); t2.setAbsis(3); t2.setOrdinat(4);
        t3 = new titik(); t3.setAbsis(5); t3.setOrdinat(6);

        System.out.println("jumlah objek titik  :"+t1.getCounterTitik());
        System.out.println("t1("+t1.getAbsis()+", "+t1.getOrdinat()+")");
        System.out.println("t2("+t2.getAbsis()+", "+t2.getOrdinat()+")");
        System.out.println("t3("+t3.getAbsis()+", "+t3.getOrdinat()+")");
    }
}