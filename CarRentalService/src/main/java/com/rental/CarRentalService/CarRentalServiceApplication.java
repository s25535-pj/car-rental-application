package com.rental.CarRentalService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRentalServiceApplication {
	private final CarService carService;

	 public CarRentalServiceApplication(CarService carService){
		 this.carService = carService;
		 System.out.println("-------===[ All cars = " + carService.getAllCars() + " ]===-------" );
		 System.out.println("-------===[ All rentals = " + carService.getAllRentals() + " ]===-------");
		 carService.rentCar(new User("Justysia"),"ABC123");
		 carService.rentCar(new User("Agata"), "CAłEnic");
		 System.out.println("-------===[ All rentals = " + carService.getAllRentals() + " ]===-------");

	 }
	public static void main(String[] args) {
		SpringApplication.run(CarRentalServiceApplication.class, args);
	}

}
