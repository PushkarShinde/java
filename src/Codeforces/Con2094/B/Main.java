package Codeforces.Con2094.B;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); // Unused in logic
            int m = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            // Prefer segment centered around 0 if possible
            int left = Math.max(l, -m / 2);
            int right = left + m;

            if (right <= r) {
                System.out.println(left + " " + right);
            } else {
                // If not possible, just take from the rightmost bound
                right = r;
                left = right - m;
                System.out.println(left + " " + right);
            }
        }
    }
}
