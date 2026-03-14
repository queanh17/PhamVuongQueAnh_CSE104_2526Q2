import java.util.Scanner;

public class EITAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long grossSalary = sc.nextLong();
        long[] money ={0,5000000,10000000,18000000,32000000,52000000,80000000,Long.MAX_VALUE};
        double[] rates = { 0.05, 0.1, 0.15, 0.20, 0.25,0.30,0.35};
        long taxIncome = grossSalary-9000000;
        double totalTax =0;
        if(taxIncome>0){
            for (int i = 0; i < rates.length; i++) {
                long bracktIncome = Math.min(taxIncome,money[i+1]-money[i]);
                totalTax += bracktIncome*rates[i];
                taxIncome-=bracktIncome;
                
            }
            System.out.println(Math.round(totalTax));
        }
        else 
            System.out.println(0);
    }
}
