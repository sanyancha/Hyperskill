package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private  static final boolean SYSTEM_INPUT = false;

    public static void main(String[] args) {
        String enc_dec = "";
        String type = "enc";
        String data = "", inFile = "", outFile = "";
        int key;

        if (SYSTEM_INPUT) {
            Scanner sc = new Scanner(System.in);

            type = sc.nextLine();
            data = sc.nextLine();
            key = sc.nextInt();
            inFile = sc.nextLine();
            outFile = sc.nextLine();

        } else {
            type = getArgValue("-mode", "enc", args);
            data = getArgValue("-data", "", args);
            inFile = getArgValue("-in", null, args);
            outFile = getArgValue("-out", null, args);
            key = Integer.parseInt(getArgValue("-key", "0", args));
        }

        switch (type) {
            case "enc":
                String encryptedString, encryptedData = "";

                if (inFile == null) {
                    encryptedData = data;
                } else {
                    encryptedData = getDataFromFile(inFile);
                }

                encryptedString = encrypeString(encryptedData, key);

                if (outFile == null) {
                    System.out.println(encryptedString);
                } else {
                    sendDataToFile(encryptedString, outFile);
                }
                break;

            case "dec":
                String decryptedString, decryptedData = "";

                if (inFile == null) {
                    decryptedData = data;
                } else {
                    decryptedData = getDataFromFile(inFile);
                }

                decryptedString = decryptString(decryptedData, key);

                if (outFile == null) {
                    System.out.println(decryptedString);
                } else {
                    sendDataToFile(decryptedString, outFile);
                }
                break;
            default:
                ;
        }
    }

    static String getArgValue(String keyword, String dflt, String[] data){
        int i = 0;
        try {
            for (i = 0; i < data.length; i++) {
                if (data[i].toLowerCase().equals(keyword)) {
                    if (data[i + 1].charAt(0) == '-') {
                        System.out.println("Error, no data found for the parameter " + i);
                        return dflt;
                    } else {
                        return data[i + 1];
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error, no data found for the last parameter.");
            System.out.println(i);
            System.out.println(e.getMessage());
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

    static String getDataFromFile(String filePath){
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(file)){
            return scanner.nextLine();
        }catch (IOException e){
            System.out.println("Error! " + e.getMessage());
            return "";
        }
    }

    static boolean sendDataToFile(String data, String filePath){
        File file = new File(filePath);

        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(data);
            return true;
        }catch (IOException e){
            System.out.println("Error! " + e.getMessage());
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
