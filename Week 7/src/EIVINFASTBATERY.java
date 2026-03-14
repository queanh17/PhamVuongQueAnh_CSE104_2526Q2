import java.util.Scanner;

class EIVINFASTBATERY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int costAfterRecall = sc.nextInt();
        int numOfMonths = sc.nextInt();
        double rate = sc.nextDouble() / 100;
        double monthlyPay = (((cost * Math.pow(1 + rate, numOfMonths) - costAfterRecall) * rate) / (Math.pow(1 + rate, numOfMonths) - 1));
        System.out.println(Math.round(monthlyPay));

    }
}
