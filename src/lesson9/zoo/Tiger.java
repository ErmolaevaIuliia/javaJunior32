package lesson9.zoo;

public class Tiger extends Animal{

    public void run(){
        System.out.println("Тигр бегает");
    }

    public void jump(){
        System.out.println("Тигр прыгает");
    }

    // переопределение метода - когда в родительском классе есть метод, который не нравится как он работает
    // то мы можем в дочернем классе такой же метод, только с другим телом

    public void voice(){
        System.out.println("рррр рррррр");
    }

}
