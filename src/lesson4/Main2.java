package lesson4;

public class Main2 {
    public static void main(String[] args) {
        /**
         *создать двухмерный массив
         */

        int [][] numbers = new int [8][8];

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(i == j) {
                    System.out.print("0  ");
                }else {
                    System.out.print("1  ");
                }
            }
            System.out.println();
        }
    }
}
