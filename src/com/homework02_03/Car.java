package com.homework02_03;

public class Car {
    private String carName;
    private String manufacturer;
    private int year;
    private double engineVolume;


    public Car() {
        this("undefined");
    }

    public Car(String carName){
        this(carName,"undefined",0);
    }

    public Car(String carName, String manufacturer, int year){
        this(carName,manufacturer,year,0);
    }

    public Car(String carName, String manufacturer, int year, double engineVolume) {
        this.carName = carName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void ShowCar() {
        System.out.println("Назва авто: " + getCarName());
        System.out.println("Назва виробника: " + getManufacturer());
        System.out.println("Рік випуску: " + getYear());
        System.out.println("Об'єм двигуна: " + getEngineVolume());
    }


    //Getter & Setter


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
