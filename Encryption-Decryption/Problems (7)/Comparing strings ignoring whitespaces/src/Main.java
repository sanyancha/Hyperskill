import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String read = sc.nextLine().replaceAll(" ", "");
        String read2 = sc.nextLine().replaceAll(" ", "");

        System.out.println(read.equals(read2));
    }
}