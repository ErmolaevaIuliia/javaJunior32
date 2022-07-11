package lesson3;

public class Main5 {
    public static void main(String[] args) {
        /**
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 1) Сколько в массиве четных цифр?
         */
        int[] numbers = {2,4,5,5,7,6,8,1};
        int countEvenNum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 == 0){
                countEvenNum++;
            }
        }
        System.out.println(countEvenNum);
    }
}
