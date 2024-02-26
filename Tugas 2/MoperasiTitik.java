/*
File : MoperasiTitik.java 26/02/2024
Penulis : Johanes D.K
NIM : 24060122140155
Deskripsi : Kelas yang berisi program utama MoperasiTitik
*/
public class MoperasiTitik{

    public static void main(String[] args){
        titik t = new titik(4,4);
        operasititik o = new operasititik();

        o.refleksiy(t);
        System.out.println("titik : (" +t.getAbsis()+", " + t.getOrdinat()+")");
        
        o.refleksix(t);
        System.out.println("titik : (" +t.getAbsis()+", " + t.getOrdinat()+")");
        System.out.println("jarak titik :" + o.getJarakPusat(t));

    }
}