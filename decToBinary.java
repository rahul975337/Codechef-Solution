import java.io.*;
import java.util.*;

public class decToBinary {
    public static void main(String[] args) throws IOException {
        try {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer> inputs = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int input = sc.nextInt();
                inputs.add(input);
            }
            for (int i : inputs) {
                decToBinary(i);
            }
        } catch (Exception e) {
            return;
        }
    }

    static void decToBinary(int n) {
        int[] binaryNum = new int[1000];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
        System.out.println();
    }
}