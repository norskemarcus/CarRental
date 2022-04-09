package com.company;

public abstract class Bil {

  protected String regNr;
  protected String mærke;
  protected String model;
  protected int årgang;
  protected int antalDøre;


  public Bil(String regNr, String mærke, String model, int årgang, int antalDøre){
    this.regNr = regNr;
    this.mærke = mærke;
    this.model = model;
    this.årgang = årgang;
    this.antalDøre = antalDøre;
  }

  public abstract double beregnGrønEjerafgift();

}


