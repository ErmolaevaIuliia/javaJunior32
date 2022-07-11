package lesson3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        /**
         * нам пользователь задал пароль
         * нам нужно напечатать на консоль пароль подходит или нет.
         * пароль подходит, если:
         * - он содержит более 8 символов
         * - он содержит цифру в себе
         * - он содержит большую букву
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String inputPassword = scanner.nextLine();

        char[] charsFromPassword = inputPassword.toCharArray();
        if(charsFromPassword.length < 8){
            System.out.println("Пароль должен содержать более 8 символов!!!");
            return;
        }
        // fdsfgd
        int countNumbers = 0;
        for(int i = 0; i < charsFromPassword.length; i++){
            if(charsFromPassword[i] == '0' ||
                    charsFromPassword[i] == '1' ||
                    charsFromPassword[i] == '2' ||
                    charsFromPassword[i] == '3' ||
                    charsFromPassword[i] == '4' ||
                    charsFromPassword[i] == '5' ||
                    charsFromPassword[i] == '6'){
                countNumbers++;
            }
        }
        if(countNumbers == 0){
            System.out.println("Пароль должен содержать цифру");
        }
        else {
            System.out.println("Молодец");
        }
    }
}
