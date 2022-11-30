package com.waqas.demo;

public class EighthSession {
    enum Size{
        SMALL, MEDIUM, LARGE
    }

    public EighthSession() {
        AnimalNew cat = new CatNew();
        AnimalNew dog = new DogNew();

        cat.eat();
        dog.eat();

        // Below example is the inner class definition which is a subclass/child class of an abstract class
        new AnimalNew() {
            @Override
            void eat() {
                System.out.println("Unknown animal is eating");
            }

            void walk() {
                System.out.println("I am walking");
            }
        }.walk();

        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.show();

        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        System.out.println(Size.LARGE);
        printSize(Size.MEDIUM);
    }

    public void printSize(Size size){
        System.out.println(size);
    }

    public static void main(String[] args) {
        new EighthSession();
    }
}

abstract class AnimalNew {
    abstract void eat();
}

class CatNew extends AnimalNew {
    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}

class DogNew extends AnimalNew {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

class OuterClass {
    int a = 5;

    static class InnerClass {
        public void show() {
            System.out.println("Show method called");
        }
    }
}