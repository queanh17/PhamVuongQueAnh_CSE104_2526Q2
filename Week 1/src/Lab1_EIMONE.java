import java.util.Scanner;

public class Lab1_EIMONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []notes =new int[]{20,10,5,1};
        for (int i = 0; i < notes.length; i++) {
            if (n >= notes[i]) {
            System.out.println(notes[i] + " " + n / notes[i]);
            n = n - (n / notes[i]) * notes[i];
        }
        
        }
        
    }
}