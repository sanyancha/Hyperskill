import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char chr1 = sc.next().charAt(0);
        char chr2 = sc.next().charAt(0);
        int count = 0;

        for(int i = 0; i < str1.length() - 1; i++){
            if ((str1.charAt(i) == chr1 && str1.charAt(i + 1) == chr2) ||
                    (str1.charAt(i+1) == chr1 && str1.charAt(i) == chr2))  {
                count++;
            }
        }
        System.out.println(count);

    }
}