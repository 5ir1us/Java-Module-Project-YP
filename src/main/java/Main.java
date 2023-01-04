public class Main {

    public static void main(String[] args) {
        CounterParameters counter = new CounterParameters();
        System.out.println(counter.Person());


        Calculator calculator = new Calculator();
        calculator.priceName();
        System.out.println("Добавленные товары:");
        System.out.println(calculator.product.resultName);

        float averageCheck = (float)  calculator.product.resultCost / counter.person;
        String rub;
         if (averageCheck %100 > 4 && averageCheck %100 < 21) {
             rub= "рублей";
         }else if (averageCheck %10 == 1){
             rub = "рубль";
         }else {
             rub = "рубля";
         }
         System.out.println(String.format("%.2f %s - с каждого гостя",averageCheck,rub));

    }
}
