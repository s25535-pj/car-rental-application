package com.rental.CarRentalService;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CarService {
    private final CarStorage carStorage;
    private final RentalStorage rentalStorage;

    /* Dostarczanie wymaganych do działania obiektów poprzez wstrzykiwanie zależności.
    Car service to CONTROLLER, można poznać po rym że wywołuje metody innych Klas.
    CarService.getAllCars -> getAllCars = carStorage.getCarList.
    Metoda getAllCars z CarService korzysta z metody z CarStorage, tak sobie pośredniczą.
    Aby to było możliwe trzeba dostarczyć im wymagane obiekty na których te metody są wywoływane */

    public CarService(CarStorage carStorage, RentalStorage rentalStorage){
        this.carStorage=carStorage;
        this.rentalStorage=rentalStorage;
    }
    public List<Car> getAllCars(){
        return carStorage.getCarList();
    }
    public List<Rental> getAllRentals(){
        return rentalStorage.getRentalList();
    }

    /* Przejdź całą listę szukając auta, sprawdzaj po numerze vin,
    potem sprwawź czy znalezione auto jest dostępne.
    Jeśli nie ma dostępnego auta zwróć null */

    public Car rentCar(User user, String vin){
        for (Car car:getAllCars()){;
            if(car.getVin().equals(vin)){
                if(car.getIsRentable()){
                    rentalStorage.addRent(user, carStorage.getCarByVin(vin));
                    return car;
                }
            }
        }
        System.out.println("-------===[ Brak numeru VIN:('" + vin + "') w bazie danych." +
                " Wypożyczanie nieudane ]===-------");
        return null;
    }
}
