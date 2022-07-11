package lesson4;

public class Main3 {
    public static void main(String[] args) {
        /**
         * Вывести обратную диагональ в двухмерном массиве
         * единичками, а остальное ноликами
         */

        int [][] numbers = new int [8][8];

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(j == numbers[i].length-i-1){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
