/*
 * Author Name: Revathi
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {
    //create a no args constructor
    public Bike() {
    }

    // create a parameterised constructor
    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public String getManufacturerInformation() {
        return toString();
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if (getVehicleType().equals("sportsBike")) {
            return 250;
        } else if (getVehicleType().equals("cruiser")) {

            return 170;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Bike{} " + super.toString();
    }
}







