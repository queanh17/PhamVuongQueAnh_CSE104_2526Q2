import java.util.Scanner;

class EIPURCHASE {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double loanAmount = sc.nextDouble();
        int months = sc.nextInt();
        double downPayment = sc.nextDouble();
        double monthlyPayment = sc.nextDouble();
        System.out.println(findInterestRate(loanAmount, monthlyPayment, months, downPayment));
    }

    public static double findInterestRate(double loanAmount, double monthlyPayment, int months, double downPayment) {
        double low = 0.0;
        double high = 1.0;     
        double eps = 1e-9; 
        double mid = 0.0;
        while (high - low > eps) {
            mid = (low + high) / 2;
            double rate = 1 + mid;
            double payment = (monthlyPayment * (Math.pow(rate, months) - 1)) / (Math.pow(rate, months) * (rate - 1));
            if (payment > loanAmount - downPayment) {
                low = mid;
            } else {
                high = mid;
            }

        }
        return mid;
    }
}
