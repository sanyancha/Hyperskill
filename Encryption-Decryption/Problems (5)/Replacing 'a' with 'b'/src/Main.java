import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String read = sc.next();

        read = read.replace('a','b');
        System.out.println(read);
    }
}