import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File file = new File("./Data/dataset_91069.txt");

        try {
            Scanner sc = new Scanner(file);
            int year = 0, yearMaxDifferent = 0;
            long previousPopulation = 0, population = 0;
            double diffPopulation = 0, maxDifferent = 0;

            sc.nextLine();

            while (sc.hasNext()){
                year = sc.nextInt();
                population = Long.parseLong(sc.next().replaceAll(",",""));

                if (previousPopulation != 0) {
                    diffPopulation = (population - previousPopulation);

                    if (diffPopulation > maxDifferent) {
                        maxDifferent = diffPopulation;
                        yearMaxDifferent = year;
                    }
                }
                previousPopulation = population;
            }

            System.out.print(maxDifferent + " ,");
            System.out.println(yearMaxDifferent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
