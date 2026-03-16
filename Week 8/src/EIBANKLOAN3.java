import java.util.Scanner;

public class EIBANKLOAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double debt = sc.nextDouble();
        double maxPayment = sc.nextDouble();
        int month = sc.nextInt();
        double interestRate = sc.nextDouble() / 100 / 12;
        double prePayFee = sc.nextDouble() / 100;

        double fixedPrincipal = debt / month;

        double prepay = 0;
        double principal = 0;
        double remain = 0;

        for (int i = 1; i <= month; i++) {
            principal = Math.max(fixedPrincipal - prepay, 0);
            remain = maxPayment - principal - debt * interestRate;
            prepay = remain / (1 + prePayFee);
            debt = debt - principal - prepay;
            if (debt <= 0) {
                System.out.println(i + " " + 0);
                return;
            }
            System.out.println(i + " " + Math.round(debt));
        }

    }
}