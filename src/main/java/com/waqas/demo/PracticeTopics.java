package com.waqas.demo;

public class PracticeTopics {
    public PracticeTopics(){
        // Calling Named Inner Class method without marking Inner Class as static
        Outer o = new Outer();
        o.executeInnerClassMethod();

        new AbstractTest(){
            @Override
            public void eat() {
                System.out.println("I'm eating");
            }

            public void drive(){
                System.out.println("I'm driving");
            }
        }.drive();

        AbstractTest at = new AbstractTest(){
            @Override
            public void eat() {
                System.out.println("I'm eating");
            }
        };

        at.eat();

    }
    public static void main(String[] args) {
        new PracticeTopics();
    }
}

class Outer {
    class Inner{
        public void run(){
            System.out.println("I'm running inside Inner Class");
        }
    }

    public void executeInnerClassMethod(){
        Inner i = new Inner();
        i.run();
    }
}

abstract class AbstractTest {
    abstract public void eat();
}