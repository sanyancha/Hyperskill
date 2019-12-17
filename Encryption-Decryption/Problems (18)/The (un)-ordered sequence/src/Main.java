import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int digitLast = digit;
        String str1;

        boolean isOrdered = true, directionRise = false, isInitComplete = false;

        while (digit != 0)
        {
            if (!isInitComplete) {
                if (digit > digitLast) {
                    isOrdered = true;
                    isInitComplete = true;
                    directionRise = true;
                } else if (digit < digitLast) {
                    isOrdered = true;
                    isInitComplete = true;
                    directionRise = false;
                }
            } else{
                if (directionRise && digit < digitLast){
                    isOrdered = false;
                } else if (!directionRise && digit > digitLast){
                    isOrdered = false;
                }
            }

            digitLast = digit;
            digit = sc.nextInt();
        }
        System.out.println(isOrdered);
    }
}