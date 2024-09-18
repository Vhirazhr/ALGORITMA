public class Buku11 {
    public String judul;
    public String pengarang;
    public int halaman;
    public int stok;
    public int harga;

    public Buku11(String judul, String pengarang, int halaman, int stok, int harga) {
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
        stok -= jml;
    }

    public void restock(int n) {
        stok += n;
    }

    public int gantiHarga(int hargaBaru) {
        harga = hargaBaru;
        return harga;
    }
}
