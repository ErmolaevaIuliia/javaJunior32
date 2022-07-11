package lesson4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         * написать программу, которая будет работать 10 лет,
         * если ее не остановить. А когда мы ее остановим,
         * она нам напишет точное время сколько прошло от старта
         */

        for(int year = 0; year < 10; year++){
            for(int month = 0; month < 12; month++){
                for(int day = 0; day < 30; day++){
                    for(int hour = 0; hour < 24; hour++){
                        for(int min = 0; min < 60; min++){
                            for(int sec = 0; sec < 60; sec++){
                                System.out.printf("От старта прошло: %d год, %d месяца, %d дня, %d часов, %d минуты, %d секунд \n", year, month, day, hour, min, sec);
                                Thread.sleep(1000);
                            }
                        }
                    }
                }
            }
        }
    }
}
