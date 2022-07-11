package lesson4;

import lesson5.SaperUtils;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Saper {
    public static void main(String[] args) {

        System.out.println("Выберите уровень игры: ");
        System.out.println("1 - Новичок");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();
        int[][] fields = null;

        if(level.equals("1") || level.equalsIgnoreCase("Новичок")){
            fields = new int[9][9];

            for(int mine = 0; mine < 10; mine++){
                SaperUtils.addMine(fields,9,9);
        }
    }
        if(level.equals("2") || level.equalsIgnoreCase("Любитель")){
            fields = new int[16][16];

            for(int mine = 0; mine < 40; mine++){
                SaperUtils.addMine(fields,16,16);
            }
        }
        if(level.equals("3") || level.equalsIgnoreCase("Профессионал")){
            fields = new int[16][30];

            for(int mine = 0; mine < 99; mine++){
                SaperUtils.addMine(fields,16,30);
            }
        }
        if(level.equals("4") || level.equalsIgnoreCase("Особый")){
            System.out.println("Укажите ширину поля: ");
            Scanner scanner1 = new Scanner(System.in);
            String width = scanner1.nextLine();

            System.out.println("Укажите длину поля: ");
            Scanner scanner2 = new Scanner(System.in);
            String length = scanner2.nextLine();

            System.out.println("Укажите количество мин: ");
            Scanner scanner3 = new Scanner(System.in);
            String amountOfMines = scanner3.nextLine();

            int intWidth = Integer.parseInt(width);
            int intLength = Integer.parseInt(length);
            int intAmountOfMines = Integer.parseInt(amountOfMines);

            fields = new int[intWidth][intLength];

            for(int mine = 0; mine < intAmountOfMines; mine++){
                SaperUtils.addMine(fields,intWidth,intLength);
            }
        }
        // печатаем поле с минами
        for(int i = 0; i < fields.length; i++){
            for(int j = 0; j < fields[i].length; j++){
                if(fields[i][j] == -1){
                    System.out.print(" * ");
                }else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
}
}