package lesson3;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        /**
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 4) ***Только те числа, которые содержат в себе символ 4 (не для всех)
         */

        int[] numbers = {1, 2, 4, 14, 15, 17, 20, 24, 26, 40};
        String[] strNum = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strNum[i] = String.valueOf(numbers[i]);
            if (String.valueOf(numbers[i]).matches(".*4.*")) {
                System.out.println(String.valueOf(numbers[i]));
            }else{
            }
        }
    }
}