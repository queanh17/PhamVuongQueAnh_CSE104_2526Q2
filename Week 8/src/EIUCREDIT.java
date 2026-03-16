import java.util.Scanner;

public class EIUCREDIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double rate = sc.nextDouble();
        int T = sc.nextInt();
        long Trans[] = new long[T + 1];
        double debt = 0;
        for (int i = 0; i < N; i++) {
            int day = sc.nextInt();
            double amount = sc.nextDouble();
            Trans[day] += amount;
        }
        double balance = 0;
        for (int i = 1; i <= T; i++) {
            if (i % 30 == 1){
                balance += debt / 30 * rate;
                debt = 0;
            }
            balance += Trans[i];
            if (balance < 0)
                debt += balance;
        }
        System.out.println(Math.round(balance * 100) / 100d);
    }

}
