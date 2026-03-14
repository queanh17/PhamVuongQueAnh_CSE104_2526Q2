package cse104.lab2;

import java.util.Scanner;

public class EIUCUBES2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] money = new int[] { 2_000_000, 10_000_000, 50_000_000, 100_000_000, 200_000_000, 500_000_000 };
        double[] rate = new double[] { 0, 0.03, 0.05, 0.07, 0.10, 0.12, 0.15 };
        double totalDiscount = 0;
        for (int i = 0; i < rate.length; i++) {
            if (n > money[i]) {
                if (n - money[i] > money[i + 1] - money[i]) {
                    totalDiscount += (money[i + 1] - money[i]) + rate[i + 1];

                } else
                    totalDiscount += (n - money[i]) * rate[i + 1];

            }
        }
        System.out.println(Math.round(n - totalDiscount));
    }
}
