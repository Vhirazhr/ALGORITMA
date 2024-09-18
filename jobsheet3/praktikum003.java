import java.util.Scanner;

public class praktikum003 {

    public static class PersegiPanjang {
        public int panjang;
        public int lebar;

        public PersegiPanjang(int p, int l) {
            panjang = p;
            lebar = l;
        }

        public void CetakInfo() {
            System.out.println("panjang: " + panjang + ", lebar: " + lebar);
        }

        public int hitungLuas() {
            return panjang * lebar;
        }

        public int hitungKeliling() {
            return 2 * (panjang + lebar);
        }

    }
}
