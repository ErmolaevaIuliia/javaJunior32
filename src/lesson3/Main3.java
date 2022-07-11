package lesson3;

public class Main3 {
    public static void main(String[] args) {
        /**
         * есть массив символов, вывести на консоль весь массив
         * в обратном порядке
         */

        char[] symbols = {'&','d','e','g','r','3','g','8',};

//        System.out.println(symbols[7]);
//        System.out.println(symbols[6]);
//        System.out.println(symbols[5]);
//        System.out.println(symbols[4]);
//        System.out.println(symbols[3]);
//        System.out.println(symbols[2]);
//        System.out.println(symbols[1]);
//        System.out.println(symbols[0]);

        for(int i = symbols.length - 1; i >= 0; i--){
            System.out.println(symbols[i]);
        }
    }
}
