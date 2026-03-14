import java.util.Scanner;

class EIUPURCHASE3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oriPrice = sc.nextInt();
        int prePay = sc.nextInt();
        int month = sc.nextInt();
        int money = oriPrice - prePay;
        double rate = sc.nextDouble();
        long monthlyPay = (long) ((money * Math.pow(1 + rate, month) * rate) / (Math.pow(1 + rate, month) - 1));
        System.out.println(monthlyPay);
    }
}
