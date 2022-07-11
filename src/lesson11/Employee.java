package lesson11;

public class Employee extends Person{
    @Override // при переопределении можем только расширять
    protected String test(){
        return "Hello";
    }
}
