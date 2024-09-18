import java.util.Scanner;

class TugasMahasiswa {
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;

    public TugasMahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
    }
}