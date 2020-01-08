package encryptdecrypt.entities.сreator;

import encryptdecrypt.entities.products.Cryptograph;
import encryptdecrypt.entities.products.ShiftCryptograph;
import encryptdecrypt.entities.products.UnicodeCryptograph;

import java.io.File;
import java.io.IOException;

public abstract class CryptoBuilder {
    protected Cryptograph cryptograph;
    protected final File fileIn;
    protected final File fileOut;

    public CryptoBuilder(File fileIn, File fileOut){
        this.fileIn = fileIn;
        this.fileOut = fileOut;
    }

    public Cryptograph getCryptograph(){
        return cryptograph;
    }

    public void setAlgorithm(String algorithm){
        if (algorithm == null) {
            cryptograph = new ShiftCryptograph();
        } else {
            algorithm = algorithm.toUpperCase();

            switch (algorithm) {
                case "UNICODE":
                    cryptograph = new UnicodeCryptograph();
                    break;
                case "SHIFT":
                    cryptograph = new ShiftCryptograph();
                    break;
                default:
                    cryptograph = null; //Not found Cryptograph
                    break;
            }
        }
    }

    public abstract String dataTransform(String algorithm, String mode, int key, String data) throws IOException;
}
