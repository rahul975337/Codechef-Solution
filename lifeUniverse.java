
import java.util.*;
import java.lang.*;
import java.io.*;

class lifeUniverse {
    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<Integer> arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num >= 0 && num < 100) {
                if (num == 42) {
                    break;
                }
                arrayList.add(num);
            }
        }

        for (int i : arrayList) {
            System.out.println(i);
        }

    }
}
