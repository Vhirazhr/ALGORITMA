public class Rental10 {
    public String nomorTNKB;
    public String namaKendaraan;
    public String jenisKendaraan;
    public int tahunProduksi;
    public int biayaSewaPerJam;

    public Rental10(String nomorTNKB, String namaKendaraan, String jenisKendaraan, int tahunProduksi,
            int biayaSewaPerJam) {
        this.nomorTNKB = nomorTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahunProduksi = tahunProduksi;
        this.biayaSewaPerJam = biayaSewaPerJam;
    }

    public String getNomorTNKB() {
        return nomorTNKB;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public int getBiayaSewaPerJam() {
        return biayaSewaPerJam;
    }

    public String getInfoKendaraan() {
        return "Nomor TNKB: " + nomorTNKB + ", Nama Kendaraan: " + namaKendaraan + ", Jenis Kendaraan: "
                + jenisKendaraan + ", Tahun: " + tahunProduksi + ", Biaya Sewa per Jam: " + biayaSewaPerJam;
    }

    public class TransaksiRental {
        private String namaPeminjam;
        private int durasiPinjam;
        private Rental10 kendaraanDisewa;

        public TransaksiRental(String namaPeminjam, int durasiPinjam, Rental10 kendaraanDisewa) {
            this.namaPeminjam = namaPeminjam;
            this.durasiPinjam = durasiPinjam;
            this.kendaraanDisewa = kendaraanDisewa;
        }

        public String getNamaPeminjam() {
            return namaPeminjam;
        }

        public int getDurasiPinjam() {
            return durasiPinjam;
        }

        public Rental10 getKendaraanDisewa() {
            return kendaraanDisewa;
        }

        public String getInfoTransaksi() {
            return "Peminjam: " + namaPeminjam + ", Kendaraan: " + kendaraanDisewa.getNamaKendaraan() + ", Durasi: "
                    + durasiPinjam + " jam, Total Biaya: " + (durasiPinjam * kendaraanDisewa.getBiayaSewaPerJam());
        }
    }
}
