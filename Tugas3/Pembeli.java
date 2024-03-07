public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;

    public Pembeli(String nama) {
        this.nama = nama;
        keranjangObat = new Obat[5];
        jumlahObat = 0;
    }

    public String getNama() {
        return nama;
    }

    public Obat[] getKeranjangObat() {
        return keranjangObat;
    }

    public int getJumlahObat() {
        return jumlahObat;
    }

    public void beliObat(Obat obat) throws BatasObatPenuhException, ObatTidakTersediaException {
        // TODO 2: Implementasikan try-catch untuk handling exception saat pembelian obat
        // TODO 3: Buat dua blok catch yaitu ketika jumlah obat sudah mencapai batas dan ketika obat tidak tersedia

        try{
            if (jumlahObat >= keranjangObat.length){
                throw new BatasObatPenuhException("Jumlah Obat yang anda beli, sudah melebihi batas.\n");
            }

            if (obat.isTersedia() == false){
                throw new ObatTidakTersediaException(obat.getNama() + " tidak tersedia.\n");
            }

            obat.setTersedia(false);
            keranjangObat[jumlahObat] = obat;
            jumlahObat++;
        } catch (BatasObatPenuhException err){
            System.out.println(err.getMessage());
        } catch (ObatTidakTersediaException err){
            System.out.println(err.getMessage());
        }
        
    }
}
