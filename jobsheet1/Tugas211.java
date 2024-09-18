import java.util.Scanner;

public class Tugas211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("Program Menghitung Rumus Fisika");
            System.out.println("=================================");
            System.out.println("Pilih rumus yang akan dihitung:");
            System.out.println("1. Rumus Kecepatan (v = s / t)");
            System.out.println("2. Rumus Jarak (s = v * t)");
            System.out.println("3. Rumus Waktu (t = s / v)");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hitungKecepatan(scanner);
                    break;
                case 2:
                    hitungJarak(scanner);
                    break;
                case 3:
                    hitungWaktu(scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }

    public static void hitungKecepatan(Scanner scanner) {
        System.out.println("Rumus Kecepatan (v = s / t)");
        System.out.print("Masukkan jarak (s): ");
        double s = scanner.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double t = scanner.nextDouble();

        double v = s / t;
        System.out.println("Kecepatan (v) = " + v);
    }

    public static void hitungJarak(Scanner scanner) {
        System.out.println("Rumus Jarak (s = v * t)");
        System.out.print("Masukkan kecepatan (v): ");
        double v = scanner.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double t = scanner.nextDouble();

        double s = v * t;
        System.out.println("Jarak (s) = " + s);
    }

    public static void hitungWaktu(Scanner scanner) {
        System.out.println("Rumus Waktu (t = s / v)");
        System.out.print("Masukkan jarak (s): ");
        double s = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double v = scanner.nextDouble();

        double t = s / v;
        System.out.println("Waktu (t) = " + t);
    }
}
