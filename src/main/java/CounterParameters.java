import java.util.Scanner;

public class CounterParameters {
    Scanner scan = new Scanner(System.in);
     int person;

    public int Person() {

        while (true) {

            System.out.println("На скольких человек необходимо разделить счёт?");
            if (scan.hasNextInt()) {
                person = scan.nextInt();
                if (person <= 1) {
                    System.out.println("Ошибка!");
                     continue;
                }
                System.out.println("Делим на :"  );
                return person;
            }else {
                System.out.println("Ошибка!");
                scan.next();
            }

        }


    }
}
