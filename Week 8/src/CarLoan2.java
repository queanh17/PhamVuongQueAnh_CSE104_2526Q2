
import java.util.Scanner;

public class CarLoan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long oldPrice = sc.nextLong();
        long newPrice = sc.nextLong();
        double downPaymentRate = sc.nextDouble() / 100;
        int term = sc.nextInt();
        int sellingPoint = sc.nextInt();
        double depreciationRate = sc.nextDouble() / 100;
        double result = 0;

        double debt = oldPrice - downPaymentRate * oldPrice;
        double downPaymentNewCar = newPrice * downPaymentRate;
        double remainingValue = oldPrice * 0.9 * Math.pow((1 - depreciationRate), sellingPoint - 1);
        double compare = remainingValue - downPaymentNewCar;
        double start = 0;
        double end = 1;
        double eps = 1e-9;
        while (end - start > eps) {
            double mid = (start + end) / 2;
            double R = mid / 12 + 1;

            double monthlyPay = (debt * Math.pow(R, term) * (R - 1)) / (Math.pow(R, term) - 1);
            double remain = debt * Math.pow(R, sellingPoint - 1)
                    - monthlyPay * (Math.pow(R, sellingPoint - 1) - 1) / (R - 1);

            if (remain > compare) {
                end = mid;
            } else {
                start = mid;
            }
            result = mid;
        }
        System.out.printf("%.4f", result);
    }
}
