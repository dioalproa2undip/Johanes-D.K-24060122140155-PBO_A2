/*
File : angkasial.java
Deskripsi : program penggunaan exception buatan sendiri pengenalan klausa throw dan throws
Nama : Johanes D.K
NIM : 24060122140155
*/

public class angkasial{
    public void cobaAngka(int angka) throws angkasialexception{
        if(angka == 13){
            throw new angkasialexception();
        }
        System.out.println(angka+"bukan angka sial");

    }
    public static void main(String[] args){
        angkasial as = new angkasial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(angkasialexception ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati hati masukan angka !!!");
        }
    }
}

// tidak
// pada baris 21 di eksekusi ketika memasukan angka 13 muncul hati hati masukan angka