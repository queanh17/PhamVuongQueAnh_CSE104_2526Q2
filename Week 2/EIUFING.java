package cse104.lab2;

import java.util.Scanner;

public class EIUFING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n % 18;
        String tay;
        if (result > 10)
            result = 20 - result;
        if (result > 5){
            result =11-result;
            tay = "ban tay phai";
        }
        else
            tay = "ban tay trai";
        if (result == 0 || result == 2)
            System.out.println("Ngon tro cua "+ tay);
        else if (result == 3)
            System.out.println("Ngon giua cua "+ tay);
        else if (result == 4)
            System.out.println("Ngon ap ut cua "+ tay);
        else if (result == 5)
            System.out.println("Ngon ut cua "+ tay);
        else
            System.out.println("Ngon cai cua "+ tay);
       
    }
}
