package org.vehicle_rental_shop;

import static org.vehicle_rental_shop.VehicleType.MOTORCYCLE;
import static org.vehicle_rental_shop.Constants.MOTORCYCLE_MAX_SPEED;


public class Motorcycle extends Vehicle {

    public Motorcycle(String model, int gasConsumption) {
        super(MOTORCYCLE, model, gasConsumption, MOTORCYCLE_MAX_SPEED);
    }
}
