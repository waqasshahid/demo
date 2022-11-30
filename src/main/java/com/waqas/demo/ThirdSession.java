package com.waqas.demo;

public class ThirdSession {
    public ThirdSession() {
        Car car = new Car();
        car.drive();

        Vehicle v = new Car();
        v.drive(); // Method of Vehicle i.e. Parent Class
        //v.charge(); // Method of Car i.e. Child Class

        Car v1 = new Car();
        v1.drive(); // Method of Vehicle i.e. Parent Class
        v1.charge(); // Method of Car i.e. Child Class

        //Car c = new Vehicle(); //It's not possible

        /*
          Driveable is Interface and Car is Child class of a Vehicle class
          Where Vehicle class implements Driveable
         */
        Driveable d = new Car();
        d.fastDrive();

        // Abstract Class related work below
        //new VehicleNew(); // It is abstract class, so I cannot make its object
        VehicleNew vn = new CarNew();
        vn.drive();
        vn.fastDrive();
    }

    public static void main(String[] args) {
        new ThirdSession();
    }
}

interface Driveable{
    void fastDrive();
}

class Vehicle implements Driveable {
    int tyres = 4;

    public void drive(){
        System.out.println("Vehicle is running");
    }

    @Override
    public void fastDrive() {
        System.out.println("Car is running very fast");
    }
}

class Car extends Vehicle {
    public void charge(){
        System.out.println("Car is charging");
    }
}

// Abstract Class related work below
interface DriveableNew{
    void fastDrive();
}

abstract class VehicleNew implements DriveableNew{
    abstract void drive();
}

class CarNew extends VehicleNew{

    @Override
    void drive() {
        System.out.println("overrided abstract method of abstract class");
    }

    @Override
    public void fastDrive() {
        System.out.println("Fast Drive Method");
    }
}
