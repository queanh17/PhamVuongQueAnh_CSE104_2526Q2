import java.util.Scanner;

public class EIBANKFEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        int numOfCheck = sc.nextInt();
        double fee;
        if(money<500){
            fee = 12.00+0.20*numOfCheck;
            }
        else if(money<2000){
            fee = 7.5+0.20*numOfCheck;
            }
        else if(money<5000){
            fee = 5.0+0.1*numOfCheck;
            }
        else {
            fee = 0;
            }
        System.out.println(Math.round(fee*100)/100d);//làm tròn 2 chu so thap phan
    }
}
