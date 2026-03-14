package cse104.lab2;

import java.util.Scanner;

public class EIUMADIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long maxDiff = 0;
        long minValue = a[0];
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < minValue) {
                minValue = a[i];  
            }
            long diff = a[i] - minValue;
            if (diff > maxDiff)
                maxDiff = diff;

        }
        System.out.println(maxDiff);
    }

}
