package lesson7.tours;

public class Main {
    public static void main(String[] args) {
        Tour tour1 = new Tour(1,5,"Cамолет", 5,120000,"полупансион");
        Tour tour2= new Tour(2,10,"Автобус", 3,80000,"завтраки");
        Tour tour3 = new Tour(3,14,"Cамолет", 4,270000,"завтраки");

        tour1.addCountry("Италия");
        tour2.addCountry("Грузия");
        tour2.addCountry("Армения");
        tour3.addCountry("Италия");
    }
}
