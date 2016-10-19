package com.example.iem.groupevolkswagen;

/**
 * Created by iem on 19/10/2016.
 */

public class Car extends Vehicule {

    public Car(){
        this.nbWheels=4;
    }

    public Car(String color, String type, int nbWheels, int maxSpeed){
        this.color = color;
        this.type = type;
        this.nbWheels = nbWheels;
        this.maxSpeed = maxSpeed;
    }


}
