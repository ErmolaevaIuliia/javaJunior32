package lesson6;

public class TourUtils {
    // Метод
    public static int getAveragePriceByCountry(String[][] tours, String countryBy) {
        int priceOfAllTours = 0;
        int countTours = 0;

        for (int i = 0; i < tours.length; i++) {
            // франция         грузия, армения
            String countriesFromCurrentTour = tours[i][1];
            // убрать запятые между слов
            countriesFromCurrentTour = countriesFromCurrentTour.replace(",", "");
            // разбили на массив стран
            String[] countries = countriesFromCurrentTour.split(" ");
            // проверили наличие страны в туре
            if (TourUtils.findCountry(countries, countryBy)) {
                // считаем кол-во туров с такой страной
                countTours++;
                // наращиваем на переменную стоимости туров
                priceOfAllTours = priceOfAllTours + Integer.parseInt(tours[i][5]);
            }
        }
        return priceOfAllTours / countTours;
    }

    private static boolean findCountry(String[] countries, String countryBy) {
        // for each (для каждого)
        for (String c : countries) {
            if (countryBy.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public static void printToursByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            String countries = tours[i][1];
            countries = countries.replace(",", "");
            String[] countrArr = countries.split(" ");
            if (TourUtils.findCountry(countrArr, country)) {
                TourUtils.printTour(tours, i);
            }
        }
    }

    private static void printTour(String[][] tours, int i) {
        System.out.printf("Тур: %s, за %s рублей, %s, на %s, %s, %s \n",
                tours[i][1], tours[i][5], tours[i][4], tours[i][2], tours[i][6], tours[i][3]);
    }

    public static int getAveragePrice(String[][] tours) {
        int priceOfAllTours = 0;
        int countTours = 0;

        for (int i = 0; i < tours.length; i++) {
            countTours++;
            priceOfAllTours = priceOfAllTours + Integer.parseInt(tours[i][5]);
        }
        return priceOfAllTours / countTours;
    }

    // Вывести туры ценой ОТ и ДО
    public static void printTourByPriceMinMax(String[][] tours, int min, int max) {
        for (int i = 0; i < tours.length; i++) {
            String price = tours[i][5];
            int intPrice = Integer.parseInt(price);
            if (intPrice >= min && intPrice <= max) {
                TourUtils.printTour(tours, i);
            }
        }
    }

    // Вывести туры +-2 дня от введенной длительности в определенную страну
    public static void printTourByDays(String[][] tours, int days, String country) {
        for (int i = 0; i < tours.length; i++) {
            String daysList = tours[i][2];
            daysList = daysList.replace(" дней", "");
            int intDaysList = Integer.parseInt(daysList);
            String countries = tours[i][1];
            countries = countries.replace(",", "");
            String[] countrArr = countries.split(" ");
            if (intDaysList >= (days-2) && intDaysList <= (days+2)) {
                if (TourUtils.findCountry(countrArr, country)) {
                    TourUtils.printTour(tours, i);
                }
            }
        }
    }
    public static void printTourByPricePerDay (String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            String daysList = tours[i][2];
            daysList = daysList.replace(" дней", "");
            int intDaysList = Integer.parseInt(daysList);
            String price = tours[i][5];
            int intPrice = Integer.parseInt(price);
            if (intPrice/intDaysList <= 10000) {
                TourUtils.printTour(tours, i);
            }
        }
    }
}

