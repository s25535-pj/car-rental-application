package com.rental.CarRentalService;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RentalStorage {
    private final List<Rental> rentalList = new ArrayList<>();

    public List<Rental> getRentalList(){
        return rentalList;
    }
    public void addRent(User user, Car car){

        Rental rental = new Rental(user, car);
        car.setIsRentable(false);
        rentalList.add(rental);
        System.out.println("-------===[ Rental added. Client: " +
                user.getAccId() + " Car VIN: " + car.getVin() + " ]===-------");
    }

}
