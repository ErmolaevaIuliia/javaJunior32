package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Мы - турагентство
         * Программа отображает правильный набор туров
         * в зависимости от потребностей человека
         */

        String[][] tours = {{"1", "Италия", "5 дней", "Самолет","5 звезд","120000","полупансион"},
                {"2", "Грузия, Армения", "10 дней", "Автобус","3 звезды","80000","завтраки"},
                {"3", "Италия", "14 дней", "Самолет","4 звезды","270000","завтраки"},
                {"4", "Индонезия", "10 дней", "Самолет","3 звезды","120000","полупансион"},
                {"5", "Япония", "5 дней", "Самолет","5 звезды","300000","завтраки"},
                {"6", "Италия", "7 дней", "Самолет","3 звезды","200000","полупансион"},
                {"7", "Турция", "14 дней", "Самолет","3 звезды","120000","все включено"},
                {"8", "Турция", "7 дней", "Самолет","4 звезды","320000","полупансион"},
                {"9", "ОАЭ", "5 дней", "Самолет","5 звезд","120000","завтраки"},
                {"10", "Шри-Ланка", "10 дней", "Самолет","5 звезд","120000","полупансион"}};
        System.out.println("Добрый день! Выберите действие: ");
        System.out.println("1 - Узнать среднюю стоимость тура в определенную страну");
        System.out.println("2 - Узнать среднюю стоимость любого тура");
        System.out.println("3 - Вывести туры в определенную страну");
        System.out.println("4 - Вывести туры ценой ОТ и ДО");
        System.out.println("5 - Вывести туры +-2 дня от введенной длительности в определенную страну");
        System.out.println("6 - Вывести выгодные туры со стоимостью до 10 000 рублей в день");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if(answer.equals("1")){
            String country = ScannerUtils.getInputCountry();
            int averagePrice = TourUtils.getAveragePriceByCountry(tours, country);
            System.out.println("Средняя стоимость в " + country + " = " + averagePrice);
        }else if(answer.equals("2")){
            int averagePrice = TourUtils.getAveragePrice(tours);
            System.out.println("Средняя стоимость любого тура" + " = " + averagePrice);
        }else if(answer.equals("3")){
            String country = ScannerUtils.getInputCountry();
            System.out.println("Туры в " + country + ": ");
            TourUtils.printToursByCountry(tours, country);
        }else if(answer.equals("4")){
            int min = ScannerUtils.getInputSumMin();
            int max = ScannerUtils.getInputSumMax();
            System.out.println("Туры ценой от " + min + " до " + max + ": ");
            TourUtils.printTourByPriceMinMax(tours, min, max);
        }else if(answer.equals("5")) {
            int days = ScannerUtils.getInputAmountDays();
            String country = ScannerUtils.getInputCountry();
            System.out.println("Туры длительностью от " + (days-2) + " до " + (days+2) + " дней в страну " + country + ": ");
            TourUtils.printTourByDays(tours,days,country);
        }else if(answer.equals("6")) {
            System.out.println("Туры стоимостью от 10 000 рублей в день: ");
            TourUtils.printTourByPricePerDay(tours);
        }
    }
}
