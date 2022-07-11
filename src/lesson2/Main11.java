package lesson2;

public class Main11 {
    public static void main(String[] args) {
        //Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500
        double month = 0;
        for(int sum=0;sum<=200000;sum+=9500) {
            month++;
        }
            System.out.println(month/12);
        }
    }
