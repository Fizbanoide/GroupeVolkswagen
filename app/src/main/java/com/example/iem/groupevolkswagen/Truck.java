package com.example.iem.groupevolkswagen;

/**
 * Created by iem on 19/10/2016.
 */

public class Truck extends Vehicule {

    public Truck(){

        this.nbWheels = 6;
    }

    public Truck(String color, String type, int nbWheels, int maxSpeed){
        this.color = color;
        this.type = type;
        this.nbWheels = nbWheels;
        this.maxSpeed = maxSpeed;
    }
}
