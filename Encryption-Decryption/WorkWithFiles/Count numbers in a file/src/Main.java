import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File file = new File("./Data/dataset_91022.txt");

        try {
            Scanner sc = new Scanner(file);
            int count = 0;
            int buf = 0;

            while (sc.hasNext()){
                buf = sc.nextInt();
                if (buf >= 9999){
                    count++;
                }
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}