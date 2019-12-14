import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int oneWayCost = scanner.nextInt();
        int oneNightCost = scanner.nextInt();

        int costAllFood = duration*foodPerDay;
        int flightCost = oneWayCost*2;
        int livingCost = oneNightCost*(duration - 1);

        System.out.println(costAllFood + flightCost + livingCost);

    }
}