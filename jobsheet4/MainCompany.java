import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class MainCompany {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                numCompanies = sc.nextInt();
                sc.nextLine();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                sc.nextLine();
            }
        }

        ArrayList<Company> companies = new ArrayList<>();

        for (int i = 0; i < numCompanies; i++) {
            System.out.print("Masukkan nama perusahaan ke-" + (i + 1) + ": ");
            String companyName = sc.nextLine();
            Company company = new Company(companyName);

            System.out.print("Masukkan jumlah bulan untuk perusahaan " + companyName + ": ");
            int numMonths = 0;
            isValidInput = false;
            while (!isValidInput) {
                try {
                    numMonths = sc.nextInt();
                    sc.nextLine();
                    isValidInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    sc.nextLine();
                }
            }

            for (int j = 0; j < numMonths; j++) {
                System.out.print("Masukkan keuntungan perusahaan " + companyName + " untuk bulan ke-" + (j + 1) + ": ");
                double profit = 0;
                isValidInput = false;
                while (!isValidInput) {
                    try {
                        profit = sc.nextDouble();
                        sc.nextLine();
                        if (profit < 0) {
                            System.out.println("Keuntungan tidak boleh negatif. Harap masukkan angka positif.");
                        } else {
                            isValidInput = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Input tidak valid. Harap masukkan angka.");
                        sc.nextLine();
                    }
                }
                company.addProfit(profit);
            }

            companies.add(company);
        }

        System.out.println("\n=========================");
        for (Company company : companies) {
            System.out.println(
                    "Total keuntungan untuk perusahaan " + company.getName() + ": " + company.getTotalProfit());
        }
        System.out.println("=========================");
    }
}