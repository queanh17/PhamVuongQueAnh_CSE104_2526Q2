import java.util.Arrays;
import java.util.Scanner;

public class EIAUCTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i =0;i<n;i++){
            if(a[n-1]>a[n-2]){
                System.out.println(n-1+1);
                return;
            }

        }
    }
}
