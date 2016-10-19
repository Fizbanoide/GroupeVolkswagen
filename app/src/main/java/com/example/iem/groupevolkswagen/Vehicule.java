package com.example.iem.groupevolkswagen;

/**
 * Created by iem on 19/10/2016.
 */

abstract class Vehicule {

    protected int nbWheels, maxSpeed;
    protected String color, type;

    protected String getColor() {
        return this.color;
    }

    protected String getType() {
        return this.type;
    }



    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getNbWheels() {
        return this.nbWheels;
    }
}


