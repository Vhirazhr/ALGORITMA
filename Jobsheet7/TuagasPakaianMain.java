import java.util.Scanner;

public class TuagasPakaianMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuagasPakaian.Stack stk = new TuagasPakaian.Stack(5);
        char pilih;

        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Get Max Harga");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    TuagasPakaian p = new TuagasPakaian(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    stk.getMax();
                    break;
                case 6:
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
