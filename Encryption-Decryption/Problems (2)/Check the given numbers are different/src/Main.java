import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int digit1 = scanner.nextInt();
        int digit2 = scanner.nextInt();
        int digit3 = scanner.nextInt();

        boolean areEquals = digit1 != digit2 && digit2 != digit3 && digit1 != digit3;
        System.out.println(areEquals);
    }
}