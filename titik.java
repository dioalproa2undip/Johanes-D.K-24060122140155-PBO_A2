/*
Jenis File : titik.java 19/01/2024
Nama : Johanes D.K
NIM : 24060122140155
Deskripsi : Kelas Titik
*/



class titik{
    double absis;
    double ordinat;
    static int counterTitik;

    public titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    public titik (double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }
    void setAbsis(double x){
        this.absis =x;
    }
    void setOrdinat(double y){
        this.ordinat = y;
    }
    double getAbsis(){
        return this.absis;
    }
    double getOrdinat(){
        return this.ordinat;
    }
    static double getCounterTitik(){
        return counterTitik;
    }
}