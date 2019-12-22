import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String data = "";
        int i = -1;

        data = sc.next();
        while (!data.equals("0")){
            try{
                i = Integer.parseInt(data);
                System.out.println(i * 10);
            }catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + data);
            }
            data = sc.next();
        }
    }
}