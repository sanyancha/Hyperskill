import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String str = new Scanner(System.in).nextLine();
        boolean isABCString = true;
        char cPrevious = 'a' - 1;
        for (char c : str.toCharArray()) {
            if (c < cPrevious) {
                isABCString = false;
                break;
            }
            cPrevious = c;
        }
        System.out.println(isABCString);
    }

    private static boolean isABCChar(char c){
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ') {
            return  true;
        } else {
            return false;
        }
    }
}