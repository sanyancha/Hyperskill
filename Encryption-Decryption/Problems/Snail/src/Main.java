import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int upOneDay = scanner.nextInt();
        int dnOneNight = scanner.nextInt();

        int totalDays = 0;

        for(int lh = 0; lh < height;){
            if (lh != 0){
                lh = lh - dnOneNight;
            }

            lh += upOneDay;
            totalDays = totalDays + 1;
        }

        System.out.println(totalDays);
    }
}