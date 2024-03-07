public class KeranjangObat{

    private String[] keranjang;
    private int indexKeranjang;

    public KeranjangObat() {
        keranjang = new String[5];
        indexKeranjang = 0;
    }

    public void tambahObat(String obat) {
        // TO DO : Tambahkan logika untuk menambahkan obat ke dalam keranjang
        // Berikan asersi jika keranjang sudah penuh (jumlah obat mencapai batas)

        assert (indexKeranjang >= 5):"jumlah obat mencapai batas";
        
        if (indexKeranjang < 5){
            keranjang[indexKeranjang] = obat;
            indexKeranjang++;
        } else {
            System.out.println("jumlah obat mencapai batas;");
        }

    }

    public void tampilkanObat() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }

}