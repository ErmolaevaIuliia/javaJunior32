package lesson7;

public class Square {
    private int a;

    public Square (){
    }

    public Square (int a){
        this.a = a;}

    public void setA (int a){
        this.a = a;}

    public int getA (){
        return a;}

    public double perimetr () {
        return a*4;
    }

    public double area (){
        return Math.pow(a,2);}

    public double diagonal (){
        return a*Math.sqrt(2);}
    }
