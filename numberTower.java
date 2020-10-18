
import java.io.*;
import java.util.*;

public class numberTower {
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
                System.out.println(i);
            }

        } catch (Exception e) {
            return;
        }
    }
}