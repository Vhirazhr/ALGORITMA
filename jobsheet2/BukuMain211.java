/**
 * BukuMain211
 */
public class BukuMain211 {

    public static void main(String[] args) {
        Buku211 buku = new Buku211("my Champion", "Tereliye", 100, 15, 100000);
        buku.tampilInformasi();
        buku.terjual(5);
        buku.tampilInformasi();
        buku.terjual(10);
        buku.tampilInformasi();
        buku.terjual(10);
    }
}