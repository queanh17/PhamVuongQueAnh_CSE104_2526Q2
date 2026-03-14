import java.util.Scanner;

public class EIUSALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int aMillion =100_000;
        long sales[]={0,20,50,200,500,2000,Long.MAX_VALUE/2};
        double rates []={0.02,0.03,0.04,0.05,0.06,0.07};
        double bonus =0;
        for (int i = 1; i < sales.length; i++) {
            if(n>sales[i-1]){
                long portion = Math.min(n,sales[i])-sales[i-1];
                bonus+=portion*rates[i-1];
            }
        }
        //System.out.println(Math.round(bonus*100)/100d);
        System.out.println(Math.round(n-bonus));
    }
}
