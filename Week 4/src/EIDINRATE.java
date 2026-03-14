
import java.util.Scanner;

public class EIDINRATE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        double totalYear;
        for (int i = 0; i < testCases; i++) {
            double money = sc.nextDouble();
            double rates = sc.nextDouble();
            double goal = sc.nextDouble();
            totalYear = Math.log(goal / money) / Math.log(1 + rates / 100);
            System.out.println(Math.round(Math.ceil(totalYear)));
        }
    }

}
