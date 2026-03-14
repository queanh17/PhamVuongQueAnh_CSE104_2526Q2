
import java.util.Scanner;

public class EIAPP21222FQ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        int M = sc.nextInt();
        double interest = 0;
        double[] interestRates = {0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664, 0.0692};
        if (M <= 12) {
            interest = N * interestRates[M - 1] * M / 12 + N;
        } else {
            int leftMonths = M % 12;
            int year = (M-leftMonths) / 12;
            N = N*Math.pow((1 + interestRates[11]), year);
            interest = N * interestRates[leftMonths - 1] * leftMonths / 12 + N;

        }
        System.out.println(Math.round(interest));

    }
}
