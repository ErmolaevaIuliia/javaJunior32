package lesson3;

public class Main6 {
    public static void main(String[] args) {
        /**
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 2) Все числа с массива, которые больше 10, но меньше 25.
         */
        int[] numbers = {1,2,3,12,15,17,20,25,26,30};

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 10 && numbers[i] < 25){
                System.out.println(numbers[i]);
            }
        }
    }
}
