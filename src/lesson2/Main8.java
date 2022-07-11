package lesson2;

public class Main8 {
    public static void main(String[] args) {
        // только четные от -100 до -50
       for (int i = -100; i <= -50; i++){
           if(i%2==0) {
               System.out.println(i);
           }
        }

    }
}