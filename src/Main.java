import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String name1 = scanner.nextLine();

        Person[] people = {
                new Person("Asan", 21, "Bishkek"),
                new Person("Uson", 22, "Kara-Balta"),
                new Person("Adyl", 23, "Talas"),
        };

        String[] arrString = {
                "Cat Dog Horse Horse Horse Horse Horse Fish Fish Fish Cow Cow",
                "Cat Dog Dog Horse Horse Horse Horse Fish Fish Cow Cow Cow",
                "Cat Cat Dog Horse Horse Horse Horse Horse Horse Fish Fish Fish Fish Fish Cow Cow",
        };

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            if (name1.equals(people[i].getName())) {
                String[] arr = arrString[i].split(" ");
                Animal[] animals = new Animal[arr.length];
                int k1 = 0, k2 = 0, k3 = 0, k4 = 0, k5 = 0;
                for (int j = 0; j < animals.length; j++) {
                    if (arr[j].equals("Cat")) {
                        String nameStr = arr[j] + (k1 + 1);
                        animals[j] = new Cat(nameStr, random.nextInt(1, 5), random.nextInt(2, 7));
                        k1++;
                    } else if (arr[j].equals("Dog")) {
                        String nameStr = arr[j] + (k2 + 1);
                        animals[j] = new Dog(nameStr, random.nextInt(1, 5), random.nextInt(4, 10));
                        k2++;
                    } else if (arr[j].equals("Horse")) {
                        String nameStr = arr[j] + (k3 + 1);
                        animals[j] = new Horse(nameStr, random.nextInt(5, 7), random.nextInt(70, 150));
                        k3++;
                    } else if (arr[j].equals("Fish")) {
                        String nameStr = arr[j] + (k4 + 1);
                        animals[j] = new Fish(nameStr, random.nextInt(1, 2), random.nextInt(1, 3));
                        k4++;
                    } else if (arr[j].equals("Cow")) {
                        String nameStr = arr[j] + (k5 + 1);
                        animals[j] = new Cow(nameStr, random.nextInt(3, 5), random.nextInt(50, 120));
                        k5++;
                    }
                }
                people[i].setAnimals(animals);
                System.out.println(people[i].toString());
                break;
            }
        }
    }
}