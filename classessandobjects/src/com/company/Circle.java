package com.company;

public class Circle {
    private double radius;
    private String color;


    public void setRadius(double r) {
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }

    public double getArea(){
        return Math.PI * radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
