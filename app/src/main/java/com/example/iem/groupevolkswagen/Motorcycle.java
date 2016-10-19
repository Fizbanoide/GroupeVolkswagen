package com.example.iem.groupevolkswagen;

/**
 * Created by iem on 19/10/2016.
 */

public class Motorcycle extends Vehicule {

    public Motorcycle(){

        this.nbWheels = 2;
    }

    public Motorcycle(String color, String type, int nbWheels, int maxSpeed){
        this.color = color;
        this.type = type;
        this.nbWheels = nbWheels;
        this.maxSpeed = maxSpeed;
    }
}
