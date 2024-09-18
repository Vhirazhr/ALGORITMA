import java.util.Scanner;

/**
 * praktikumdemo004
 */
public class praktikumdemo004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        praktikum003.PersegiPanjang[] arrayofPersegiPanjang = new praktikum003.PersegiPanjang[3];

        for (int i = 0; i < 3; i++) {
            arrayofPersegiPanjang[i] = new praktikum003.PersegiPanjang();

            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            arrayofPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            arrayofPersegiPanjang[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: "
                    + arrayofPersegiPanjang[i].panjang + ", lebar: "
                    + arrayofPersegiPanjang[i].lebar);

        }
    }
}
