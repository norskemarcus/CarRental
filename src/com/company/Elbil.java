package com.company;

public class Elbil  extends Bil{

  private int batterikapacitetKWh;
  private int maxKm;
  private double whPrKm;

  public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, double whPrKm) {
    super(regNr, mærke, model, årgang, antalDøre);
    this.batterikapacitetKWh = batterikapacitetKWh;
    this.maxKm = maxKm;
    this.whPrKm = whPrKm;
  }

  @Override
  public double beregnGrønEjerafgift() {

    //Omregne whPrKm til kmPrL, dividere whPrKm med 91,25 og dernæst dividere 100 med dette tal.

    double kmPrL = (whPrKm / 91.25)/100;

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


  public int getBatterikapacitetKWh() {
    return batterikapacitetKWh;
  }

  public void setBatterikapacitetKWh(int batterikapacitetKWh) {
    this.batterikapacitetKWh = batterikapacitetKWh;
  }

  public int getMaxKm() {
    return maxKm;
  }

  public void setMaxKm(int maxKm) {
    this.maxKm = maxKm;
  }

  public double getWhPrKm() {
    return whPrKm;
  }

  public void setWhPrKm(int whPrKm) {
    this.whPrKm = whPrKm;
  }

  @Override
  public String toString() {

    return "Elbil:" + "reg. nr: " + regNr +
        ", mærke: " + mærke + ", model: " + model +
        ", årgang: " + årgang + ", antal døre: " + antalDøre +
        ", batterikapacitet KWh:" + batterikapacitetKWh +
        ", maxKm:" + maxKm +
        ", whPrKm: " + whPrKm;
  }
}
