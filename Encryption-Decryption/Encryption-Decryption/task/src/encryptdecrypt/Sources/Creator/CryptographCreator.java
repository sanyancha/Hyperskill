package encryptdecrypt.Sources.Creator;

import encryptdecrypt.Sources.Products.Cryptograph;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CryptographCreator extends CryptoBuilder {

    public CryptographCreator(File fileIn, File fileOut){
        super(fileIn, fileOut);
    }

    @Override
    public String dataTransform(String algorithm, String mode, int key, String data) throws IOException {
        String transformedData;
        setAlgorithm(algorithm);

        //  Choose cryptographer
        if (cryptograph == null) {
            System.out.println("Error. Cryptograph Not Found");
            return null;
        }

        // Set Data
        if (fileIn != null) {
            Scanner scanner = new Scanner(fileIn);
            cryptograph.setData(scanner.nextLine());
            scanner.close();
        } else {
            cryptograph.setData(data);
        }

        // Transform data to String
        if (mode == null) {
            transformedData = cryptograph.dataEncrypt(key);
        } else {
            mode = mode.toUpperCase();

            switch (mode) {
                case "ENC" :
                    transformedData = cryptograph.dataEncrypt(key);
                    break;
                case "DEC" :
                    transformedData = cryptograph.dataDecrypt(key);
                    break;
                default:
                    System.out.println("Error. Incorrected mode");
                    return null;
            }
        }

        // Out select data
        if (fileOut != null) {
            FileWriter fileWriter = new FileWriter(fileOut);
            fileWriter.write(transformedData);
            return null;
        } else {
            return transformedData;
        }
    }
}
