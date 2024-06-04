package org.vehicle_rental_shop;

import static org.vehicle_rental_shop.Constants.FUEL_IN_TANK_SHOP_POLICY;


public class Main {
    public static void main(String[] args) {

        int counter = 0;
        while (counter < 6){
            counter++;

            Shop rentalShop = new Shop();
            rentalShop.displayAvailableVehicles();

            VehicleList rentedCar1 = rentalShop.rentVehicle(VehicleType.CAR);
            VehicleList rentedMotorcycle1 = rentalShop.rentVehicle(VehicleType.MOTORCYCLE);
            VehicleList rentedCar2 = rentalShop.rentVehicle(VehicleType.CAR);
            VehicleList rentedMotorcycle2 = rentalShop.rentVehicle(VehicleType.MOTORCYCLE);

            Trip carTrip1 = new Trip(rentedCar1.getVehicle(), 300, 3);
            System.out.println(carTrip1);
            canPerformTrip(carTrip1, rentalShop, rentedCar1);

            Trip motorcycleTrip1 = new Trip(rentedMotorcycle1.getVehicle(), 300, 4);
            System.out.println(motorcycleTrip1);
            canPerformTrip(motorcycleTrip1, rentalShop, rentedMotorcycle1);

            Trip carTrip2 = new Trip(rentedCar2.getVehicle(), 200, 3);
            System.out.println(carTrip2);
            canPerformTrip(carTrip2, rentalShop, rentedCar2);

            Trip motorcycleTrip2 = new Trip(rentedMotorcycle2.getVehicle(), 100, 0.9);
            System.out.println(motorcycleTrip2);
            canPerformTrip(motorcycleTrip2, rentalShop, rentedMotorcycle2);
        }
    }


    private static void canPerformTrip(Trip trip, Shop shop, VehicleList vehicle) {
        if (!trip.canMeetSpeedRequirement()){
            System.out.println(vehicle.getVehicle().getModel() + " don't have the necessary speed to perform trip.");
            shop.returnVehicle(vehicle.getVehicle());
        } else if (!trip.hasEnoughFuel()){
            System.out.println(vehicle.getVehicle().getModel() + " don't have the necessary fuel to perform trip.");
            shop.returnVehicle(vehicle.getVehicle());
        } else {
            startTrip(trip, shop, vehicle);
        }
    }

    private static void reduceAvailableFuel(Trip trip) {
        double requiredFuel = (trip.getVehicle().getGasConsumption() * trip.getDistance()) / 100;
        double newFuelLevel = trip.getVehicle().getAvailableFuel() - requiredFuel;
        trip.getVehicle().setAvailableFuel(newFuelLevel);
        System.out.println("Fuel reduced by " + requiredFuel + " liters. New fuel level: " + newFuelLevel + " liters.");
    }

    private static void startTrip(Trip trip, Shop shop, VehicleList vehicle) {
        System.out.println("Start the trip");
        reduceAvailableFuel(trip);

        shop.returnVehicle(vehicle.getVehicle());

        if (shop.getIsRented()[vehicle.getId()]){
            vehicle.getVehicle().refuel(FUEL_IN_TANK_SHOP_POLICY - vehicle.getVehicle().getAvailableFuel());
            shop.returnVehicle(vehicle.getVehicle());
        }
        shop.displayAvailableVehicles();
    }
}
