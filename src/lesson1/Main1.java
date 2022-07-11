package lesson1;

public class Main1 {
    public static void main(String[] args) {
        int moneyNal = 1000;
        int priceOfPizza = 230;
        int priceOfBubble = 26;
        double priceOfCandy = 2.5;

        int pizzaAmount = moneyNal / priceOfPizza;
        int bubbleAmount = (moneyNal % priceOfPizza) / priceOfBubble;
        double candyAmount = ((moneyNal % priceOfPizza) % priceOfBubble) / priceOfCandy;
        int candyInt = (int) candyAmount;
        double change = moneyNal - (pizzaAmount * priceOfPizza) - (bubbleAmount * priceOfBubble) - (candyInt * priceOfCandy);
        int changeInt = (int) change;

        System.out.println("На эти деньги мы можем купить:");
        System.out.println("- " + pizzaAmount + " пиццы");
        System.out.println("- " + bubbleAmount + " жвачки");
        System.out.println("- " + candyInt + " конфет");
        System.out.println("Сдача с магазина: " + changeInt + " рубля.");

    }
}
