package lesson11;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Ivan",30);
        Person person1 = new Person("Елена",25);
        System.out.println(person.equals(person1));
        System.out.println(person);

        // a=b b=c c=a
        // a=b b=a
        // a=b

        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
//        String s = "hello"; // единственный класс, который можно создать без оператора new
//        String s1 = "hello"; // то есть при сравнении (==) ссылки будут одинаковыми
//        String s2 = new String("hello");
//        System.out.println(s==s2);

//71029023
//886025815
    }
}
