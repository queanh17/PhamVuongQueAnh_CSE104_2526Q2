import java.util.Scanner;

public class EIUCHRMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int aMillion = 1_000_000;
        double payment = 0;
        double total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] <= 2 * aMillion) {
                total = a[j] * 0.97;
            } else if (a[j] <= 5 * aMillion) {
                total = a[j] * 0.96;
            } else if (a[j] <= 10 * aMillion) {
                total = a[j] * 0.95;
            } else if (a[j] <= 20 * aMillion) {
                total = a[j] * 0.94;
            } else if (a[j] <= 50 * aMillion) {
                total = a[j] * 0.93;
            } else if (a[j] <= 100 * aMillion) {
                total = a[j] * 0.92;
            } else if (a[j] <= 200 * aMillion) {
                total = a[j] * 0.91;
            } else
                total = a[j] * 0.9;
         payment+=total;
        }
        System.out.println(Math.round(payment));
    }
}
