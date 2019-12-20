package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        String data = sc.nextLine();
        String enc_dec = "";

        int n = sc.nextInt();

        for(char c : data.toCharArray()){
            if (type.equals("enc")) {
                c = encrypeChar(c, n);
            } else if (type.equals("dec")) {
                c = decryptChar(c, n);
            }
            enc_dec = enc_dec + c;
        }
        System.out.println(enc_dec);
    }

    static boolean isCharValid(char c){
        c = Character.toLowerCase(c);
        if (c >= 'a' && c <= 'z'){
            return true;
        } else {
            return false;
        }
    }

    static char encrypeChar(char c, int n){
        return (char) (c + n);
    }

    static char decryptChar(char c, int n){
        return  (char) (c - n);
    }
    static char encrypeABCChar(char c, int n){
        int nToMove, delimeter = 'Z' - 'A' + 1;
        char out = ' ';

        if (isCharValid(c)) {
            nToMove = n % delimeter;

            if (c >= 'A' && c <= 'Z') {

                if (c + nToMove > 'Z') {
                    out = (char) (c + nToMove - delimeter);
                } else {
                    out = (char) (c + nToMove);
                }

                out = (char) (c + n);

            } else if ( c >= 'a' && c <= 'z'){
                if (c + nToMove > 'z') {
                    out = (char) (c + nToMove - delimeter);
                } else {
                    out = (char) (c + nToMove);
                }
            } else {
                out = '\n';
            }
        }
        else{
                out = (char) (c + n);
            }

        return out;
    }

    static char decryptABCChar(char c, int n){
        int nToMove, delimeter = 'Z' - 'A' + 1;
        char out = ' ';
        out = (char) (c - n);

        if (isCharValid(c)) {
            nToMove = n % delimeter;

            if (c >= 'A' && c <= 'Z') {
                out = (char) (c - n);

            } else if ( c >= 'a' && c <= 'z'){
                if (c - nToMove < 'a') {
                    out = (char) (c - nToMove + delimeter);
                } else {
                    out = (char) (c - nToMove);
                }
            } else {
                out = '\n';
            }
        }
        else{
            out = (char) (c - n);
        }

        return out;
    }
}
