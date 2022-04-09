package com.company;

import java.util.ArrayList;

public class Garage {

  private String navn;
  ArrayList<Bil> listeOverBiler = new ArrayList<>();


  public Garage(String navn){
    this.navn = navn;
  }

  public void addCar(Bil bil){
    listeOverBiler.add(bil);
  }

  public double beregnGrønAfgiftForBilpark(ArrayList<Bil> listeOverBiler){
   // Beregner den samlede grønne afgift for alle bilerne i garagen.

    double samletGrønAfgift = 0;

    for (Bil bil: listeOverBiler){
      samletGrønAfgift += bil.beregnGrønEjerafgift();
    }
    return samletGrønAfgift;
  }

  public ArrayList<Bil> getListeOverBiler() {
    return listeOverBiler;
  }

  @Override
  public String toString() {
    return "Liste over alle biler i garagen:\n" + listeOverBiler;
  }




}
