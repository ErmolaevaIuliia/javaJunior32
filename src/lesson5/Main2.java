package lesson5;

public class Main2 {
    public static void main(String[] args) {
        //
        double square1 = MathOperations.SquareOfTriangle(2,4,3);
        double square2 = MathOperations.SquareOfTriangle(4,6);
        if(square1>square2){
            System.out.println("Первый треугольник больше!");
        }else if(square1<square2){
            System.out.println("Второй треугольник больше!");
        }else {
            System.out.println("Треугольники равны!");
        }
    }
}
