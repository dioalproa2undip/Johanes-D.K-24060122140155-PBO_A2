
public class operasititik{

    private void refleksisumbux(titik titik){
        double y = titik.getOrdinat();

        y = -1;
        titik.setOrdinat(y);
    }
    public double getJarakPusat(titik titik){
        double x = titik.getAbsis();
        double y = titik.getOrdinat();

        double jarakpusat=Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        return jarakpusat;
    }
    
    private void  refleksisumbuy(titik titik){
        double x = titik.getAbsis();

        x *= -1;
        titik.setAbsis(x);
    }
    
    public titik refleksix(titik titik){
        refleksisumbux(titik);
        return titik;
    }

    public titik refleksiy(titik titik){
        refleksisumbuy(titik);
        return titik;
    }
}