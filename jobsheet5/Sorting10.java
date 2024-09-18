/**
 * Sorting10
 */
public class Sorting10 {

    public static void main(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (i == key) {
                System.out.println("Data ditemukan pada indeks ke-" + i);
                return;
            }
        }
        System.out.println("Data tidak ditemukan");
    }
}
