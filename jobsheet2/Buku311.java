public class Buku311 {
    public String judul;
    public String pengarang;
    public int halaman;
    public int stok;
    public int harga;

    public Buku311() {
        judul = "Today Ends Tomorow comes";
        pengarang = "Denanda putri";
        halaman = 198;
        stok = 13;
        harga = 71000;
    }

    public Buku311(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    public void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println(judul + " terjual sebanyak " + jml + " buah.");
            System.out.println("Stok saat ini: " + stok);
        } else {
            System.out.println("Maaf stok sudah habis, tidak dapat melakukan penjualan");
        }
    }

    public void restock(int n) {
        stok += n;
    }

    public int gantiHarga(int hargaBaru) {
        harga = hargaBaru;
        return harga;
    }

    public int hitungHargaTotal(int jumlahTerjual) {
        return harga * jumlahTerjual;
    }

    public int hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            return (int) (hargaTotal * 0.12);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return (int) (hargaTotal * 0.05);
        } else {
            return 0;
        }
    }

    public int hitungHargaBayar(int hargaTotal, int diskon) {
        return hargaTotal - diskon;
    }
}
