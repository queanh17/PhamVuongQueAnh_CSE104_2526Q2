import java.util.Arrays;
import java.util.Scanner;

public class EIVCHR2_Voucher2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfItems = sc.nextInt();
        long[] prices = new long[numOfItems];
        long discount = 0;
        long discountMax = 0;
        long total = 0;
        long payment = 0;
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextLong();
        }
        Arrays.sort(prices);
        discount = (long) (prices[prices.length - 1] * 0.3);
        if (discount > 50000)
            discountMax = prices[prices.length - 1] - 50000;
        else
            discountMax = prices[prices.length - 1] - discount;
        for (int i = 0; i < prices.length - 1; i++) {
            total += prices[i];
        }
        System.out.println(total + discountMax);

    }
}
