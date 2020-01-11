import java.util.*;

public class Main {

    public static int convert(Double val) {
        // write your code here
        if (Double.isNaN(val)){
            return 0;
        } else if (Double.isInfinite(val)) {
            if (val < 0) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }

        return (int) val.doubleValue();

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double doubleVal = new Double(scanner.nextDouble() / scanner.nextDouble());
        System.out.println(convert(doubleVal));
    }
}