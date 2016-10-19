package com.example.iem.groupevolkswagen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class SubComp {

    protected String name,origin;
    protected int revenue2015, nbEmployee, rebuyDate;
    protected List<Vehicule> lVehicle = new ArrayList<>();

    public SubComp() {

    }

    public SubComp(String name, String origin, int revenue2015, int nbEmployee, int rebuyDate){
        this.name = name;
        this.origin = origin;
        this.revenue2015 = revenue2015;
        this.nbEmployee = nbEmployee;
        this.rebuyDate = rebuyDate;
    }

    public void addVehicle(Vehicule vehicule){
        this.lVehicle.add(vehicule);
    }

    public void rmVehicle(Vehicule vehicule){
        this.lVehicle.remove(vehicule);
    }
}
