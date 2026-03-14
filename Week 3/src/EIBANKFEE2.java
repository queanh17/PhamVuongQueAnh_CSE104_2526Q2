
import java.util.Scanner;

public class EIBANKFEE2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfAccounts = sc.nextInt();

        double totalFee = 0;
        int totalCheck = 0;

        for (int i = 0; i < numOfAccounts; i++) {
            double money = sc.nextDouble();
            int numOfCheck = sc.nextInt();
            totalCheck += numOfCheck;
            double monthlyFee = 0;
            double checkFee = 0;

            if (money < 500) {
                monthlyFee = 12.0;
                checkFee = 0.20;
            } else if (money < 2000) {
                monthlyFee = 7.5;
                checkFee = 0.20;
            } else if (money < 5000) {
                monthlyFee = 5.0;
                checkFee = 0.10;
            } else {
                monthlyFee = 0;
                checkFee = 0;
            }

            totalFee += monthlyFee + (checkFee * numOfCheck);

        }

        double result = totalFee / totalCheck;
        System.out.println(Math.round(result * 100000) / 100000d);
    }
}
