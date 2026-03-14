package cse104.lab2;

import java.util.Scanner;

public class EISNAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long v = sc.nextLong();
        long step = (long)(1 + Math.ceil(((double)v - a) / (a - b)));
        System.out.println(step);
    }
}
