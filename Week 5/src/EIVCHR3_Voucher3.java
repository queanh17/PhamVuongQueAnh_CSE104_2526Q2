import java.util.Arrays;
import java.util.Scanner;

public class EIVCHR3_Voucher3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfItems = sc.nextInt();
        int numOfVouchers = sc.nextInt();
        if(numOfVouchers>numOfItems)
            numOfVouchers=numOfItems;
        long[] prices = new long[numOfItems];
        long maxDiscount = 0;
        long total = 0;
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextLong();
        }
        Arrays.sort(prices);
        int i = numOfItems - 1;
        for (; i >= numOfItems - numOfVouchers; i--) {
            long discount = (long) (prices[i] * 0.3);
            if (discount > 50000)
                maxDiscount += prices[i] - 50000;
            else
                maxDiscount += prices[i] - discount;
        }
        for (; i >= 0; i--) {
            total += prices[i];
        }
        System.out.println(maxDiscount + total);
    }
}
