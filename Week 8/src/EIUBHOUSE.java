import java.util.Scanner;

public class EIUBHOUSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double M = sc.nextDouble();
        int K = sc.nextInt();
        double X = sc.nextDouble()/100;
        double debt = N-M;
        double principal = debt/K;
        for (int i = 1; i <= K; i++) {
            System.out.println(i+" "+ Math.round(principal+debt*X));
            debt-=principal;
        }
    }
}
