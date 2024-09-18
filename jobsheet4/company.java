import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Company {
    private String name;
    private ArrayList<Double> profits;

    public Company(String name) {
        this.name = name;
        this.profits = new ArrayList<>();
    }

    public void addProfit(double profit) {
        profits.add(profit);
    }

    public double getTotalProfit() {
        double total = 0;
        for (double profit : profits) {
            total += profit;
        }
        return total;
    }

    public String getName() {
        return name;
    }
}
