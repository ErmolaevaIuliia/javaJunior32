package lesson5;

public class MethodsHomework {
    /**
     * Создать методы:
     * 1) Метод принимает входящими параметрами текст,
     * и возвращает кол-во гласных букв в тексте
     */
    public static String checkVowels(String text) {
        int vowelsCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'y') {
                vowelsCount++;
            }
        }
        System.out.println("1) Количество гласных в тексте: " + vowelsCount);
        return Integer.toString(vowelsCount);
    }

    /**
     * 2) Метод принимает входящими параметрами текст,
     * печатает на консоль этот же текст, только в обратном порядке
     */
    public static String textReverse(String text) {
        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println("2) Обратный текст: " + reverse);
        return reverse;
    }

    /**
     * 3) Метод принимает входящими параметрами текст,
     * и печатает на консоль сколько в тексте знаков пунктуации
     */
    public static String checkPunctuation(String text) {
        int punct = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '.' || ch == ',' || ch == ':' || ch == ';' || ch == '?' || ch == '!' || ch == '-' || ch == ')' || ch == '(' || ch == '"') {
                punct++;
            }
        }
        System.out.println("3) Количество знаков пунктуации в тексте: " + punct);
        return Integer.toString(punct);
    }

    /**
     * 4) В метод передаем кол-во строк и кол-во колонок,
     * метод печатает на консоль квадрат из единичек по этим параметрам
     */
    public static int squareMassive(int a, int b) {
        System.out.println("4) Квадрат с параметрами: " + a + " и " + b);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("  1 ");
            }
            System.out.println();
        }
        return 0;
    }

    /**
     * 5) В метод передаем 3 числа,
     * метод должен вернуть меньшее число из 3х
     */

    public static int minNum(int a, int b, int c) {
        int minNum = Math.min(a, Math.min(b, c));
        System.out.println("5) Меньшее число из трех: " + minNum);
        return minNum;
    }

    /**
     * 6) В метод передаем сумму депозита, банковский процент и кол-во лет,
     * и метод возвращает значение прироста процентов которые мы заберем с банка через столько лет
     */

    public static double gain(double sum, double percent, int years) {
        double gain = sum * percent / 100 / 12;
        double newSum = sum + gain;
        for (int month = 0; month < years * 12 - 1; month++) {
            newSum = newSum + newSum * percent / 100 / 12;
        }
        System.out.println("6) Прирост: " + (newSum - sum));
        return 0;
    }

    /**
     * 7) В метод передаем email, метод должен вернуть true или false подходит нам email или нет.
     * Подходит: когда содержит @, когда нет пробелов, когда часть текста после @ содержит в себе точку
     */

    public static boolean checkEmail(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        if(m.matches()){
            System.out.println("7) Email " + email + " подходит!");
            return true;
        }
        System.out.println("7) Email " + email + " не подходит!");
        return false;
    }
}
