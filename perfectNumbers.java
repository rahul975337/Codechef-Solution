
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
    static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }

        if (sum == n && n != 1)
            return true;
        return false;
    }
}