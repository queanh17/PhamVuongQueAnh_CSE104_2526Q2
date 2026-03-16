import java.util.Scanner;

public class EIBANKLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long loanAmount = sc.nextLong();
        long maximumPayment = sc.nextLong();
        double rate = sc.nextDouble() / 100;
        double numOfMonths = Math.log(maximumPayment/(maximumPayment-loanAmount*rate/12))/(Math.log(1+rate/12));
        System.out.println(Math.ceil(numOfMonths));
        

    }
}
