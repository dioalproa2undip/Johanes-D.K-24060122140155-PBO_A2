/*
Jenis File : titik.java 19/01/2024
Nama : Johanes D.K
NIM : 24060122140155
*/



class titik{
    private double absis;
    private double ordinat;
    static int counterTitik;
    static int jarakpusat;

    public titik() {
        this(0,0);
    }
    public titik(double x, double y ){
        this.absis = 0;
        this.ordinat = 0;
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
    
