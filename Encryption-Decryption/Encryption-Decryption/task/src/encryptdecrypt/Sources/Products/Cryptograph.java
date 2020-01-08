package encryptdecrypt.Sources.Products;

public abstract class Cryptograph {
    protected String sourceData;

    public Cryptograph(){
    }

    public Cryptograph(String data){
        this.sourceData = data;
    }

    public abstract String dataEncrypt(int key);
    public abstract String dataDecrypt(int key);

    public String getData(){
        return sourceData;
    }

    public void setData(String data){
        this.sourceData = data;
    }
}
