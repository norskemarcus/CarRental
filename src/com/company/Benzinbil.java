package com.company;

public class Benzinbil extends Bil {

  private int oktantal;
  private double kmPrL;

  public Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, double kmPrL) {
    super(regNr, mærke, model, årgang, antalDøre);
    this.oktantal = oktantal;
    this.kmPrL = kmPrL;
  }


  @Override
  public double beregnGrønEjerafgift() {

    if(kmPrL >= 20 && kmPrL <=50){
      return 330;
    } else if (kmPrL >= 15 && kmPrL <20){
      return 1050;
    } else if (kmPrL >= 10 && kmPrL <15){
      return 2340;
    } else if (kmPrL >= 5 && kmPrL <10){
      return 5500;
    } else if (kmPrL < 5){
      return 10470;
    }
    return 0;
  }

  public int getOktantal() {
    return oktantal;
  }

  public void setOktantal(int oktantal) {
    this.oktantal = oktantal;
  }

  public double getKmPrL() {
    return kmPrL;
  }

  public void setKmPrL(int kmPrL) {
    this.kmPrL = kmPrL;
  }

  // (String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, double kmPrL
  @Override
  public String toString() {
    return "Benzinbil: " + "reg. nr: " + regNr +
        " mærke: " + mærke + " model: " + model +
        " årgang: " + årgang + " antal døre: " + antalDøre +
        " oktantal: " + oktantal + ", kmPrL: " + kmPrL;
  }
}
