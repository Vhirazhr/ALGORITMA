import java.util.Scanner;
import java.util.Stack;

class StrukPembelian {
    String nama;
    String nohp;

    StrukPembelian(String nama, String nohp) {
        this.nama = nama;
        this.nohp = nohp;
    }
}

class Pesanan {
    int kode;
    String nama;
    int harga;
    int denda;

    Pesanan(int kode, String nama, int harga, int denda) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.denda = denda;
    }
}

class RestoFakhira {
    Stack<StrukPembelian> antrian;
    Stack<Pesanan> pesanan;

    RestoFakhira() {
        this.antrian = new Stack<>();
        this.pesanan = new Stack<>();
    }

    void tambahPembeli(int nomorAntrian, String nama, String nohp) {
        StrukPembelian pembeliBaru = new StrukPembelian(nama, nohp);
        this.antrian.push(pembeliBaru);
    }

    // void tambahPesanan(int kode, String nama, int harga) {
    // Pesanan pesananBaru = new Pesanan(kode, nama, harga);
    // this.pesanan.push(pesananBaru);
    // }

    void tampilkanStruk() {
        System.out.println("======= QUIZ 2 Praktikum ASD SIB 1G=========");
        System.out.println("dibuat oleh = fakhira zahra");
        System.out.println("nim = 2341760172");
        System.out.println("absen = 10");
        System.out.println("============================================");
        System.out.println("Sistem Antrian Resto Fakhira");
        System.out.println("Daftar Pembeli:");
        for (int i = 0; i < this.antrian.size(); i++) {
            StrukPembelian pembeli = this.antrian.get(i);
            System.out.println((i + 1) + ". Nama: " + pembeli.nama + ", No. HP: " + pembeli.nohp);
        }
        System.out.println("Daftar Pesanan:");
        for (Pesanan pesanan : this.pesanan) {
            System.out.println("Kode Pesanan: " + pesanan.kode + ", Nama Pesanan: " + pesanan.nama + ", Harga: "
                    + pesanan.harga + ", Denda: " + pesanan.denda);
        }
        System.out.println("============================================");
    }

    void tampilkanAntrian() {
        System.out.println("-----------------------------------");
        System.out.println("Daftar Antrian Resto Royal Delish");
        System.out.println("-----------------------------------");
        System.out.println("No\tNama Customer\t\tNo HP");
        for (int i = 0; i < this.antrian.size(); i++) {
            StrukPembelian pembeli = this.antrian.get(i);
            System.out.println((i + 1) + "\t" + pembeli.nama + "\t\t" + pembeli.nohp);
        }
        System.out.println("Total Antrian: " + this.antrian.size());
        System.out.println("-----------------------------------");
    }

    void hapusAntrian() {
        if (!this.antrian.isEmpty()) {
            this.antrian.pop();
            System.out.println("Antrian teratas berhasil dihapus.");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    void laporanPengurutanPesanan() {
    }

    void hitungTotalPendapatan() {

    }
}
