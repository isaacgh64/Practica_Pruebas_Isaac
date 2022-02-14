package com.example.practica_pruebas_isaac;

/**
 * Clase operaciones donde recibe los parametros de la clase principal y nos hace las
 * conversiones que necesitemos
 */
public class Operaciones {

    /**
     * Método que nos pasa de Kilómetros a millas
     * @param operador Recibe un String de la Main Class
     * @return nos devuelve el resultado o 'error' si no se le ha pasado un número
     * @exception NumberFormatException nos da la excepción para comprobar si se ha pasado un número o no
     */
    public String kmsAm(String operador){
        try{
            double resultado=Double.parseDouble(operador)*1.60934;
            return String.valueOf(resultado);
        }catch (NumberFormatException nme){
            return "error";
        }

    }

    /**
     * Método que nos pasa de Millas a Kilómetros
     * @param operador Recibe un String de la Main Class
     * @return nos devuelve el resultado o 'error' si no se le ha pasado un número
     * @exception NumberFormatException nos da la excepción para comprobar si se ha pasado un número o no
     */
    public String mAKms(String operador){
        try{
            double resultado=Double.parseDouble(operador)/1.60934;
            return String.valueOf(resultado);
        }catch(NumberFormatException nme){
            return "error";
        }

    }

    /**
     * Método que nos pasa de Grados a Farengeing
     * @param operador Recibe un String de la Main Class
     * @return nos devuelve el resultado o 'error' si no se le ha pasado un número
     * @exception NumberFormatException nos da la excepción para comprobar si se ha pasado un número o no
     */
    public String CaF (String operador){
        try{
            double resultado=(Double.parseDouble(operador)*1.8)+32;
            return String.valueOf(resultado);
        }catch(NumberFormatException nme){
            return "error";
        }

    }
    /**
     * Método que nos pasa de Farengeing a Kms
     * @param operador Recibe un String de la Main Class
     * @return nos devuelve el resultado o 'error' si no se le ha pasado un número
     * @exception NumberFormatException nos da la excepción para comprobar si se ha pasado un número o no
     */
    public String FaC(String operador){
        try{
            double resultado=(Double.parseDouble(operador)-32)/1.8;
            return String.valueOf(resultado);
        }catch(NumberFormatException nme){
            return "error";
        }

    }

}
