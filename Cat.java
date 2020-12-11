package com.inheritanceJava;

public class Cat extends Animal{
    public Cat(){
        super(7);
        System.out.println("A cat has been created.. ");
    }
    public void meaow(){
        System.out.println("Cat meaows..");
    }

    public void prance(){
        System.out.println("cat prancing");
    }

}
