import java.util.Scanner;

public class praktikumdemo007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegiPanjang = sc.nextInt();

        praktikum003.PersegiPanjang[] arrayofPersegiPanjang = new praktikum003.PersegiPanjang[jumlahPersegiPanjang];
        int panjang, lebar;

        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayofPersegiPanjang[i] = new praktikum003.PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + arrayofPersegiPanjang[i].panjang
                    + ", lebar : " + arrayofPersegiPanjang[i].lebar + ", luas : "
                    + arrayofPersegiPanjang[i].hitungLuas()
                    + ", keliling : " + arrayofPersegiPanjang[i].hitungKeliling());
        }

    }
}
