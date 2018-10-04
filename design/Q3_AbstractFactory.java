
package com.bootcamp.design_patterns;

enum CarType
{ HATCHBACK,SEDAN,SUV }
enum Country
{ AUSTRALIA,USA,FRANCE }

abstract class Car {

    CarType carType;

    Country country;

    public Car(CarType carType, Country country ) {
        this.carType = carType;
        this.country = country;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", country=" + country +
                '}';
    }
}
class HatchbackCar extends Car
{
    public HatchbackCar(Country country)
    {
        super(CarType.HATCHBACK,country);
    }
    @Override
    void construct() {
        System.out.println("Hatchback Car");

    }
}
class SedanCar extends Car
{
    public SedanCar(Country country)
    {
        super(CarType.SEDAN,country);
    }

    @Override
    void construct() {
        System.out.println("Sedan Car");

    }
}

class SUVCar extends Car
{
    public SUVCar(Country country)
    {
        super(CarType.SUV,country);
    }

    @Override
    void construct() {
        System.out.println("SUV Car");
    }
}
class AustraliaCarFactory{
    static Car buildCar(CarType carType)
    {
        Car car=null;
        switch (carType)
        {
            case HATCHBACK:
                car=new HatchbackCar(Country.AUSTRALIA);
                break;
            case SEDAN:
                car=new SedanCar(Country.AUSTRALIA);
                break;
            case SUV:
                car=new SUVCar(Country.AUSTRALIA);
                break;
        }
        return car;
    }
}

class USACarFactory{
    static Car buildCar(CarType carType)
    {
        Car car=null;
        switch (carType)
        {
            case HATCHBACK:
                car=new HatchbackCar(Country.USA);
                break;
            case SEDAN:
                car=new SedanCar(Country.USA);
                break;
            case SUV:
                car=new SUVCar(Country.USA);
                break;
        }
        return car;
    }

}

class FranceCarFactory
{
    static Car buildCar(CarType carType)
    {
        Car car=null;
        switch (carType)
        {
            case HATCHBACK:
                car=new HatchbackCar(Country.FRANCE);
                break;
            case SEDAN:
                car=new SedanCar(Country.FRANCE);
                break;
            case SUV:
                car=new SUVCar(Country.FRANCE);
                break;
        }
        return car;
    }
}

class CarFactory {
    Car car = null;

    static Car buildCar(CarType carType, Country country) {
        Car car = null;
        switch (country) {
            case AUSTRALIA:
                car = AustraliaCarFactory.buildCar(carType);
                break;
            case USA:
                car = USACarFactory.buildCar(carType);
                break;
            case FRANCE:
                car = FranceCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}


public class Q3_AbstractFactory {

    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SEDAN,Country.FRANCE));
        System.out.println(CarFactory.buildCar(CarType.HATCHBACK,Country.USA));
    }
}

