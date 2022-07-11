package lesson4;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        /**
         * вывести на консоль другие фигуры (ромбик)
         */
        int[][] numbers = new int[7][7];
        int n = numbers.length / 2;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (j == n || j >= n - i && j <= n + i) {
                    System.out.print("0  ");
                } else {
                    System.out.print("1  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (j >= i+1 && j < 2*n - i) {
                    System.out.print("0  ");
                } else {
                    System.out.print("1  ");
                }
            }
            System.out.println();
        }
    }
}