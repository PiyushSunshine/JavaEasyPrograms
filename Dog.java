package com.HackerRankJava;

public class Dog extends animal_12HackerRank {


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
  // create another class of cat.
}


// before printing we need to set up animal first
// for that we need to super clas after
    /*
    public Dog(){
        System.out.println("A Dog has been created");
    }
     */

    /*
    Note that we can do the customization of the above code but we are not following it
    below eg. to do the customization.
    int age can be put here as well instead of superclass.
    public Dog(int age){
        super(15);   // we can add constructors here
        System.out.println("A Dog has been created");
    }
     */