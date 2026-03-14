
import java.util.Scanner;

public class EIUPASSBOOK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        int n = sc.nextInt();
        int m = sc.nextInt();
        double r1 = sc.nextDouble() / 100;
        double r2 = sc.nextDouble() / 100;
        double year = (n - m) / 12;
        double remainingMonths = (n - m) % 12;
        double EPSILON = 1e-9;
        double Y = ((X * (1 + r1 * n / 12)) / (1 + r2 * remainingMonths / 12)) / Math.pow(1 + r2, year);
        long maximum = Math.max(X, Math.round(Y + EPSILON));
        System.out.println(maximum);
    }
}
