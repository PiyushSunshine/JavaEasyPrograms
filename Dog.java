package com.HackerRankJava;

public class Dog extends Animal {


    public Dog(){
        super(15);   // we can add constructors here
        System.out.println("A Dog has been created");
    }
    public void ruff(){
        System.out.println(" Dog says ruff");
    }
    public void run(){
        System.out.println("Dog is running");
    }
}
