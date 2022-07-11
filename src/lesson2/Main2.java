package lesson2;

public class Main2 {
    public static void main(String[] args) {
        /**
         * У нас есть оценка, которую ученик принес со школы
         * нужно напечатать на консоль: ОТЛИЧНО или ХОРОШО или НЕ ОЧЕНЬ или ПЛОХО
         * или ЭТО НЕ ОЦЕНКА, в зависимости от оценки, которую нам принесли
         */
        int mark = 78;
        if (mark == 5){
            System.out.println("ОТЛИЧНО");
        }else if (mark == 4){
            System.out.println("ХОРОШО");
        }else if (mark == 3){
            System.out.println("НЕ ОЧЕНЬ");
        }else if (mark == 2){
            System.out.println("ПЛОХО");
        }else {
            System.out.println("ЭТО НЕ ОЦЕНКА");
        }
    }
}
