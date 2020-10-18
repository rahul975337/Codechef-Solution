import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class squareOfNumber {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            int square = (int) Math.pow(input, 2);

            inputs.add(square);
        }
        for (int i : inputs) {
            System.out.println(i);
        }
    }
}
