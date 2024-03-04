/*
File :asersi1.java
Deskripsi : program untuk menunjukkan asersi
Nama : Johanes D.K
NIM : 24060122140155
*/

public class asersi1{
    public static void main(String[] args){
        int x = 0;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}