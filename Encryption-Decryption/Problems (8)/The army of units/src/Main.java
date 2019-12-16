import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int i = new Scanner(System.in).nextInt();

        if (i<1){
            System.out.println("no army");
        } else if (i<=4){
            System.out.println("few");
        } else if (i<=9){
            System.out.println("several");
        } else if (i<=19){
            System.out.println("pack");
        } else if (i<=49){
            System.out.println("lots");
        } else if (i<=99){
            System.out.println("horde");
        } else if (i<=249){
            System.out.println("throng");
        } else if (i<=499){
            System.out.println("swarm");
        } else if (i<=999){
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}