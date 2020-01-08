package encryptdecrypt.entities.products;

public class UnicodeCryptograph extends Cryptograph {

    public UnicodeCryptograph(){}

    public UnicodeCryptograph(String data){
        super(data);
    }

    @Override
    public String dataEncrypt(int key) {
        String encryptData = "";

        for(char c : sourceData.toCharArray()){
            c = encryptChar(c,key);
            encryptData = encryptData + c;
        }

        return encryptData;
    }

    @Override
    public String dataDecrypt(int key) {
        String decryptData = "";

        for(char c : sourceData.toCharArray()){
            c = decryptChar(c,key);
            decryptData = decryptData + c;
        }

        return decryptData;
    }


    private static char encryptChar(char c, int key){
        int nToMove, delimeter = 'Z' - 'A' + 1;
        char out = ' ';

        nToMove = key % delimeter;
        out = (char) (c + nToMove);

        return out;
    }

    private static char decryptChar(char c, int key){
        int nToMove, delimeter = 'Z' - 'A' + 1;
        char out = ' ';

        nToMove = key % delimeter;
        out = (char) (c - nToMove);

        return out;
    }
}
