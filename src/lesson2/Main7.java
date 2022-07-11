package lesson2;

public class Main7 {
    public static void main(String[] args) {
        /**
         * Сколько денег мы заберем с банка
         * если положим 100 000 рублей на 5 лет под 8 процентов депозита
         */
        double money = 100000;
        int years = 5;
        int percent = 8;

        for(int month = 0; month < 12 * years; month++){
            money = money + ((money / 100 * percent) / 12);
        }
        System.out.println(money); //148932
    }
}
