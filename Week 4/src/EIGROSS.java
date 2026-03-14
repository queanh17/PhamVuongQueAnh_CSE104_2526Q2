import java.util.Scanner;

public class EIGROSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfPeople = sc.nextInt();
        double grossIncome = 0;
        for (int i = 0; i < numOfPeople; i++) {
            double afterTaxIncome = sc.nextDouble();
            System.out.println();
            grossIncome = afterTaxIncome * 0.1 / 0.9;
            System.out.println(Math.round(grossIncome*100)/100d);
        }

    }
}
