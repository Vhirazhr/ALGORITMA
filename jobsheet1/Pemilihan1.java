import java.util.Scanner;

public class Pemilihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        int tugas = input.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int kuis = input.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int uts = input.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int uas = input.nextInt();

        double nilai_akhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        String nilai_huruf;
        if (nilai_akhir >= 80 && nilai_akhir <= 100) {
            nilai_huruf = "A";
        } else if (nilai_akhir >= 73) {
            nilai_huruf = "B+";
        } else if (nilai_akhir >= 65) {
            nilai_huruf = "B";
        } else if (nilai_akhir >= 60) {
            nilai_huruf = "C+";
        } else if (nilai_akhir >= 50) {
            nilai_huruf = "C";
        } else if (nilai_akhir >= 39) {
            nilai_huruf = "D";
        } else {
            nilai_huruf = "E";
        }

        String keterangan = (nilai_huruf.equals("A") || nilai_huruf.equals("B+") || nilai_huruf.equals("B") ||
                nilai_huruf.equals("C+") || nilai_huruf.equals("C")) ? "LULUS" : "TIDAK LULUS";

        System.out.println("Nilai akhir: " + nilai_akhir);
        System.out.println("Nilai huruf: " + nilai_huruf);
        System.out.println("Keterangan: " + keterangan);
    }
}
