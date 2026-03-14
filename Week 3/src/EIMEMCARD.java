
import java.util.Scanner;

public class EIMEMCARD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();
        long totalPurchase = 0;
        long totalDiscount = 0;
        for (int i = 0; i < numberOfItems; i++) {
            long price = scanner.nextLong();

            double discountRate = getDiscountRate(totalPurchase);

            long discount = (long) (price * discountRate);

            System.out.println(discount);
            if (i < numberOfItems - 1) {
                System.out.print(" ");
            }
            totalPurchase += price;
        }

        scanner.close();
    }

    public static double getDiscountRate(long totalPurchase) {

        if (totalPurchase >= 200_000_000) {
            return 0.07; // Platinum discount
        } else if (totalPurchase >= 50_000_000) {
            return 0.05; // Diamond discount
        } else if (totalPurchase >= 20_000_000) {
            return 0.03; // Gold discount
        } else if (totalPurchase >= 1_000_000) {
            return 0.02; // Starter discount
        } else {
            return 0.0;  // No discount
        }
    }
}
