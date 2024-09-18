public class Kuis1_FakhiraZahrany10 {
    public static class Obat1 {
        public String nama;
        public String kategori;
        public int stok;
        public int jumlahTerjual;

        public Obat1(String nama, int stok, String kategori, int jumlahTerjual) {
            this.nama = nama;
            this.stok = stok;
            this.kategori = kategori;
            this.jumlahTerjual = jumlahTerjual;
        }

        public int hitungSisa() {
            return this.stok - this.jumlahTerjual;
        }

        public void tampil() {
            System.out.println("Nama: " + this.nama);
            System.out.println("Kategori: " + this.kategori);
            System.out.println("Stok: " + this.stok);
            System.out.println("Jumlah Terjual: " + this.jumlahTerjual);
            System.out.println("Sisa: " + this.hitungSisa());
        }
    }
}