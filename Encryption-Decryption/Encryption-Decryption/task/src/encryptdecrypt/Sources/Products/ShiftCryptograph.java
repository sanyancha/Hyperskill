package encryptdecrypt.Sources.Products;

public class ShiftCryptograph extends Cryptograph {

    public ShiftCryptograph(){}

    public ShiftCryptograph(String data){
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

    private static boolean isCharValid(char c){
        if ((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')){
            return true;
        } else {
            return false;
        }
    }

    private static char encryptChar(char c, int key){
        int nToMove, delimeter = 'Z' - 'A' + 1;
        char out = ' ';

        if (isCharValid(c)) {
            nToMove = key % delimeter;

            if (c >= 'A' && c <= 'Z') {
                if (c + nToMove > 'Z') {
                    out = (char) (c + nToMove - delimeter);
                } else {
                    out = (char) (c + nToMove);
                }
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
            out = c;
        }

        return out;
    }

    private static char decryptChar(char c, int key){
        int nToMove, delimeter = 'Z' - 'A' + 1;
        char out = ' ';

        if (isCharValid(c)) {
            nToMove = key % delimeter;

            if (c >= 'A' && c <= 'Z') {
                if (c - nToMove < 'A') {
                    out = (char) (c - nToMove + delimeter);
                } else {
                    out = (char) (c - nToMove);
                }
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
            out = c;
        }

        return out;
    }
}
