import java.util.Scanner;
import java.util.Stack;

public class StrukPembelianMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RestoFakhira resto = new RestoFakhira();
        char pilih;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan Pesanan by Nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Cetak Struk");
            System.out.println("7. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan data pembeli:");
                    System.out.println("\n-------------------------------------");
                    System.out.print("Nama Customer: ");
                    String nama = sc.next();
                    System.out.print("Nomor HP: ");
                    String noHp = sc.next();
                    resto.tambahPembeli(0, nama, noHp);
                    break;
                case 2:
                    resto.tampilkanAntrian();
                    break;
                case 3:
                    resto.hapusAntrian();
                    break;
                case 4:
                    resto.laporanPengurutanPesanan();
                    break;
                case 5:
                    resto.hitungTotalPendapatan();
                    break;
                case 6:
                    resto.tampilkanStruk();
                case 7:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.print("Apakah anda ingin melanjutkan (y/n)? ");
            pilih = sc.next().charAt(0);
        } while (pilih == 'y');

        sc.close();
    }
}
