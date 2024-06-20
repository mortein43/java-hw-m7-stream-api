import com.eizenheim.javahwm7streamapi.Device;
import com.eizenheim.javahwm7streamapi.Product;
import com.eizenheim.javahwm7streamapi.Product.Category;
import com.eizenheim.javahwm7streamapi.Proector;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Main {

    private static boolean isPlindrome(int number) {
        String str = Integer.toString(Math.abs(number));
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        out.println("Завдання 1:");
        out.println("Наш масив випадково згенерованих чисел:");
        ArrayList <Integer> arrayInt = new ArrayList();
        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            arrayInt.add(rand.nextInt(-1000, 1000));
            out.print(arrayInt.get(i) + " ");
        }
        out.println("");
        out.println("Кількість додатніх чисел: " + arrayInt.stream().filter(num -> num > 0).count());
        out.println("Кількість від’ємних чисел: " + arrayInt.stream().filter(num -> num < 0).count());
        out.println("Кількість двозначних чисел: " + arrayInt.stream().filter(num -> num < 100 && num > 9 || num > -100 && num < -9).count());
        out.println("Кількість дзеркальних чисел: " + arrayInt.stream().filter(Main::isPlindrome).count());

        out.println("\nЗавдання 2:");
        ArrayList<Product> arrayProducts = new ArrayList<>();
        arrayProducts.add(new Product("Кефір", 40, Category.МОЛОКО));
        arrayProducts.add(new Product("Сир", 70, Category.МОЛОКО));
        arrayProducts.add(new Product("Йогурт", 55, Category.МОЛОКО));
        arrayProducts.add(new Product("Кефір", 35, Category.МОЛОКО));

        arrayProducts.add(new Product("Гречка", 38, Category.БАКАЛІЯ));
        arrayProducts.add(new Product("Рис", 25, Category.БАКАЛІЯ));
        arrayProducts.add(new Product("Борошно", 30, Category.БАКАЛІЯ));

        arrayProducts.add(new Product("Огірок", 26, Category.ОВОЧІ));
        arrayProducts.add(new Product("Помідор", 30, Category.ОВОЧІ));
        arrayProducts.add(new Product("Картопля", 15, Category.ОВОЧІ));

        arrayProducts.add(new Product("Яблоко", 10, Category.ФРУКТИ));
        arrayProducts.add(new Product("Банан", 27, Category.ФРУКТИ));
        arrayProducts.add(new Product("Ківі", 43, Category.ФРУКТИ));

        out.println("Показуємо всі продукти:");
        out.println(arrayProducts.stream().map(Product::toString).collect(Collectors.joining("\n")));

        out.println("Показуємо продукти з назвою менше 5 букв:");
        out.println(arrayProducts.stream().filter(product -> product.getName().length()<5).map(Product::toString).collect(Collectors.joining("\n")));

        out.println("Користувач ввів \"Кефір\", показуємо скільки раз зустрічається кефір:");
        out.println("Продукт з назвою кефір зустрічається - " + arrayProducts.stream().filter(product -> product.getName()=="Кефір").count() + " раз.");

        out.println("Показуємо всі продукти, які починаються на букву \'К\':");
        out.println(arrayProducts.stream().filter(product -> product.getName().substring(0,1).equals("К")).map(Product::toString).collect(Collectors.joining("\n")));

        out.println("Показуємо продукти із категорії Молоко:");
        out.println(arrayProducts.stream().filter(product -> product.getCategory().equals(Category.МОЛОКО)).map(Product::toString).collect(Collectors.joining("\n")));



        out.println("\nЗавдання 3:");
        ArrayList <Device> arrayDevice = new ArrayList();

        arrayDevice.add(new Device("Dell latitude 7440", 2023, 35000, "grey", "Ноутбук"));
        arrayDevice.add(new Device("Logitech Brio 100", 2020, 1299, "black", "Веб камера"));
        arrayDevice.add(new Device("Canon PIXMA E414", 2019, 2919, "black", "Принтер"));
        arrayDevice.add(new Device("Delonghi Magnifica Start", 2023, 15999, "black", "Кавомашина"));

        out.println("Всі пристрої:");
        out.println(arrayDevice.stream().map(Device::toString).collect(Collectors.joining()));

        out.println("Всі пристрої коліру - black:");
        out.println(arrayDevice.stream().filter(device -> device.getColor().equals("black")).map(Device::toString).collect(Collectors.joining()));

        out.println("Всі пристрої 2023 року випуску:");
        out.println(arrayDevice.stream().filter(device -> device.getYear() == 2023).map(Device::toString).collect(Collectors.joining()));

        out.println("Всі пристрої дорожче 3000:");
        out.println(arrayDevice.stream().filter(device -> device.getPrice() > 3000).map(Device::toString).collect(Collectors.joining()));

        out.println("Всі пристрої типу ноутбук:");
        out.println(arrayDevice.stream().filter(device -> device.getType().equals("Ноутбук")).map(Device::toString).collect(Collectors.joining()));

        out.println("Всі пристрої чий рік випуску з 2020 року по 2024 рік:");
        out.println(arrayDevice.stream().filter(device -> device.getYear() >= 2020 && device.getYear() <=2024).map(Device::toString).collect(Collectors.joining()));


        out.println("Завдання 4:");
        ArrayList<Proector> arrayProector = new ArrayList();

        arrayProector.add(new Proector("Samsung The Freestyle 2nd-Gen White", 2020, 29699, "Samsung"));
        arrayProector.add(new Proector("BenQ MW560, DLP", 2021, 17865, "BenQ"));
        arrayProector.add(new Proector("ViewSonic M1+", 2022, 16210, "ViewSonic"));
        arrayProector.add(new Proector("Epson EH-TW7000 White", 2024, 74715, "Epson"));

        out.println("Виводимо всі проектори:");
        out.println(arrayProector.stream().map(Proector::toString).collect(Collectors.joining()));

        out.println("Виводимо всі проектори виробника Epson:");
        out.println(arrayProector.stream().filter(proector -> proector.getManufacturer().equals("Epson")).map(Proector::toString).collect(Collectors.joining()));

        out.println("Виводимо всі проектори поточного року:");
        out.println(arrayProector.stream().filter(proector -> proector.getYear() == LocalDate.now().getYear()).map(Proector::toString).collect(Collectors.joining()));

        out.println("Виводимо всі проектори ціна яких вище 17000:");
        out.println(arrayProector.stream().filter(proector -> proector.getPrice() > 17000).map(Proector::toString).collect(Collectors.joining()));

        out.println("Виводимо всі проектори відсортовані по ціні у порядку зростання:");
        out.println(arrayProector.stream().sorted(Comparator.comparing(Proector::getPrice)).map(Proector::toString).collect(Collectors.joining()));

        out.println("Виводимо всі проектори відсортовані по ціні у порядку спадання:");
        out.println(arrayProector.stream().sorted(Comparator.comparing(Proector::getPrice).reversed()).map(Proector::toString).collect(Collectors.joining()));

        out.println("Виводимо всі проектори відсортовані по року випуску по зростанню:");
        out.println(arrayProector.stream().sorted(Comparator.comparing(Proector::getYear)).map(Proector::toString).collect(Collectors.joining()));

        out.println("Виводимо всі проектори відсортовані по року випуску по спаданню:");
        out.println(arrayProector.stream().sorted(Comparator.comparing(Proector::getYear).reversed()).map(Proector::toString).collect(Collectors.joining()));

    }
}