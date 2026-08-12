package org.tnsif.acc.c2tc.interfacedemo;

interface Vehicle{
    void start();
    void stop();
    final static int Max_speed=120;

    default void repair()
    {
        System.out.println("We provide repair service");
    }
    static void checkMaintaince()
    {
        System.out.println("Vehicle maintaince taken care here");
    }
}

class Car implements Vehicle
{
    private String model;

    Car(String model)
    {
        this.model=model;
    }

    @Override
    public void start() {
        System.out.println("Car " +model+" starting" );

    }

    @Override
    public void stop() {
        System.out.println("Car " +model+" stopping" );
    }

}

class Bike implements Vehicle
{

    private String type;

    Bike(String type)
    {
        this.type=type;
    }
    @Override
    public void start() {
        System.out.println("Bike " +type+" starting" );

    }

    @Override
    public void stop() {
        System.out.println("Bike " +type+" stopping" );
    }

}





