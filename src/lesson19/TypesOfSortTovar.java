package lesson19;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TypesOfSortTovar {

    public static void printTovarsByPriceFromTo (SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new SortByPriceFromTo());
        sorted.addAll(tovars);

        System.out.println("------- сортировка по цене (сначала дорогие) -----");
        for(Tovar t: sorted){
            System.out.println(t);
        }
    }

    public static void printTovarsByPopular (SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if(o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if (o1.getPrice() != o2.getPrice()){
                    return o2.getPrice() - o1.getPrice();
                }
                if(o1.getSalePrice() != o2.getSalePrice()){
                    return o2.getSalePrice() - o1.getSalePrice();
                }
                if(o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if(!o1.getName().equals(o2.getName())){
                    return o1.getName().compareTo(o2.getName());
                }
                if(o1.getReviewCount() != o2.getReviewCount()){
                    return o2.getReviewCount() - o1.getReviewCount();
                }
                if(o1.getRateCount() != o2.getRateCount() ){
                    return o2.getRateCount() - o1.getRateCount();
                }
                return 0;
            }
        });
        sorted.addAll(tovars);

        System.out.println("------- сортировка по количеству продаж (сначала популярные) -----");
        for(Tovar t: sorted){
            System.out.println(t);
        }
    }

    public static void printTovarsByDiscount (SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {

                if (o1.getPrice()-o1.getSalePrice() != o2.getPrice()-o1.getSalePrice()){
                    return (o2.getPrice()-o1.getSalePrice()) - (o1.getPrice()-o1.getSalePrice());
                }
                if(o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if(o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if(!o1.getName().equals(o2.getName())){
                    return o1.getName().compareTo(o2.getName());
                }
                if(o1.getReviewCount() != o2.getReviewCount()){
                    return o2.getReviewCount() - o1.getReviewCount();
                }
                if(o1.getRateCount() != o2.getRateCount() ){
                    return o2.getRateCount() - o1.getRateCount();
                }
                return 0;
            }
        });
        sorted.addAll(tovars);

        System.out.println("------- сортировка по скидке -----");
        for(Tovar t: sorted){
            System.out.println(t);
        }
    }

    public static void printTovarsByReview(SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if(o1.getReviewCount() != o2.getReviewCount()){
                    return o2.getReviewCount() - o1.getReviewCount();
                }
                if(o1.getRateCount() != o2.getRateCount() ){
                    return o2.getRateCount() - o1.getRateCount();
                }
                if(o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if (o1.getPrice() != o2.getPrice()){
                    return o2.getPrice() - o1.getPrice();
                }
                if(o1.getSalePrice() != o2.getSalePrice()){
                    return o2.getSalePrice() - o1.getSalePrice();
                }
                if(o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if(!o1.getName().equals(o2.getName())){
                    return o1.getName().compareTo(o2.getName());
                }
                return 0;
            }
        });
        sorted.addAll(tovars);

        System.out.println("------- сортировка по отзывам (сначала обсуждаемые) -----");
        for(Tovar t: sorted){
            System.out.println(t);
        }
    }

    public static void printTovarsByRate(SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if(o1.getRateCount() != o2.getRateCount() ){
                    return o2.getRateCount() - o1.getRateCount();
                }
                if(o1.getReviewCount() != o2.getReviewCount()){
                    return o2.getReviewCount() - o1.getReviewCount();
                }
                if(o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if (o1.getPrice() != o2.getPrice()){
                    return o2.getPrice() - o1.getPrice();
                }
                if(o1.getSalePrice() != o2.getSalePrice()){
                    return o2.getSalePrice() - o1.getSalePrice();
                }
                if(o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if(!o1.getName().equals(o2.getName())){
                    return o1.getName().compareTo(o2.getName());
                }
                return 0;
            }
        });
        sorted.addAll(tovars);

        System.out.println("------- сортировка по рейтингу (сначала с лучшей оценкой) -----");
        for(Tovar t: sorted){
            System.out.println(t);
        }
    }
}
