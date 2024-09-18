import java.util.Scanner;

public class Tugas111 {
    public static void main(String[] args) {

        char[] KODE = { 'a', 'b', 'd', 'e', 'f', 'g', 'h', 'l', 'n', 't' };

        String[][] KOTA = {
                { "Banten" },
                { "Jakarta" },
                { "Bandung" },
                { "Cirebon" },
                { "Bogor" },
                { "Pekalongan" },
                { "Semarang" },
                { "Surabaya" },
                { "Malang" },
                { "Tegal" }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        char kode = scanner.next().charAt(0);

        // Mencari indeks kode plat mobil di array KODE
        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                index = i;
                break;
            }
        }

        // Menampilkan nama kota jika kode plat mobil ditemukan
        if (index != -1) {
            System.out.println("Kota: " + KOTA[index][0]);
        } else {
            System.out.println("Kode plat mobil tidak valid.");
        }

        scanner.close();
    }
}
