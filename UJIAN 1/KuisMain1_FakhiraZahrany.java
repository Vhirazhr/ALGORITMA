public class KuisMain1_FakhiraZahrany {
    public static void main(String[] args) {
        Kuis1_FakhiraZahrany10.Obat1[] ArrayofObat1 = new Kuis1_FakhiraZahrany10.Obat1[5];
        ArrayofObat1[0] = new Kuis1_FakhiraZahrany10.Obat1("Paracetamol", 30, " Dulcolak ", 10);
        ArrayofObat1[1] = new Kuis1_FakhiraZahrany10.Obat1("Amoxicillin", 25, " antibiotik ", 5);
        ArrayofObat1[2] = new Kuis1_FakhiraZahrany10.Obat1("Promag", 20, " Bodrex ", 8);
        ArrayofObat1[3] = new Kuis1_FakhiraZahrany10.Obat1("Ibuprofen", 15, " mag ", 7);
        ArrayofObat1[4] = new Kuis1_FakhiraZahrany10.Obat1("Salbutamol", 5, " panas", 3);

        System.out.println("obat 1: " + ArrayofObat1[0]);
        System.out.println("obat 2: " + ArrayofObat1[1]);
        System.out.println("obat 3: " + ArrayofObat1[2]);
        System.out.println("obat 4: " + ArrayofObat1[3]);
        System.out.println("obat 5: " + ArrayofObat1[4]);

        for (int i = 0; i < ArrayofObat1.length; i++) {
            System.out.println("Obat " + (i + 1) + ":");
            ArrayofObat1[i].tampil();
            System.out.println();
        }
    }
}