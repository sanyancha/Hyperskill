import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean rule1 = a + b > c;
        boolean rule2 = a + c > b;
        boolean rule3 = c + b > a;

        if (rule1 && rule2 && rule3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}