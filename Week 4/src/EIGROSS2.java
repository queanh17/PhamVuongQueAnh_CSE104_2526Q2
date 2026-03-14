import java.util.Scanner;

public class EIGROSS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double netSalary = sc.nextDouble();
        double[] rates = { 0.05, 0.1, 0.15, 0.20, 0.25,0.30,0.35};
        long[] incomes = { 0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000, Long.MAX_VALUE };
        double grossSalary = 0;
        double money = 0;
        double tax = 0;
        if (netSalary > 11000000) {
            money = netSalary - 11000000;
            double[] reduces = new double[8];
            for (int i = 1; i < 7; i++) {
                reduces[i] = (incomes[i] - incomes[i - 1]) *(1- rates[i - 1]) + reduces[i - 1];
            }
            reduces[7] = Long.MAX_VALUE;
            for (int i = 1; i < 8; i++) {
                if (money < reduces[i]) {
                    tax += (money - reduces[i - 1]) / (1 - rates[i - 1]);
                    break;
                } else
                    tax += (reduces[i] - reduces[i - 1]) / (1 - rates[i - 1]);

            }
            grossSalary = 11000000 + tax;
            System.out.println(Math.round(grossSalary));
        }
        else 
            System.out.println(Math.round(netSalary));

    }
}
