
import java.util.Scanner;

public class EIUAPP21222FQ2 {

    private static final double[] INTEREST_TABLE = {
        0.039, 0.0392, 0.0395, 0.0399,
        0.0404, 0.0554, 0.0572, 0.0592,
        0.0614, 0.0638, 0.0664, 0.0692
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMonths = input.nextInt();
        double finalAmount = 0;

        for (int current = totalMonths; current >= 1; current--) {
            double deposit = input.nextDouble();
            finalAmount += calculateValue(deposit, current);
        }

        System.out.println(Math.round(finalAmount));
        input.close();
    }

    private static double calculateValue(double money, int monthsLeft) {
        if (monthsLeft <= 12) {
            return shortTermInterest(money, monthsLeft);
        } else {
            return longTermInterest(money, monthsLeft);
        }
    }

    private static double shortTermInterest(double money, int months) {
        double yearlyRate = INTEREST_TABLE[months - 1];
        return money * (1 + yearlyRate * months / 12);
    }

    private static double longTermInterest(double money, int months) {
        int fullYears = months / 12;
        int remainingMonths = months % 12;

        double base = money * Math.pow(1 + INTEREST_TABLE[11], fullYears);

        if (remainingMonths == 0) {
            return base;
        }

        double extraRate = INTEREST_TABLE[remainingMonths - 1];
        return base * (1 + extraRate * remainingMonths / 12);
    }
}
