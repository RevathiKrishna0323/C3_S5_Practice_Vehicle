/*
 * Author Name: Revathi
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {
    public Car() {
    }

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public String getManufacturerInformation() {
        return toString();
    }

    @Override
    // This method is used to calculate the maximum speed of the vehicle.
    public int maxSpeed(String vehicleType) {
        if (vehicleType == "sportsCar") {
            return 300;
        }
        if (vehicleType == "sedan") {
            return 170;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}



