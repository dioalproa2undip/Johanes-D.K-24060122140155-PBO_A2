/*
File : Exceptiononarray.java
Deskripsi : program penggunaan eksepsi menggunakan class library java
Nama : johanes d.k
Nim : 24060122140155
*/

public class Exceptiononarray{
    public static void main (String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}