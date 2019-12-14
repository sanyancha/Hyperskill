import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int data = scanner.nextInt();

        int digit1 = data % 10;
        int digit2 = ((data - digit1)%100)/10;
        int digit3 = ((data - digit2*10 - digit1)%1000)/100;


        System.out.println(digit1 + digit2 + digit3);
    }
}