package com.waqas.demo;

public class SixthSession {
    public SixthSession() {
        //new Vehicles();
        //BMW_M3 vehicle1 = new BMW_M3();
        Vehicles vehicle1 = new BMW_M3();
        Vehicles vehicle2 = new Toyota_Corolla();
        vehicle1.drive();
        vehicle2.drive();

        //Here we are typecasting by changing the Vehicles class reference to Chargeable interface reference
        Chargeable chargeable = (Chargeable) vehicle1;
        chargeable.status();
    }

    public static void main(String[] args) {
        new SixthSession();
    }
}

interface Chargeable{
    void charge();
    void status();
}

abstract class Vehicles{
    public abstract void drive();
    public abstract void stop();
    public abstract void speedup();
}

class BMW_M3 extends Vehicles implements Chargeable{
    @Override
    public void drive() {
        System.out.println("M3 is running");
    }

    @Override
    public void stop() {
        System.out.println("M3 is stopped");
    }

    @Override
    public void speedup() {
        System.out.println("M3 is accelerating");
    }

    @Override
    public void charge() {
        System.out.println("M3 is charging");
    }

    @Override
    public void status() {
        System.out.println("M3 status is 90%");
    }
}

class Toyota_Corolla extends Vehicles{

    @Override
    public void drive() {
        System.out.println("Corolla is running");
    }

    @Override
    public void stop() {
        System.out.println("Corolla is stopped");
    }

    @Override
    public void speedup() {
        System.out.println("Corolla is accelerating");
    }
}