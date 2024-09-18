import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP semester");
        System.out.println("==============================");

        String[] mataKuliah = { "Pancasila", "Konsep Teknologi Informasi", "CTPS",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum dasar pemograman",
                "Kesehatan & Keselamatan Kerja" };
        double[] nilaiAngka = new double[mataKuliah.length];
        double[] bobotNilai = { 3.5, 4.0, 3.0, 4.0, 4.0, 2.5, 2.5, 4.0 };

        // Input nilai angka untuk setiap mata kuliah
        System.out.println("MASUKKAN NILAI PADA SETIAP MATA KULIAH!");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + " : ");
            nilaiAngka[i] = scanner.nextDouble();
        }

        // Output hasil konversi nilai
        System.out.println("=====================");
        System.out.println("Hasil konversi Nilai");
        System.out.println("=====================");
        System.out.printf("%-30s%-20s%-20s%-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        String[] nilaiHuruf = new String[mataKuliah.length];
        for (int i = 0; i < mataKuliah.length; i++) {
            nilaiHuruf[i] = konversiNilaiAngkaKeHuruf(nilaiAngka[i]);
            System.out.printf("%-30s%-20.2f%-20s%-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        // Hitung IP Semester
        double totalNilaiSetaraSKS = 0;
        int totalSKS = bobotNilai.length;
        for (int i = 0; i < mataKuliah.length; i++) {
            totalNilaiSetaraSKS += nilaiAngka[i] * bobotNilai[i];
        }
        double ipSemester = totalNilaiSetaraSKS / totalSKS;

        // Output IP Semester
        System.out.println("========================");
        System.out.println("IP : " + ipSemester);
    }

    private static String konversiNilaiAngkaKeHuruf(double nilaiAngka) {
        if (nilaiAngka >= 80 && nilaiAngka < 100) {
            return "A";
        } else if (nilaiAngka >= 73 && nilaiAngka < 80) {
            return "B+";
        } else if (nilaiAngka >= 65 && nilaiAngka < 73) {
            return "B";
        } else if (nilaiAngka >= 60 && nilaiAngka < 65) {
            return "C+";
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            return "C";
        } else if (nilaiAngka >= 39 && nilaiAngka < 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
