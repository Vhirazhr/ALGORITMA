/**
 * praktikumdemo003
 */
public class praktikumdemo003 {

        public static void main(String[] args) {
                praktikum003.PersegiPanjang[] arrayofPersegiPanjang = new praktikum003.PersegiPanjang[3];

                arrayofPersegiPanjang[0] = new praktikum003.PersegiPanjang();
                arrayofPersegiPanjang[0].panjang = 110;
                arrayofPersegiPanjang[0].lebar = 30;

                arrayofPersegiPanjang[1] = new praktikum003.PersegiPanjang();
                arrayofPersegiPanjang[1].panjang = 80;
                arrayofPersegiPanjang[1].lebar = 40;

                arrayofPersegiPanjang[2] = new praktikum003.PersegiPanjang();
                arrayofPersegiPanjang[2].panjang = 100;
                arrayofPersegiPanjang[2].lebar = 20;

                System.out.println("Persegi panjang ke-1, panjang: " + arrayofPersegiPanjang[0].panjang + ", lebar: "
                                + arrayofPersegiPanjang[0].lebar);
                System.out.println("Persegi panjang ke-2, panjang: " + arrayofPersegiPanjang[1].panjang + ", lebar: "
                                + arrayofPersegiPanjang[1].lebar);
                System.out.println("Persegi panjang ke-3, panjang: " + arrayofPersegiPanjang[2].panjang + ", lebar: "
                                + arrayofPersegiPanjang[2].lebar);
        }
}
