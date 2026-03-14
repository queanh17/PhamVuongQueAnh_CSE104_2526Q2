import java.util.Scanner;

class FF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble() / 100.0; 
        double f = sc.nextDouble() / 100.0; 
        int C = sc.nextInt();       
        double money = C / (r - f);
        System.out.println((long) Math.ceil(money));
    }
}

    
