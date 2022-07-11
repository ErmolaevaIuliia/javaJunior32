package lesson7;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle (){
    }

    public Rectangle (int a, int b){
        this.a = a;
        this.b = b;}

    public void setA (int a){
        this.a = a;}

    public void setB (int b){
        this.b = b;}

    public int getA (){
        return a;}

    public int getB (){
        return b;}

    public double perimetr () {
        return (a+b)*2;
    }
    public double area (){
        return a*b;}

    public double diagonal (){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));}
}
