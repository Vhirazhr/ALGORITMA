import java.util.Scanner;

/**
 * praktikumdemo005
 */
public class praktikumdemo005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        praktikum003.PersegiPanjang[] arrayofPersegiPanjang = new praktikum003.PersegiPanjang[3];
        int panjang, lebar;
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke- " + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayofPersegiPanjang[i] = new praktikum003.PersegiPanjang(panjang, lebar);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: "
                    + arrayofPersegiPanjang[i].panjang + ", lebar: "
                    + arrayofPersegiPanjang[i].lebar);

        }
    }
}