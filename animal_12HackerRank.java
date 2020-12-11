package com.inheritanceJava;

public class Animal {

    public int age;

    public Animal(int age){
        this.age=age;
        System.out.println("This is an Animal");

    }
    public void eats(){
        System.out.println("Eating food");
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Animal a1 = new Animal(5);
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.ruff();
        c1.meaow();
        System.out.println(d1.getAge());
        a1.eats();
        d1.eats();
        c1.eats();
        d1.run();
        c1.prance();

        Animal a2 = new Dog();
        a2.eats();

    }


}
