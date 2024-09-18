import java.util.Scanner;

public class mainmodifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("========================================");
            System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
            int elemen = sc.nextInt();

            modifikasi[] png = new modifikasi[elemen];
            for (int i = 0; i < elemen; i++) {
                System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
                int nilai = sc.nextInt();
                System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
                int pangkat = sc.nextInt();
                png[i] = new modifikasi(nilai, pangkat);
            }

            boolean backToMenu = false;
            while (!backToMenu) {
                System.out.println("===================================");
                System.out.println("Pilih metode yang ingin dijalankan:");
                System.out.println("1. Pangkat dengan Brute Force");
                System.out.println("2. Pangkat dengan Divide and Conquer");
                System.out.println("3. Kembali ke Input");
                System.out.println("4. Keluar");
                System.out.print("Masukkan pilihan Anda: ");
                int pilihan = sc.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("===================================");
                        System.out.println("Hasil Pangkat Dengan Brute Force");
                        for (int i = 0; i < elemen; i++) {
                            System.out.println("Nilai " + png[i].nilai() + " pangkat " + png[i].Pangkat() + " adalah : "
                                    + png[i].pangkatBF());
                        }
                        break;
                    case 2:
                        System.out.println("===================================");
                        System.out.println("Hasil Pangkat Dengan Divide and Conquer");
                        for (int i = 0; i < elemen; i++) {
                            System.out.println("Nilai " + png[i].nilai() + " pangkat " + png[i].Pangkat() + " adalah : "
                                    + png[i].pangkatDC());
                        }
                        break;
                    case 3:
                        backToMenu = true;
                        break;
                    case 4:
                        exit = true;
                        backToMenu = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            }
        }
        sc.close();
    }
}
