package lesson6;

import java.util.Scanner;

public class ScannerUtils {
    // метод будет возвращать страну, куда хочет поехать пользователь
    public static String getInputCountry(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну поездки: ");
        String country = scanner.nextLine();
        return country;
    }
    // метод будет возвращать суммы ОТ
    public static int getInputSumMin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость тура от: ");
        String sumMin = scanner.nextLine();
        return Integer.parseInt(sumMin);
    }
    // метод будет возвращать суммы ДО
    public static int getInputSumMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость тура до: ");
        String sumMax = scanner.nextLine();
        return Integer.parseInt(sumMax);
    }
    public static int getInputAmountDays(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней тура: ");
        String days = scanner.nextLine();
        return Integer.parseInt(days);
    }
}
