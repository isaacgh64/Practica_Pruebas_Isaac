package com.example.practica_pruebas_isaac;

public class Operaciones {

    public String kmsAm(String operador){
        double resultado=Double.parseDouble(operador)*1.60934;
        return String.valueOf(resultado);
    }

    public String mAKms(String operador){
        double resultado=Double.parseDouble(operador)/1.60934;
        return String.valueOf(resultado);
    }

    public String CaF (String operador){
        double resultado=(Double.parseDouble(operador)*1.8)+32;
        return String.valueOf(resultado);
    }

    public String FaC(String operador){
        double resultado=(Double.parseDouble(operador)-32)/1.8;
        return String.valueOf(resultado);
    }

}
