package com.company;

public class Main {

    public static void main(String[] args) {
// object
        Car c1 =new Car();
        c1.name="tesla";
        System.out.println(c1.name);
        c1.maxSpeed=210;
        System.out.println(c1.maxSpeed);
        Car c2 = new Car();
        c2.name="BMW";
        System.out.println(c2.name);
        c1.setName("KIA");
        System.out.println(c1.name);
        c1.getName();
        System.out.println(c1.getName());
        c1.model=2021;
        System.out.println(c1.model);

    }

}
