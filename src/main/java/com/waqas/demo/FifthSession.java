package com.waqas.demo;

//Polymorphism
//Overloading
//Overriding
public class FifthSession {
    public FifthSession(){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.addThreeNumbers(1,2,3));
        System.out.println(calculator.add(1,2,3));
        System.out.println(calculator.add(1.5F,2,3));

        calculator.print(5);
        calculator.print('c');
        calculator.print("Hello");

        System.out.println(calculator.add(5));
        System.out.println(calculator.add(1,2));
    }

    public static void main(String[] args) {
     new FifthSession();
    }
}

class GenericCalculator{
    public int add(int a){
        return a + 5;
    }

    public int add(int c, int d){
        return c + d + 5;
    }
}

class Calculator extends GenericCalculator{
    public int add(int a, int b){
        return a + b;
    }

    public int addThreeNumbers(int a, int b, int c){
        return a + b + c;
    }

    //Overloaded add() function
    public int add(int a, int b, int c){
        return a + b + c;
    }

    //Overloaded add() function with different datatype
    public float add(float a, float b, float c){
        return a + b + c;
    }

    public void print(String str){
        System.out.println(str);
    }

    public void print(char c){
        System.out.println(c);
    }

    public void print(int i){
        System.out.println(i);
    }
}