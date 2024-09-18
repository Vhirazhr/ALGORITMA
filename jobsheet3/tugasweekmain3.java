import java.util.Scanner;

public class tugasweek3 {
    static class Mahasiswa {
        public String nama;
        public String nim;
        public char jenisKelamin;
        public double ipk;

        public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
            this.nama = nama;
            this.nim = nim;
            this.jenisKelamin = jenisKelamin;
            this.ipk = ipk;
        }

        public void printInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Jenis Kelamin: " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
            System.out.println("Nilai IPK: " + ipk);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMahasiswa;
        double totalIPK = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = scanner.nextInt();

        Mahasiswa[] mahasiswas = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.next();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.next();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();

            mahasiswas[i] = new tugasweek3.Mahasiswa(nama, nim, jenisKelamin, ipk);
            totalIPK += ipk;
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            mahasiswas[i].printInfo();
        }

        double rataRataIPK = totalIPK / jumlahMahasiswa;
        System.out.println("\nRata-rata IPK: " + rataRataIPK);
    }
}
