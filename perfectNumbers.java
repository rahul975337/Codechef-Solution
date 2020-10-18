
import java.io.*;
import java.util.*;

public class perfectNumbers {
    public static void main(String[] args) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer> inputs = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int input = sc.nextInt();
                inputs.add(input);
            }
            for (int num : inputs) {

                if (isPerfect(num)) {
                    System.out.println("YES");
                } else
                    System.out.println("NO");
            }

        } catch (Exception e) {
            return;
        }
    }

    ///////////////////////////////////////////
    // Returns true if n is perfect
    static boolean isPerfect(int n) {
        // To store sum of divisors
        int sum = 1;
        // Find all divisors and add them
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n && n != 1)
            return true;
        return false;
    }
}