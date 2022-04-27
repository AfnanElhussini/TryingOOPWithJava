package com.company;

public class Car {
  public String name;
    int maxSpeed;
    float price;
    int model;

void setName(String n){
    name=n;
}
   String getName(){
    return name;
    }

// Attributes always in left and paramters in Right
 public void setModel(int m){
    if(m>=2015){
        model=m;}else{
        System.out.println("Sorry, We don't accept this model");
    }

}}
