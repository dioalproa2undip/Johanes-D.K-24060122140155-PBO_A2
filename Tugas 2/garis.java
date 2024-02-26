/* 
File : garis.java 26/02/2024
Penulis : Johanes D.K
NIM : 24060122140155
Deskripsi : Kelas yang berisi program utama untuk membuat garis
*/

public class garis{
    private titik titikAwal;
    private titik titikAkhir;

    //konstruktor
    public garis(titik titikAwal, titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public titik gettitikAwal(){
        return titikAwal;
    }

    public void  setitikAwal(titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public titik gettitikAkhir(){
        return titikAkhir;
    }
    
    public void settitikAkhir(){
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang(){
        double deltax= titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltay= titikAkhir.getOrdinat()- titikAkhir.getOrdinat();
        return Math.sqrt(Math.pow(deltax, 2) + Math.pow(deltay, 2));
    }

    public double getGradien(){
        double deltay = titikAkhir.getOrdinat()- titikAwal.getOrdinat();
        double deltax = titikAkhir.getAbsis()- titikAkhir.getAbsis();
        return deltay/deltax;
    }

    public garis getrefleksiy(){
        titik titikAwalrefleksi= new titik(-titikAwal.getAbsis(), titikAwal.getOrdinat());
        titik titikAkhirrefleksi= new titik(-titikAkhir.getAbsis(), titikAkhir.getOrdinat());
        return new garis (titikAwalrefleksi, titikAkhirrefleksi);
    }  

    public boolean istegaklurus(garis g){
        double gradien1= this.getGradien();
        double gradien2= this.getGradien();

        //garis tegak lurus jika perkalian gradien kedua garis adalah -1
        return Math.abs(gradien1 * gradien2) == -1;
    }
    
}
