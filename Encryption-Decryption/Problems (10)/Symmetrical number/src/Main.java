import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String digit = new Scanner(System.in).next();
        int length = digit.length();

        if (length == 4){
            if (digit.charAt(0) == digit.charAt(3) && digit.charAt(1) == digit.charAt(2)){
                System.out.println(1);
            } else {
                System.out.println(11);
            }
        } else if (length < 4) {
            for(int i = 4-length; i<4 ; i++){
                digit = 0 + digit;
            }
            if (digit.charAt(0) == digit.charAt(3) && digit.charAt(1) == digit.charAt(2)){
                System.out.println(1);
            } else {
                System.out.println(11);
            }
        } else {
            System.out.println("Input error");
        }

    }
}