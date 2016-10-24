package com.example.iem.groupevolkswagen;

/**
 * Created by iem on 19/10/2016.
 */
public class Init {
    private static Init ourInstance = new Init();

    public static Init getInstance() {
        return ourInstance;
    }

    private Init() {
        Group gVolkswagen = new Group();
        SubComp volkswagen = new SubComp("Volkswagen", "Germany", 202, 592586, 1937);
        SubComp audi = new SubComp("Audi", "Germany", 49, 59513, 1964);
        SubComp seat = new SubComp("Seat", "Spain", 7, 14000, 1986);
        SubComp skoda = new SubComp("Skoda", "Czech Republic", 10, 27860, 1991);
        SubComp bentley = new SubComp("Bentley", "England", 1, 3600, 1998);
        SubComp bugatti = new SubComp("Bugatti", "France", 0.102, 99, 1998);
        SubComp lamborghini = new SubComp("Lamborghini", "Italy", 0.508, 715, 1998);
        SubComp porsche = new SubComp("Porsche", "Germany", 14, 19500, 2010);
        SubComp ducati = new SubComp("Ducati", "Italy", 0.860, 1243, 2012);
        SubComp scania = new SubComp("Scania", "Sweden", 10, 41000, 2008);
        SubComp man = new SubComp("Man", "Germany", 14, 47669, 2011);

        Car vkGolf = new Car("Silver", "Golf 3", 4, 200);
        Car audiR8 = new Car("Black", "R8", 4, 256);
        Car seatIbiza = new Car("Red", "Ibiza", 4, 174);
        Car skodaFabia3 = new Car("Orange", "Fabia 3", 4, 190);
        Car bentleyBrooklands = new Car("Silver", "Brooklands", 4, 296);
        Car bugattiVeyron = new Car("Black", "Veyron", 4, 415);
        Car lamborghiniAventador = new Car("Black", "Aventador", 4, 351);
        Car porschePanamera = new Car("Red", "Panamera", 4, 259);
        Motorcycle ducati1000Monster = new Motorcycle("Black", "1000 Monster", 2, 230);
        Truck scaniaSerieR = new Truck("Black", "Serie R", 4, 216);
        Truck manTGS = new Truck("Yellow", "TGS", 8, 189);
        


        gVolkswagen.addSubComp();
    }
}
