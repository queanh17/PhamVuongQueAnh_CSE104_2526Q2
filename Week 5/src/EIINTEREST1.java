import java.util.Scanner;

public class EIINTEREST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ratePerMonth = sc.nextDouble();
        long money []= new long[12];
        double payment=0;
        for(int i =0;i<money.length;i++){
            money[i]= sc.nextLong();
            payment+=money[i]*Math.pow((1+ratePerMonth),12-i);
        }
        System.out.println(Math.round(payment));
    }
}
