package lesson2;

public class Main3 {
    public static void main(String[] args) {
        /**
         * У нас есть оценка, которую ученик принес со школы
         * нужно напечатать на консоль: ОТЛИЧНО или ХОРОШО или НЕ ОЧЕНЬ или ПЛОХО
         * или ЭТО НЕ ОЦЕНКА, в зависимости от оценки, которую нам принесли
         */
        int mark = 3;

        switch (mark){
            case 5:
                System.out.println("ОТЛИЧНО");
                break;
            case 4:
                System.out.println("ХОРОШО");
                break;
            case 3:
                System.out.println("НЕ ОЧЕНЬ");
                break;
            case 2:
                System.out.println("ПЛОХО");
                break;
            default:
                System.out.println("ЭТО НЕ ОЦЕНКА");
        }
    }
}
