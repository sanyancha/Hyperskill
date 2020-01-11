package analyzer;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File(args[0]);

        try {
            System.out.println(isDocument(file, args[1]) ? args[2] : "Unknown file type");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isDocument(File file, String format) throws IOException {
        boolean xFindedPDF = false;

        InputStream inputStream = new FileInputStream(file);
        int byteRead;
        String lineString = "";

        while ((byteRead = inputStream.read()) != -1) {
            if ((char) byteRead == '\n') {
                if (lineString.contains(format)) {
                    xFindedPDF = true;
                    break;
                }
                lineString = "";
            } else {
                lineString += (char) byteRead;
            }
        }
        if (lineString.contains(format)) {
            xFindedPDF = true;
        }
        inputStream.close();

        return xFindedPDF;
    }
}
