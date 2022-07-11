package lesson5;

public class Main1 {
    public static void main(String[] args) {
        /**
         *
         */
        int [] numbers = {3,5,6,8,4,6,8,44,234};
        for (int i = 0; i < numbers.length; i++){
            String currentNumFromMassive = Integer.toString(numbers[i]);
            int StartIndex4 = currentNumFromMassive.indexOf('4');
            if(StartIndex4 != -1){
                System.out.println(currentNumFromMassive);
            }
        }
    }
}
