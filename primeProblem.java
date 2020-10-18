import java.io.*;
import java.util.*;

public class primeProblem {
    public static void main(String[] args) throws IOException {
        try {
            int n;
            int flag = 1;
            int n1 = 3;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n >= 1) {
                System.out.println(2);
            }
            for (int k = 2; k <= n;) {
                for (int m = 2; m <= Math.sqrt(n1); m++) {
                    if (n1 % m == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag != 0) {
                    System.out.println(n1);
                    k++;
                }
                flag = 1;
                n1++;
            }
        } catch (Exception e) {
            return;
        }
    }
}