package lesson13;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5,1998,5,"серебро");
        Coin coin2 = new Coin(10,1998,5,"серебро");
        Coin coin3 = new Coin(20,1998,5,"серебро");
        Coin coin4 = new Coin(20,1998,5,"серебро");
        Coin coin5 = new Coin(50,1998,5,"серебро");

        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for(Coin c:coins){
            System.out.println(c);
        }
    }
}
