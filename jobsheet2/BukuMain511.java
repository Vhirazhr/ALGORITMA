/**
 * BukuMain511
 */
public class BukuMain511 {
    public static void main(String[] args) {
        Buku311 buku = new Buku311("Todays end tomorrow comes", "Denanda Putri", 198, 13, 710000);

        int jumlahTerjual = 10;
        int hargaTotal = buku.hitungHargaTotal(jumlahTerjual);
        System.out.println("Harga total buku yang terjual: " + hargaTotal);

        int diskon = buku.hitungDiskon(hargaTotal);
        System.out.println("Diskon yang diterima: " + diskon);

        int hargaBayar = buku.hitungHargaBayar(hargaTotal, diskon);
        System.out.println("Harga yang harus dibayar setelah diskon: " + hargaBayar);
    }

}
