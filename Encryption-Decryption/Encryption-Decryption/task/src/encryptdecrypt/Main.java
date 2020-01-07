package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String mode = "enc";
        int key  = 0;
        String data = null;
        String filepath = "";
        String out = null;
        String word = "";

        for (int i = 0; i < args.length; i += 2) {
            if (args[i].contains("mode")) {
                mode = args[i + 1];
            }
            if (args[i].contains("key")) {
                key = Integer.parseInt(args[i + 1]);
            }
            if (args[i].contains("data")) {
                data = args[i + 1];
            }
            if (args[i].contains("in")) {
                filepath = args[i + 1];
            }
            if (args[i].contains("out")) {
                out = args[i + 1];
            }
        }
        if(data != null) {
            word = encrypt(data, mode, key);
        }
        else {
            File file = new File(filepath);
            try (Scanner scan = new Scanner(file)) {
                data = scan.nextLine();
                word = encrypt(data, mode, key);
            } catch (FileNotFoundException e) {
                System.out.println("Error1");
            }
        }
        System.out.println(output(out, word, !filepath.equals("")));
    }

    private static String encrypt(String data, String mode, int key) {

        key *= "dec".equals(mode) ? -1 : 1;
        StringBuilder text = new StringBuilder();
        for (char word : data.toCharArray()) {
            text.append((char) ((int) word + key));
        } return text.toString();
    }

    private static String output(String filename, String word, boolean fileOut) {

        if(fileOut) {
            try (PrintWriter pw = new PrintWriter(filename)) {
                pw.print(word);
            } catch (java.io.IOException e) {
                System.out.println("Error2");
            }
        }
        else return word;
        return "Done.";
    }
}