package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> texts = new LinkedList<>();
        texts.add("hello");
        texts.add("flower");
        texts.add("rose");
        texts.add("sun");
        texts.add(2,"glow");
        System.out.println(texts);
    }
}
