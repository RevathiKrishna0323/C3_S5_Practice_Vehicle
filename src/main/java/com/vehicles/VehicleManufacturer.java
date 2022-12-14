/*
 * Author Name: Revathi
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.vehicles;

abstract class VehicleManufacturer {
    // declare private instance variables
    private String vehicleName;
    private String vehicleModelName;
    private String vehicleType;
    // define no args constructor

    public VehicleManufacturer() {
    }

    // declare parameterised constructor
    public VehicleManufacturer(String vehicleName, String vehicleModelName, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehicleModelName = vehicleModelName;
        this.vehicleType = vehicleType;
    }


    // declare getters and setters for the instance variables

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    // define abstract method getManufacturerInformation() having string as return
    public String getManufacturerInformation(){

        return toString();
    }

    @Override
    public String toString() {
        return "VehicleManufacturer{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleModelName='" + vehicleModelName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
