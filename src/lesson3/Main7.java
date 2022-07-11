package lesson3;

public class Main7 {
    public static void main(String[] args) {
        /**
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 3) Все числа в обратном порядке. При этом дважды вывести те числа,
         * которые являются кратными трем.
         */

        int[] numbers = {1, 2, 3, 12, 15, 17, 20, 25, 26, 30};

        for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.println(numbers[i]);
                if (numbers[i] % 3 == 0){
                    System.out.println(numbers[i]);
            }
        }
    }
}
