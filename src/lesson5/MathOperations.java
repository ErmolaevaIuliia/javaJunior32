package lesson5;

public class MathOperations {
    /**
     * создать метод, в который мы передаем три стороны треугольника,
     * а метод будет печатать на консоль какой это вид треугольника
     */

    /**
     * 1 - модификатор доступа (регулировка области видимости данного метода)
     * public - доступен всем внутри всего проекта
     * private - доступ внутри текущего файла
     * _____ (нет слова) - доступ внутри текущего пакета (папки) и наследникам данного файла
     * protected - доступ внутри текущего файла и наследникам данного файла
     * <p>
     * 2 - static (или есть, или нет) - не пишем, если обращаемся к конкретному объекту
     * 3 - возвращаемый тип (void или тип)
     * 4 - название метода
     * 5 - входящие параметры
     * 6 - тело выполнения метода
     */

    public static void printTypeOfTriangle(int a, int b, int c) {
        // 3 5 6  6 5 6  3 3  12
        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("Такого треугольника не существует");
            return;
        }
        if (a == b && b == c && a == c) {
            System.out.println("равносторонний треугольник");
        } else if (a != b || a != c || b != c) {
            System.out.println("разносторонний треугольник");
        } else {
            System.out.println("равнобедренный треугольник");
        }
    }

    /**
     * в метод мы передаем три стороны треугольника
     * и метод ВОЗВРАЩАЕТ значение площади треугольника
     */

    public static void PerimetrOfTriangle(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static double SquareOfTriangle(int a, int b, int c) {
        double p = 0.5 * (a+b+c);
        double s = Math.sqrt(p* (p-a)* (p-b)*(p-c));
        return s;
    }
    // перегружегнные методы  - одинаковые сигнатуры метода с разными входящими параматерами
    public static double SquareOfTriangle(int osnovanie, int visota) {
        double s = 0.5 * osnovanie * visota;
        return s;
    }
}
