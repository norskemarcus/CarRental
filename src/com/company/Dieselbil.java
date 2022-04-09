package com.company;

public class Dieselbil extends Bil{

  private boolean harPartikelfilter;
  private double kmPrL;
  private final int partikeludledningsAfgift = 1000;

  public Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, double kmPrL) {
    super(regNr, mærke, model, årgang, antalDøre);
    this.harPartikelfilter = harPartikelfilter;
    this.kmPrL = kmPrL;
  }

  @Override
  public double beregnGrønEjerafgift() {

    if(harPartikelfilter){
      if(kmPrL >= 20 && kmPrL <=50){
        return 330 + 130;
      } else if (kmPrL >= 15 && kmPrL <20){
        return 1050 + 1390;
      } else if (kmPrL >= 10 && kmPrL <15){
        return 2340 + 1850;
      } else if (kmPrL >= 5 && kmPrL <10){
        return 5500+2770;
      } else if (kmPrL < 5){
        return 10470+15260;
      }
    } else{
      if(kmPrL >= 20 && kmPrL <=50){
        return 330 + 130 + partikeludledningsAfgift;
      } else if (kmPrL >= 15 && kmPrL <20){
        return 1050 + 1390 + partikeludledningsAfgift;
      } else if (kmPrL >= 10 && kmPrL <15){
        return 2340 + 1850 + partikeludledningsAfgift;
      } else if (kmPrL >= 5 && kmPrL <10){
        return 5500+2770 + partikeludledningsAfgift;
      } else if (kmPrL < 5){
        return 10470+15260 + partikeludledningsAfgift;
      }
    }
    return 0;
  }


  public boolean isHarPartikelfilter() {
    return harPartikelfilter;
  }

  public void setHarPartikelfilter(boolean harPartikelfilter) {
    this.harPartikelfilter = harPartikelfilter;
  }

  public double getKmPrL() {
    return kmPrL;
  }

  public void setKmPrL(int kmPrL) {
    this.kmPrL = kmPrL;
  }

  @Override
  public String toString() {

    return "Dieselbil: " + "reg. nr: " + regNr +
        ", mærke: " + mærke + ", model: " + model +
        ", årgang: " + årgang + ", antal døre: " + antalDøre +
        ", partikelfilter: " + harPartikelfilter + ", kmPrL: " + kmPrL;
  }
}
