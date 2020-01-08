package encryptdecrypt;

import encryptdecrypt.entities.сreator.CryptographCreator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String[] DICTIONARY = {"-mode", "-alg", "-key", "-data", "-in", "-out"};

    public static void main(String[] args) {
        String[] dataArr = parseArgs(args);

        //Set Args data
        String mode = dataArr[0] == null  ? "enc"    : dataArr[0];
        String alg  = dataArr[1] == null  ? "shift"  : dataArr[1];
        int key     = dataArr[2] == null  ? 5        : Integer.parseInt(dataArr[2]);
        String data = dataArr[3] == null  ? "Welcome to hyperskill!" : dataArr[3];
        File inFile = dataArr[4] == null  ? null     : new File(dataArr[4]);
        File outFile = dataArr[5] == null ? null     : new File(dataArr[5]);

        CryptographCreator cryptographCreator = new CryptographCreator(inFile, outFile);

        try {
            String result = cryptographCreator.dataTransform(alg, mode, key, data);
            if (result != null) {
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] parseArgs(String[] args){
        String[] data = new String[DICTIONARY.length];

        for(int i = 0; i < args.length; i++) {
            for(int j = 0; j < DICTIONARY.length; j++){
                if (args[i].toLowerCase().equals(DICTIONARY[j])) {
                    data[j] = args[i+1];
                }
            }
        }
        return data;
    }
}
