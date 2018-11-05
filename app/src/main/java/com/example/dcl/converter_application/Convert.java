package com.example.dcl.converter_application;

/**
 * Created by dcL on 6/7/2018.
 */

public class Convert {
    public static double USDtoBDT(double amount)
    {
        return (1/84.14)*amount;
    }
    public static double BDTtoUSD(double amount)
    {
        return 84.14*amount;
    }
    public static double INDtoBDT(double amount)
    {
        return (1.24*amount);
    }
    public static double BDTtoIND(double amount) {return (1/1.24)*amount;}
    public static double CADtoBDT(double amount) {return (63.28*amount);}
    public static double BDTtoCAD(double amount) {return (1/63.28)*amount;}
    public static double EUROtoBDT(double amount) {return (98.30*amount);}
    public static double BDTtoEURO(double amount) {return (1/98.30)*amount;}

}
