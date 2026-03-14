import java.util.Scanner;

public class EIUPURCHASE1 {
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        int month = sc.nextInt();
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double low = 0.0;
        double high = 1.0;
        while (high - low > 1e-9) {
            double mid = (low + high) / 2;
            double rate = 1 + mid;
            double total = m * (1 - Math.pow(rate, month)) / (Math.pow(rate, month) * (1 - rate));
            if (total > v - n)
                low = mid;
            else
                high = mid;
        }
        System.out.printf("%.3f", high);
	}
}
    
