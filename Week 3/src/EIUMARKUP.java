
import java.util.Scanner;

public class EIUMARKUP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfProducts = sc.nextInt();
        int products;
        int price = 200;
        int payment = 0;
        while (numOfProducts > 0) {
            products = Math.min(100, numOfProducts);
            price = Math.max(180, price);
            payment += products * price;
            numOfProducts -= products;
            price--;
        }
        System.out.println(payment);
    }

}
