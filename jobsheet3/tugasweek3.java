/**
 * tugasweek3
 */
public class tugasweek3 {
    public static void main(String[] args) {
        class Mahasiswa {
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

    }
}