import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int countSymbols = 0;

        int[] vovDiscNumbers = getArrayConeq(string);

        for(int i : vovDiscNumbers){
            if (i > 0) {
                countSymbols += ((i - 1) / 2);
            }
        }
        System.out.println(countSymbols);
    }

    public static int[] getArrayConeq(String string){
        int[] vovDiscNumbers = new int[string.length()];
        int numberVovels = 0, numberDicodant = 0;
        int indexArray = 0;

        for (char c : string.toCharArray()) {
            if (isVovel(c)) {
                if(numberDicodant != 0) {
                    vovDiscNumbers[indexArray] = numberDicodant;
                    indexArray++;
                }
                numberVovels++;
                numberDicodant = 0;
            } else {
                if(numberVovels != 0) {
                    vovDiscNumbers[indexArray] = numberVovels;
                    indexArray++;
                }
                numberVovels = 0;
                numberDicodant++;
            }
        }
        if (numberVovels != 0) {
            vovDiscNumbers[indexArray] = numberVovels;
        } else {
            vovDiscNumbers[indexArray] = numberDicodant;
        }

        return vovDiscNumbers;
    }

    public static boolean isVovel(char c){
        char[] vovels = {'a', 'e', 'i', 'o', 'u', 'y'};

        for(char ch : vovels){
            if (ch == c) {
                return true;
            }
        }
        return false;
    }
}