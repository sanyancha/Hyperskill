import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String read = sc.nextLine();

        System.out.println(read.endsWith("burg"));
    }
}