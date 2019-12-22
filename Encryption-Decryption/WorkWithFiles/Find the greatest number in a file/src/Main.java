import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File file = new File("./Data/dataset_91007.txt");

        try {
            Scanner sc = new Scanner(file);
            int max = 0;
            int buf = 0;

            while (sc.hasNext()){
                buf = sc.nextInt();
                if (max < buf){
                    max = buf;
                }
            }
            System.out.println(max);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}