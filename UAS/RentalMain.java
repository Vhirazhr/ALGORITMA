import java.util.Scanner;

public class RentalMain {
    public static final int MAX_ITEMS = 100;
    public Rental10[] rentalItemsList = new Rental10[MAX_ITEMS];
    public Rental10.TransaksiRental[] rentalTransactionList = new Rental10.TransaksiRental[MAX_ITEMS];
    public int vehicleCount = 0;
    public int transactionCount = 0;
    public Scanner scanner = new Scanner(System.in);

    public void tampilkanMenu() {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Buat Transaksi");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Keluar");
            System.out.print("Pilih (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    daftarKendaraan();
                    break;
                case 2:
                    buatTransaksiBaru();
                    break;
                case 3:
                    tampilkanSeluruhTransaksi();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private void daftarKendaraan() {
        if (vehicleCount >= MAX_ITEMS) {
            System.out.println("Daftar kendaraan sudah penuh.");
            return;
        }

        System.out.print("Nomor TNKB: ");
        String nomorTNKB = scanner.nextLine();
        System.out.print("Nama Kendaraan: ");
        String namaKendaraan = scanner.nextLine();
        System.out.print("Jenis Kendaraan: ");
        String jenisKendaraan = scanner.nextLine();
        System.out.print("Tahun Produksi: ");
        int tahunProduksi = scanner.nextInt();
        System.out.print("Biaya Sewa per Jam: ");
        int biayaSewaPerJam = scanner.nextInt();
        scanner.nextLine();

        rentalItemsList[vehicleCount] = new Rental10(nomorTNKB, namaKendaraan, jenisKendaraan, tahunProduksi,
                biayaSewaPerJam);
        vehicleCount++;
    }

    private void buatTransaksiBaru() {
        System.out.print("Nama Peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Nomor TNKB Kendaraan: ");
        String nomorTNKB = scanner.nextLine();
        System.out.print("Durasi Pinjam (jam): ");
        int durasiPinjam = scanner.nextInt();
        scanner.nextLine();

        Rental10 kendaraan = cariKendaraanBerdasarkanTNKB(nomorTNKB);
        if (kendaraan == null) {
            System.out.println("Kendaraan tidak ditemukan.");
            return;
        }

        rentalTransactionList[transactionCount] = kendaraan.new TransaksiRental(namaPeminjam, durasiPinjam, kendaraan);
        transactionCount++;
    }

    private Rental10 cariKendaraanBerdasarkanTNKB(String nomorTNKB) {
        for (int i = 0; i < vehicleCount; i++) {
            if (rentalItemsList[i].getNomorTNKB().equals(nomorTNKB)) {
                return rentalItemsList[i];
            }
        }
        return null;
    }

    private void tampilkanSeluruhTransaksi() {
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(rentalTransactionList[i].getInfoTransaksi());
        }
    }

    public static void main(String[] args) {
        RentalMain rentalMain = new RentalMain();
        rentalMain.tampilkanMenu();
    }
}
