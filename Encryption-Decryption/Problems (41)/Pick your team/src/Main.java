import java.util.ArrayList;
import java.util.Scanner;


class SelectionContext {

    private PersonSelectionAlgorithm algorithm;

    public void setAlgorithm(PersonSelectionAlgorithm algorithm) {
        // write your code here
        this.algorithm = algorithm;
    }

    public Person[] selectPersons(Person[] persons) {
        // write your code here
        return this.algorithm.select(persons);
    }
}

interface PersonSelectionAlgorithm {

    Person[] select(Person[] persons);
}

class TakePersonsWithStepAlgorithm implements PersonSelectionAlgorithm {
    private final int STEP;

    public TakePersonsWithStepAlgorithm(int step) {
        // write your code here
        STEP = step;
    }

    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        ArrayList<Person> arrayList = new ArrayList<Person>();
        Person[] personLoc;// = new Person[persons.length];

        for(int i = 0; i < persons.length; i++){
            if (i % STEP == 0) {
                arrayList.add(persons[i]);
            }
        }

        personLoc = new Person[arrayList.size()];
        personLoc = arrayList.toArray(personLoc);

        return personLoc;
    }
}


class TakeLastPersonsAlgorithm implements PersonSelectionAlgorithm {
    private final int COUNT;

    public TakeLastPersonsAlgorithm(int count) {
        // write your code here
        COUNT = count;
    }

    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        ArrayList<Person> arrayList = new ArrayList<Person>();
        Person[] personLoc;// = new Person[persons.length];


        int startIndex = persons.length - COUNT;
        if (startIndex >= 0) {
            for (int i = startIndex; i < persons.length; i++) {
                arrayList.add(persons[i]);
            }
        } else {
            for (int i = 0; i < persons.length; i++) {
                arrayList.add(persons[i]);
            }
        }

        personLoc = new Person[arrayList.size()];
        personLoc = arrayList.toArray(personLoc);

        return personLoc;
    }
}

class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);

        final int count = Integer.parseInt(scanner.nextLine());
        final Person[] persons = new Person[count];

        for (int i = 0; i < count; i++) {
            persons[i] = new Person(scanner.nextLine());
        }

        final String[] configs = scanner.nextLine().split("\\s+");

        final PersonSelectionAlgorithm alg = create(configs[0], Integer.parseInt(configs[1]));
        SelectionContext ctx = new SelectionContext();
        ctx.setAlgorithm(alg);

        final Person[] selected = ctx.selectPersons(persons);
        for (Person p : selected) {
            System.out.println(p.name);
        }
    }

    public static PersonSelectionAlgorithm create(String algType, int param) {
        switch (algType) {
            case "STEP": {
                return new TakePersonsWithStepAlgorithm(param);
            }
            case "LAST": {
                return new TakeLastPersonsAlgorithm(param);
            }
            default: {
                throw new IllegalArgumentException("Unknown algorithm type " + algType);
            }
        }
    }
}