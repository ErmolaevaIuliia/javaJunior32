package lesson9;

public class Otlichnik extends Student{

    @Override // аннотация !никогда не удалять!
    public void printPerimetrTriangle(int a, int b, int c) {
        if(a>b+c || b>a+c || c>a+b){
            System.out.println("Это не треугольник!");
        }else {
            System.out.println(a+b+c);
        }
    }
}
