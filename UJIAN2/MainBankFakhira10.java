import java.util.Scanner;

public class MainBankFakhira10 {
    public BankFakhira10.Akun[] daftarAkun = new BankFakhira10.Akun[100];
    public int jumlahAkun = 0;
    public Scanner scanner = new Scanner(System.in);
    public BankFakhira10 bank = new BankFakhira10();

    public void run() {
        while (true) {
            System.out.println("=== Sistem Informasi Perbankan ===");
            System.out.println("1. Masukkan Data Akun");
            System.out.println("2. Tampilkan Data Akun");
            System.out.println("3. Urutkan Data Akun Berdasarkan Saldo");
            System.out.println("4. Cari Data Akun Berdasarkan Nomor Rekening");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    masukkanDataAkun();
                    break;
                case 2:
                    tampilkanDataAkun();
                    break;
                case 3:
                    urutkanDataAkunBerdasarkanSaldo();
                    break;
                case 4:
                    cariDataAkunBerdasarkanNomorRekening();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    public void masukkanDataAkun() {
        System.out.println("Masukkan informasi akun:");
        System.out.print("Nomor Rekening: ");
        String nomorRekening = scanner.next();
        System.out.print("Nama: ");
        String nama = scanner.next();
        System.out.print("Nomor Telepon: ");
        String phone = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Saldo: %.2f\n", saldo);
        BankFakhira10.Akun akun = bank.new Akun(nomorRekening, nama, phone, email, saldo);
        daftarAkun[jumlahAkun] = akun;
        jumlahAkun++;

        System.out.println("Data akun berhasil dimasukkan.");
    }

    public void tampilkanDataAkun() {
        System.out.println("Data Akun:");
        for (int i = 0; i < jumlahAkun; i++) {
            daftarAkun[i].tampilkanData();
            System.out.println();
        }
    }

    public void urutkanDataAkunBerdasarkanSaldo() {
        System.out.println("Data Akun Setelah Diurutkan Berdasarkan Saldo:");

        for (int i = 0; i < jumlahAkun - 1; i++) {
            for (int j = 0; j < jumlahAkun - i - 1; j++) {
                if (daftarAkun[j].getSaldo() > daftarAkun[j + 1].getSaldo()) {
                    BankFakhira10.Akun temp = daftarAkun[j];
                    daftarAkun[j] = daftarAkun[j + 1];
                    daftarAkun[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < jumlahAkun; i++) {
            daftarAkun[i].tampilkanData();
            System.out.println();
        }
    }

    public void cariDataAkunBerdasarkanNomorRekening() {
        System.out.print("Masukkan nomor rekening yang ingin dicari: ");
        String nomorRekeningCari = scanner.next();
        BankFakhira10.Akun akunDitemukan = cariAkunByNomorRekening(nomorRekeningCari);
        if (akunDitemukan != null) {
            System.out.println("Data akun dengan nomor rekening " + nomorRekeningCari + " ditemukan:");
            akunDitemukan.tampilkanData();
        } else {
            System.out.println("Data akun dengan nomor rekening " + nomorRekeningCari + " tidak ditemukan.");
        }
    }

    public BankFakhira10.Akun cariAkunByNomorRekening(String nomorRekening) {
        for (int i = 0; i < jumlahAkun; i++) {
            if (daftarAkun[i].getNomorRekening().equals(nomorRekening)) {
                return daftarAkun[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MainBankFakhira10 bankingSystem = new MainBankFakhira10();
        bankingSystem.run();
    }
}
