import java.util.Scanner;

public class EIBANKRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int months = sc.nextInt();
        double moneyAfterRates = money*(months/12.0)*0.09;
        double total = moneyAfterRates+money;
        System.out.println(total);
    }
}
