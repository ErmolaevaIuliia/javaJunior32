package lesson13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main1 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("german");
        hashSet.add("english");
        hashSet.add("french");
        hashSet.add("french");
        hashSet.add("italian");

        for(Iterator<String> iterator=hashSet.iterator();iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

    }
}
