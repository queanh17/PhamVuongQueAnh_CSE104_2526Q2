import java.util.Scanner;

public class Lab1_EIPOINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] point = new int[] { 90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0 };
        String[] grade = new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
        for (int i = 0; i < point.length; i++) {
            if (n >= point[i]) {
                System.out.println(grade[i]);
                break;
            }
        }
    }
}
