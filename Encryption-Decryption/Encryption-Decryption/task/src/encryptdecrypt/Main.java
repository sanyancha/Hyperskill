package encryptdecrypt;

import java.util.Scanner;

public class Main {
    private  static final boolean SYSTEM_INPUT = false;

    public static void main(String[] args) {
        String enc_dec = "";
        String type = "enc";
        String data = "";
        int key;

        if (SYSTEM_INPUT) {
            Scanner sc = new Scanner(System.in);

            type = sc.nextLine();
            data = sc.nextLine();
            key = sc.nextInt();
        } else {

            type = getArgValue("-mode", "enc", args);
            data = getArgValue("-data", "", args);
            key = Integer.parseInt(getArgValue("-key", "0", args));
        }

        switch (type) {
            case "enc":
                System.out.println(encrypeString(data, key));
                break;
            case "dec":
                System.out.println(decryptString(data, key));
                break;
            default:
                ;
        }
    }

    static String getArgValue(String keyword, String dflt, String[] data){
        for(int i = 0; i < data.length; i++){
            if (data[i].toLowerCase().equals(keyword)) {
                if (i+1<= data.length){
                    return data[i + 1];
                } else {
                    return dflt;
                }
            }
        }
        return dflt;
    }

    static boolean isCharValid(char c){
        c = Character.toLowerCase(c);
        if (c >= 'a' && c <= 'z'){
            return true;
        } else {
            return false;
        }
    }

    static String encrypeString(String data, int key){
        String out = "";
        for(char c : data.toCharArray()){
            c = encrypeChar(c, key);
            out = out + c;
        }
        return out;
    }

    static String decryptString(String data, int key){
        String out = "";
        for(char c : data.toCharArray()){
            c = decryptChar(c, key);
            out = out + c;
        }
        return out;
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
