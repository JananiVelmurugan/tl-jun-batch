package com.training.objrelation;
class Car
{
    //final will make sure engine is initialized
    private final Engine engine;  
    String nameOfCar;
    String model;
    
    public Car(String nameOfCar, String model)
    {
       engine  = new Engine("POWERHIGH", "ABC");
       this.nameOfCar = nameOfCar;
       this.model = model;
    }
    
    public void showAlldetails()
    {
        System.out.println("Name of Car ="+nameOfCar);
        System.out.println("Name of Model ="+model);
        System.out.println("Engine used in Car ="+engine.typeOfEngine);
        System.out.println("Engine name of Car ="+engine.nameOfEngine);
    }
    
}

class Engine 
{
    String typeOfEngine;
    String nameOfEngine;
    
    Engine(String typeOfEngine, String nameOfEngine)
    {
        this.typeOfEngine = typeOfEngine;
        this.nameOfEngine = nameOfEngine;
    }
}

public class ShowRoom
{
    public static void main(String arg[])
    {
        Car car = new Car("BMW", "5X");
        car.showAlldetails();
    }
}