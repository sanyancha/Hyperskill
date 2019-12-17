import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String data = new Scanner(System.in).nextLine();
        int count = 1;
        int max = 1;

        if (data.length() != 0) {
            for (int i = 0; i < data.length() - 1; i++) {
                if (data.charAt(i) != data.charAt(i + 1)) {
                    count = 1;
                } else {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                }
            }
        } else {
            max = 0;
        }
        System.out.println(max);
    }
}