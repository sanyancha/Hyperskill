import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void sort(int[] numbers) {
        // write your code here
        int buf;
        for(int i = 0; i < numbers.length; i++ ) {
            for(int j = 0; j < numbers.length - i - 1; j++){
                if (numbers[j] > numbers[j+1]) {
                    buf = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = buf;
                }
            }
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}