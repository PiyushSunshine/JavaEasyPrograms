package com.HackerRankJava;

public class animal_12HackerRank {

    public int age;

    public animal_12HackerRank(int age){
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
        animal_12HackerRank a1 = new animal_12HackerRank(5);
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

        animal_12HackerRank a2 = new Dog();
        a2.eats();

    }


}
