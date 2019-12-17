import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0, count = 0;

        for(int i=a;i<=b;i++){
            if (i%3 == 0){
                sum +=i;
                count ++;
            }
        }
        System.out.println(1.0*sum/count);

    }
}