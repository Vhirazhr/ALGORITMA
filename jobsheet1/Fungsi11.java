import java.util.HashMap;
import java.util.Map;

public class Fungsi11 {

    static Map<String, Integer> hargaBunga = new HashMap<>();
    static {
        hargaBunga.put("algonema", 75000);
        hargaBunga.put("keladi", 50000);
        hargaBunga.put("alocasia", 60000);
        hargaBunga.put("mawar", 10000);
    }

    // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis
    // terjual
    public static void pendapatanPerCabang(Map<String, Integer> stokBunga) {
        int pendapatan = 0;
        for (String jenis : stokBunga.keySet()) {
            int stok = stokBunga.get(jenis);
            int harga = hargaBunga.get(jenis);
            pendapatan += stok * harga;
        }
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (String cabang : stokBunga.keySet()) {
            System.out.println("Royal Garden " + cabang + ": Rp" + pendapatan);
        }
    }

    public static void main(String[] args) {
        // Stock bunga pada setiap cabang
        Map<String, Map<String, Integer>> stokBunga = new HashMap<>();
        Map<String, Integer> royalGarden1 = new HashMap<>();
        royalGarden1.put("algonema", 10);
        royalGarden1.put("keladi", 5);
        royalGarden1.put("alocasia", 15);
        royalGarden1.put("mawar", 7);
        stokBunga.put("1", royalGarden1);

        Map<String, Integer> royalGarden2 = new HashMap<>();
        royalGarden2.put("algonema", 6);
        royalGarden2.put("keladi", 11);
        royalGarden2.put("alocasia", 9);
        royalGarden2.put("mawar", 12);
        stokBunga.put("2", royalGarden2);

        Map<String, Integer> royalGarden3 = new HashMap<>();
        royalGarden3.put("algonema", 2);
        royalGarden3.put("keladi", 10);
        royalGarden3.put("alocasia", 10);
        royalGarden3.put("mawar", 5);
        stokBunga.put("3", royalGarden3);

        Map<String, Integer> royalGarden4 = new HashMap<>();
        royalGarden4.put("algonema", 5);
        royalGarden4.put("keladi", 7);
        royalGarden4.put("alocasia", 12);
        royalGarden4.put("mawar", 9);
        stokBunga.put("4", royalGarden4);

        // Panggil fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga
        // habis terjual
        pendapatanPerCabang(stokBunga.get("1"));
        pendapatanPerCabang(stokBunga.get("2"));
        pendapatanPerCabang(stokBunga.get("3"));
        pendapatanPerCabang(stokBunga.get("4"));
    }
}
