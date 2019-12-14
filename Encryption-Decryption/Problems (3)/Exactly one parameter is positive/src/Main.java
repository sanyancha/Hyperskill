import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean rule;

        if (a > 0) {
            rule = (b <= 0) && (c <= 0);
        }else if (b > 0) {
            rule = (a <= 0) && (c <= 0);
        }else if (c > 0) {
            rule = (b <= 0) && (a <= 0);
        }else {
            rule = false;
        }
        System.out.println(rule);
    }
}