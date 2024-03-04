/*
File :asersi2.java
Deskripsi : program untuk menunjukkan asersi
Nama : Johanes D.K
NIM : 24060122140155
*/

//class Lingkaran
class Lingkaran{
  private double jariJari;
  public Lingkaran(double jariJari){
    this.jariJari = jariJari;
  }
  public double hitungKeliling(){
    double keliling = 2*Math.PI*jariJari;
    return keliling;
  }
}

//class asersi2
public class asersi2{
  public static void main(String[] args){
    double jariJari = 5;
    assert(jariJari>0):"jari jari tidak boleh nol!!!";
    Lingkaran l = new Lingkaran(jariJari);
    double kelilingLingkaran = l.hitungKeliling();
    System.out.println("keliling lingkaran = "+kelilingLingkaran);
  }
}

// tidak ada 