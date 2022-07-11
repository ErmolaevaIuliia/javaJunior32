package lesson7;

public class Main2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setR(10);
        System.out.println("Окружность круга с радиусом "+circle.getR()+" равна: "+circle.perimetr());
        System.out.println("Площадь круга с радиусом "+circle.getR()+" равна: "+circle.area());
        System.out.println();

        Square square = new Square(17);
        System.out.println("Периметр квадрата "+square.getA()+"x"+square.getA()+" равeн: "+square.perimetr());
        System.out.println("Площадь квадрата "+square.getA()+"x"+square.getA()+" равна: "+square.area());
        System.out.println("Диагональ квадрата "+square.getA()+"x"+square.getA()+" равна: "+square.diagonal());
        System.out.println();

        Rectangle rectangle = new Rectangle(15,32);
        System.out.println("Периметр прямоугольника "+rectangle.getA()+"x"+rectangle.getB()+" равeн: "+rectangle.perimetr());
        System.out.println("Площадь прямоугольника "+rectangle.getA()+"x"+rectangle.getB()+" равна: "+rectangle.area());
        System.out.println("Диагональ прямоугольника "+rectangle.getA()+"x"+rectangle.getB()+" равна: "+rectangle.diagonal());
    }
}
