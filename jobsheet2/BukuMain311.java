/**
 * BukuMain311
 */
public class BukuMain311 {

    public static void main(String[] args) {
        Buku211 bk1 = new Buku211();
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        bk1.terjual(8);
        bk1.tampilInformasi();
        bk1.terjual(5);

        Buku211 bk2 = new Buku211("Self reward", "Mahera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        bk2.terjual(18);
        bk2.tampilInformasi();
        bk2.terjual(5);
    }
}