import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        long digit = new Scanner(System.in).nextLong();
        long iterator = 1;
        int count = 1;

        while(iterator <= digit){
            count++;
            iterator*=count;
        }

        System.out.println(count);

    }
}