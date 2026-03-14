import java.util.*;

 class EIUCUBES2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            long n = sc.nextLong();
            long h = (long) Math.cbrt(6.0 * n);
            while (brickNeeded(h) > n) {
                h--;
            }
            while (brickNeeded(h + 1) <= n) {
                h++;
            }
            System.out.print(h + " ");
            T--;
        }

    }

    public static long brickNeeded(long h) {
        long nBricks = (h * (h + 1) * (h + 2)) / 6;
        return nBricks;

    }
}