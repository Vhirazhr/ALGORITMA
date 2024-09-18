/**
 * BukuMain411
 */
public class BukuMain411 {

    public static void main(String[] args) {
        Buku211 bukuZahra = new Buku211("Algoritma asik", "Albert", 100, 10, 50000);
        bukuZahra.terjual(7);
        bukuZahra.tampilInformasi();
        bukuZahra.terjual(3);
        bukuZahra.tampilInformasi();
        bukuZahra.terjual(5);

    }
}