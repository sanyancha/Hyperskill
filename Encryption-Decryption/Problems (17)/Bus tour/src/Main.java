import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int heigh = sc.nextInt();
        int n = sc.nextInt();
        int[] bridgeHeight = new int[n];

        for(int i = 0;i < n;i++){
            bridgeHeight[i] = sc.nextInt();
        }

        for(int i = 0;i < n;i++){
            if (bridgeHeight[i] <= heigh){
                System.out.println("Will crash on bridge " + (i+1));
                break;
            } else if(i == n - 1){
                System.out.println("Will not crash");
            }
        }
    }
}