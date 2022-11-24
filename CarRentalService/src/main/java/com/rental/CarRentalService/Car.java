package com.rental.CarRentalService;

public class Car {
    private final String make;
    private final String model;
    private final String vin;
    private final CarType carType;
    private boolean isRentable;

    public Car(String make, String model, String vin, CarType carType) {
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.carType = carType;
        this.isRentable = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    public CarType getCarType() {
        return carType;
    }
    public boolean getIsRentable(){
        return isRentable;
    }
    public void setIsRentable(boolean isRentable){
        this.isRentable=isRentable;
    }

    @Override
    public String toString() {
        return "Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", vin='" + vin + '\'' + ", carType=" + carType + '}';
    }
}

