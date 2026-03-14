package cse104.lab2;

import java.util.Scanner;

public class EIUCUBES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int layer =0;
        while(n>=0){ 
            layer++;
            n-=layer*(layer+1)/2;
           
        }
        System.out.println(layer-1);
    }
}
