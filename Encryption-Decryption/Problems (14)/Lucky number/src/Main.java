import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String data = new Scanner(System.in).nextLine();
        int dataLen = data.length();

        if (dataLen % 2 == 0){
            int dataL = 0, dataR = 0;
            for(int i=1;i<=dataLen;i++){
                if (i<=dataLen/2){
                   dataL += Integer.parseInt(data.substring(i-1,i));
                } else{
                    dataR += Integer.parseInt(data.substring(i-1,i));
                }
            }
            if (dataL == dataR) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Wrong input");
        }
    }
}