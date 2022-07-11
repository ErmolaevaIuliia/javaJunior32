package lesson4;

public class Main5 {
    public static void main(String[] args) {
        /**
         *вывести на консоль другие фигуры (ромбик двухглавый)
         */

        int[][] numbers = new int[8][8];
        int a = numbers.length / 2;
        int b = a - 1;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (j == a || j == b || j >= b - i && j <= a + i) {
                    System.out.print("0  ");
                } else {
                    System.out.print("1  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (j >= 0 + i && j <= a + b - i) {
                    System.out.print("0  ");
                } else {
                    System.out.print("1  ");
                }
            }
            System.out.println();
        }
    }
}
