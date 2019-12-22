import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str1 = "";

        int n = sc.nextInt();
        int[] arrInt = new int[n];

        for(int i = 0; i < n; i++){
            arrInt[i] = sc.nextInt();
        }

        System.out.println(getSumDivededNumber(arrInt,6));


    }

    public static int getSumDivededNumber(int[] arr, int key){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 6 == 0) {
                sum += arr[i];
            }

        }

        return sum;
    }
}