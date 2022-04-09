package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Instantierer et Garage-objekt
        Garage garage = new Garage("Bygaragen");

        // Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, int kmPrL)
        Dieselbil opel = new Dieselbil("AA 10 200", "Opel", "Astra", 2019, 5, false, 24.4);

        // Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, double kmPrL
        Benzinbil mazda = new Benzinbil("AF 22 454", "Mazda", "MX5", 1998, 5, 95, 12.5);

        // Elbil(String regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, int whPrKm)
        Elbil vw = new Elbil("AR 30 764", "VW e-Golf", "VII", 2018, 5, 36,300, 127.0  );


        // Tilføje biler til garagen
        garage.addCar(opel);
        garage.addCar(mazda);
        garage.addCar(vw);

        ArrayList<Bil> garagen;
        garagen = garage.getListeOverBiler();

        for(Bil bil : garagen){
            System.out.println(bil);
        }

        // Grøn afgift for hele garagen
        System.out.println("");
        System.out.print("Samlet grøn afgift for hele garagen:");
        System.out.println(garage.beregnGrønAfgiftForBilpark(garagen) + " DKK");
    }
}
