import java.util.Scanner;

class EIUBIRTH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long B = sc.nextLong();
            long R = sc.nextLong();
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long Z = sc.nextLong();
            long blueBall = 0;
            long redBall = 0;
            if (Y + Z < X) {
                blueBall = (Y + Z) * B; 
            }else {
                blueBall = X * B;
            }

            if (X + Z < Y) {
                redBall = (X + Z) * R; 
            }else {
                redBall = Y * R;
            }

            long total = blueBall + redBall;
           System.out.println(total);
        }

    }
}
