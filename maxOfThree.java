import java.util.*;
import java.io.*;

class maxOfThree {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String[] arr = br.readLine().split(" ");
                int[] array = new int[arr.length];
                for (int j = 0; j < arr.length; j++) {
                    array[j] = Integer.parseInt(arr[j]);
                }
                Arrays.sort(array);
                System.out.println(array[2]);

            }
        } catch (Exception ex) {
            return;
        }
    }
}