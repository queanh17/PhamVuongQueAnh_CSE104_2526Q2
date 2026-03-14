import java.util.Scanner;

public class Lab1_EIUTHU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxDiff = 0;
        int minValue =0;
        for (int i = 0; i < n - 1; i++) {
                if(a[i]<=minValue)
                if ((a[j] - a[i]) > maxDiff)
                    maxDiff = a[j] - a[i];
            }

        }
        System.out.println(maxDiff);
    }
}
