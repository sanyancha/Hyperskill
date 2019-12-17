import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        String answer = "";

        while(data != 0){
            if (data % 2 == 0) {
                answer += "even\n";
            } else{
                answer += "odd\n";
            }

            data = sc.nextInt();
        }
        System.out.println(answer);
    }
}