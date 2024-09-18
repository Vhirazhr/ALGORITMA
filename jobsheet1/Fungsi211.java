import java.util.HashMap;
import java.util.Map;

public class Fungsi211 {

    public static void main(String[] args) {
        // Rincian stok bunga pada setiap cabang Royal Garden
        Map<String, Map<String, Integer>> stokBunga = new HashMap<>();
        
        // royal garden 4
        Map<String, Integer> royalGarden4 = new HashMap<>();
        royalGarden4.put("algonema", 5 - 1); // Pengurangan stok Aglonema karena bunga mati
        royalGarden4.put("keladi", 7 - 2);   // Pengurangan stok Keladi karena bunga mati
        royalGarden4.put("alocasia", 12 - 0); // Pengurangan stok Alocasia karena tidak ada pengurangan
        royalGarden4.put("mawar", 9 - 5);     // Pengurangan stok Mawar karena bunga mati
        
        // Menambahkan data stok untuk cabang royal garden 4 ke map stokBunga
        stokBunga.put("Royal Garden 4", royalGarden4);
        
        // Menampilkan jumlah stok setiap jenis bunga pada cabang royal garden 4
        System.out.println("Jumlah Stock Bunga pada Cabang Royal Garden 4:");
        for (String jenis : royalGarden4.keySet()) {
            int jumlah = royalGarden4.get(jenis);
            System.out.println(jenis + ": " + jumlah);
        }
    }
}
