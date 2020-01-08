package encryptdecrypt;

import encryptdecrypt.Sources.Creator.CryptographCreator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();

        CryptographCreator cryptographCreator = new CryptographCreator(null, null);

        try {
            System.out.println(cryptographCreator.dataTransform("shift", "dec", 5, data));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
