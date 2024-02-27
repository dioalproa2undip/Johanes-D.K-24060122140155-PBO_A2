/*
File : jualproduk.java 27/02/2024
Penulis : Johanes D.K
NIM : 24060122140155
Deskripsi : kelas program yang berisi produk dan penjual
*/

public class penjual {
    private String nama;
    private String alamat;
    private String notelp;

    public penjual(String nama, String alamat, String notelp){
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }
    
    // aksesor (getter dan setter)
    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public String getalamat(){
        return alamat;
    }
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    public String getnotelp(){
        return getnotelp;
    }
    public void setnotelp(String notelp){
        this.notelp = notelp;
    }

    // metode untuk mendapatkan informasi penjual
    public String getInfopenjual(){
        return "penjual: " + nama + "\nalamat: " + alamat + "\notelp" + notelp;
    }
}
    public class produk{
        private String nama;
        private double harga;
        private int stok;
        private String deskripsi;
        private penjual penjual;// hub agregasi

        public produk(String nama, double harga, int stok, String deskripsi, penjual penjual){
            this.nama = nama;
            this.harga = harga;
            this.stok = stok;
            this.deskripsi = deskripsi;
            this.penjual = penjual;
        }
        //aksesor get dan set
        public String getnama(){
            return nama;
        }
        public void setnama(String nama){
            this.nama = nama;
        }
        public double getharga(){
            return harga;
        }
        public void setharga(double harga){
            this.harga = harga;
        }
        public int getstok(){
            return stok;
        }
        public void setstok(void stok){
            this.stok = stok;
        }
        public String getdeskripsi(){
            return deskripsi;
        }
        public void setdeskripsi(String deskripsi){
            this.deskripsi = deskripsi;
        }
        //metode mendapatkan informasi produk 
        public String getInfoproduk(){
            return "produk: " + nama + "\nharga: " + harga + "\nstok: " + stok + "\ndeskripsi: " + deskripsi;
        }
        public penjual getpenjual() {
            return penjual;
        }
    }
