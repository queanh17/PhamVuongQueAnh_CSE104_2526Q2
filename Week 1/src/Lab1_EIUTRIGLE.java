
import java.util.Arrays;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i = 0; i<n;i++){
            a[i]=sc.nextInt();
    }
        int numberOfTriangle =0;
        Arrays.sort(a);
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int t =j+1;t<n;t++){
                    if(a[i]+a[j]>a[t])
                        numberOfTriangle++;
                    }
                    }
                    }
                    System.out.println(numberOfTriangle);



    
    }
}
