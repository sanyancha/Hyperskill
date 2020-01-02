public class AsciiCharSequence implements java.lang.CharSequence {
    private byte[] byteArray;

    public AsciiCharSequence(byte[] byteArray){
        this.byteArray = byteArray;
    }

    @Override
    public int length(){
        return byteArray.length;
    }

    @Override
    public char charAt(int index) throws IndexOutOfBoundsException{
        return (char) (byteArray[index]);
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) throws IndexOutOfBoundsException{
        return new AsciiCharSequence(toString().substring(start, end).getBytes());
    }

    @Override
    public String toString() {
        return new String(byteArray);
    }
    // implementation
}