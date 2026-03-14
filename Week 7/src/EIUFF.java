import java.util.Scanner;

public class EIUFF {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble() / 100 + 1;
        double f = sc.nextDouble() / 100 + 1;
        double y = sc.nextDouble();
        int n = sc.nextInt();
        double u1 = y / r;
        double q = f / r;
        double x = u1 * (1 - Math.pow(q, n - 1)) / (1 - q);
        System.out.printf("%.4f",x);
	}
}
   

