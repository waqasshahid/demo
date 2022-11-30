package com.waqas.demo;

import lombok.AllArgsConstructor;

public class SeventhSession {
    public SeventhSession(){
        //Reference Data Types or Non-Primitive
        Integer i;
        Float f;
        Double d;
        Character c;
        Boolean b;

        Integer i2 = new Integer(5); //Deprecated
        Integer i3 = Integer.valueOf(5); //New Method
        Integer i4 = 5;

        Boolean b2 = true;
        Boolean b3 = Boolean.TRUE;
        Boolean b4 = Boolean.FALSE;

        IntPrinter ip = new IntPrinter(10);
        ip.printInt();

        Printer p = new Printer("waqas");
        p.print();

        Printer<Integer> p2 = new Printer<>(5);
        p2.print();

        Printer<Float> p3 = new Printer<>(3.5F);
        p3.print();

        Printer<Animal> p4 = new Printer<>(new Cat());
        p4.print(); //It will print the address

        PrinterNew<Animal> p5 = new PrinterNew<>(new Cat());
        p5.print();
    }

    public static void main(String[] args) {
        new SeventhSession();
    }
}

@AllArgsConstructor
class IntPrinter{
    int value;

    public void printInt(){
        System.out.println(value);
    }
}

@AllArgsConstructor
class FloatPrinter{
    float value;

    public void printFloat(){
        System.out.println(value);
    }
}

//Generics Class
@AllArgsConstructor
class Printer <T> {
    T value;

    public void print(){
        System.out.println(value);
    }
}

abstract class Animal{
    public abstract void printName();
}

class Dog extends Animal{
    @Override
    public void printName() {
        System.out.println("I am Dog");
    }
}

class Cat extends Animal{
    @Override
    public void printName() {
        System.out.println("I am Cat");
    }
}

@AllArgsConstructor
class PrinterNew <T extends Animal> {
    T value;

    public void print(){
        value.printName(); // printName is an abstract method of Animal class which is implemented in its child classes
    }
}
