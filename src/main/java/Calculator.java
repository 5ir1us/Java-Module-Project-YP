import java.util.Scanner;
import java.util.Locale;
public class Calculator {
    Products product = new Products();


    public void priceName() {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);


        while (true) {
            System.out.println("Введите название продукта:");
            String name = scan.next();
            System.out.println("Ввидите сумму продукта в формате ХХ руб. ХХ коп.:");
            if (scan.hasNextFloat()) {
                float cost = scan.nextFloat();
                if (cost < 0) {
                    System.out.println("Вы ввели отрицательное значение,попробуйте еще раз");
                    continue;
                }
                product.resultName.append(name).append("-").append(String.format("%.2f",cost)).append("\n");
                product.resultCost += cost;
                System.out.println("Товар добавлен");
                System.out.println("Вы хотите добавить еще один продукт ? Ввидите любой символ");
                System.out.println("Ввидите Завершить для расчета");
                String addName = scan.next();
                if (addName.equalsIgnoreCase("завершить")) {
                    break;
                }
            } else {
                System.out.println("Ошибка!\n Введите данные заново");
                scan.next();
            }
        }
    }
}















