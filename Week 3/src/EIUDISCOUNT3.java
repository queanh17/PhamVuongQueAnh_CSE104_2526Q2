import java.util.Scanner;

public class EIUDISCOUNT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int aMillion = 1_000_000;
        long[] levels = { 5 * aMillion, 20 * aMillion, 100 * aMillion, 300 * aMillion, 600 * aMillion, 900 * aMillion,
                Long.MAX_VALUE / 2 };
        double[] rates = { 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
        double[] bonusDisct = new double[3];
        for (int i = 0; i < bonusDisct.length; i++) {
            bonusDisct[i] = sc.nextDouble();
        }
        double discount = 0;
        for (int i = 1; i < levels.length; i++) {
            if (n > levels[i - 1]) {
                long portion = Math.min(n, levels[i]) - levels[i - 1];
                discount += portion * rates[i - 1];
            }
        }
        double payment = n - discount;
        for (int i = 0; i < bonusDisct.length; i++) {
            if (bonusDisct[i] == 1) {
                payment = payment - payment * 0.02;
            }
        }
        System.out.println(Math.round(payment));

    }
}
