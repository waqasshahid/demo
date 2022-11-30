package com.waqas.demo;

import java.util.List;

public class NinthSession {
    public NinthSession() {
        Calculatable c = () -> {
            System.out.println("Incrementing");
        };
        //Calling calculate method 1
        calculate(c);
        //Calling calculate method 2
        calculate(() -> {
            System.out.println("Incrementing with different style");
        });

        calculate(this::methodReferencing);

        calculateTwo((i) -> {
            System.out.println("Incrementing i = " + i);
        });

        calculateThree((i) -> {
            System.out.println("Incrementing with return type int method = " + i);
            return i;
        });

        List<String> list = List.of("1", "2", "3");
        System.out.println(list.stream().count());
        list.stream().filter((i) -> {
            return false;
        });
        list.stream().filter((i) -> 1 > 2);
    }

    //Creating for Method referencing
    public void methodReferencing() {
        System.out.println("Incrementing using Method Referencing");
    }

    public void calculate(Calculatable calculatable) {
        calculatable.increment();
    }

    public void calculateTwo(CalculatableTwo calculatableTwo) {
        calculatableTwo.increment(5);
    }

    public void calculateThree(CalculatableThree calculatableThree) {
        System.out.println(calculatableThree.increment(5));
    }

    public static void main(String[] args) {
        new NinthSession();
    }
}

//Functional Interface
@FunctionalInterface
interface Calculatable {
    void increment();

    default void show() {
        System.out.println("This is default method");
    }
}

@FunctionalInterface
interface CalculatableTwo {
    void increment(int initial);
}

@FunctionalInterface
interface CalculatableThree {
    int increment(int initial);
}