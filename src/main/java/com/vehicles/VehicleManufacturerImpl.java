/*
 * Author Name: Revathi
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.vehicles;

public class VehicleManufacturerImpl {
    public static void main(String[] args) {
        Car car = new Car("Volvo", "1234", "Car");
        System.out.println(car.getManufacturerInformation());
        System.out.println("Speed of the car is : " + car.maxSpeed("sportsCar"));
        Bike bike = new Bike("sportsBike", "1234", "Bike");
        System.out.println("Speed of the bike is : " + bike.maxSpeed("cruiser"));
        System.out.println(bike.getManufacturerInformation());


    }
}
