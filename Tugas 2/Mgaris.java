
public class Mgaris {
    public static void main(String[] args) {
        titik titik1 = new titik(1, 2);
        titik titik2 = new titik(4, 6);

        garis garis1 = new garis(titik1, titik2);

        System.out.println("Panjang garis: " + garis1.getPanjang());
        System.out.println("Gradien garis: " + garis1.getGradien());

        garis garisrefleksi = garis1.getrefleksiy();
        System.out.println("Garis setelah direfleksikan terhadap sumbu Y: " + garisrefleksi.gettitikAwal().getAbsis() + ", " + garisrefleksi.gettitikAwal().getOrdinat());

        garis garis2 = new garis(new titik(0, 0), new titik(2, -2));
        System.out.println("Garis 1 tegak lurus dengan Garis 2: " + garis1.istegaklurus(garis2));
    }
}