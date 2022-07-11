package lesson7;

import java.text.DecimalFormat;

public class Circle {
    private int r;

    public Circle (){
    }

    public Circle (int r){
        this.r = r;}

    public void setR (int r){
        this.r = r;}

    public int getR (){
        return r;}

    public double perimetr () {
        return (2 * r * Math.PI);
    }

    public double area (){
        return (Math.PI*Math.pow(r,2));}

    public double diametr (){
        return r*2;}
}
