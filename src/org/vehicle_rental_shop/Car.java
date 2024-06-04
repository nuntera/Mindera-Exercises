package org.vehicle_rental_shop;

import static org.vehicle_rental_shop.VehicleType.CAR;
import static org.vehicle_rental_shop.Constants.CAR_MAX_SPEED;


public class Car extends Vehicle{

    public Car(String model, int gasConsumption) {
        super(CAR, model, gasConsumption, CAR_MAX_SPEED);
    }
}

