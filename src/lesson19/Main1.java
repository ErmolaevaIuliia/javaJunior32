package lesson19;

import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Мышка", 1250, 900, 231,10,5);
        Tovar tovar2 = new Tovar("Мышка!", 1250, 900, 231,2,4);
        Tovar tovar3 = new Tovar("Ноутбук", 89900, 79900, 43,99,4);
        Tovar tovar4 = new Tovar("Клавиатура", 1900, 900, 54,0,0);
        Tovar tovar5 = new Tovar("Микрофон", 10200, 9000, 78,5,3);

        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);

        System.out.println("------- сортировка по цене (сначала недорогие) -----");
        for (Tovar t: tovars) {
            System.out.println(t.toString());
        }
        System.out.println();
        TypesOfSortTovar.printTovarsByPriceFromTo(tovars);
        System.out.println();
        TypesOfSortTovar.printTovarsByPopular(tovars);
        System.out.println();
        TypesOfSortTovar.printTovarsByDiscount(tovars);
        System.out.println();
        TypesOfSortTovar.printTovarsByReview(tovars);
        System.out.println();
        TypesOfSortTovar.printTovarsByRate(tovars);

    }
}
