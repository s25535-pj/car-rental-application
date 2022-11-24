package com.rental.CarRentalService;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarStorage {
    private final List<Car> carList;

    public CarStorage() {
        this.carList = List.of(
                new Car("Toyota", "Supra", "ABC123", CarType.SPORT),
                new Car("Skoda", "Ocatvia", "BCA312", CarType.STANDARD)
        );
    }

    public List<Car> getCarList() {
        return carList;
    }
    public Car getCarByVin(String vin){
        for (Car car:carList){
            if(car.getVin().equals(vin)){
                return car;
            }
        }
        return null;
    }
}
