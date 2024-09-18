import java.util.Scanner;
public class TugasMahasiswaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        TugasMahasiswa[] mahasiswa = new TugasMahasiswa[jumlahMahasiswa];
        double totalIPK = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.next();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.next();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();

            mahasiswa[i] = new TugasMahasiswa(nama, nim, jenisKelamin, ipk);
            totalIPK += ipk;
        }

        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            mahasiswa[i].tampilkanInfo();
        }

        double rataRataIPK = totalIPK / jumlahMahasiswa;
        System.out.println("\nRata-rata IPK: " + rataRataIPK);

        scanner.close();
    }
}