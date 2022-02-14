package com.example.practica_pruebas_isaac;

import junit.framework.TestCase;

/**
 * Clase donde realizamos las pruebas de los test internos
 */
public class OperacionesTest extends TestCase {
    private Operaciones operaciones;

    /**
     * Creamos una nuva clase de Operaciones para poder comprobar que los datos son correctos
     * @throws Exception por si no encuentra la clase
     */
    public void setUp() throws Exception {
        operaciones= new Operaciones();
    }

    /**
     * Hacemos un test de carga para ver que no de fallo al cargar la clase
     */
    public void testCarga(){
        assertNotNull(operaciones);
    }

    /**
     * Realizamos los test de pruba de Grados a Farengeing de diferentes tipos
     */
    public void testCAF1() {
        assertEquals("32.0",operaciones.CaF("0"));
    }
    public void testCAF2(){
        assertEquals("212.0",operaciones.CaF("100"));
    }
    public void testCAF3(){
        assertEquals("68.0",operaciones.CaF("20"));
    }
    public void testCAF4(){
        assertEquals("-148.0",operaciones.CaF("-100"));
    }
    public void testCAF5(){
        assertEquals("46.4",operaciones.CaF("8"));
    }
    public void testCAF6(){
        assertEquals("error",operaciones.CaF("si"));
    }

    /**
     * Realizamos los test de pruba de Farengeing a Grados de diferentes tipos
     */
    public void testFAC1() {
        assertEquals("0.0",operaciones.FaC("32"));
    }
    public void testFAC2(){
        assertEquals("100.0",operaciones.FaC("212"));
    }
    public void testFAC3(){
        assertEquals("20.0",operaciones.FaC("68"));
    }
    public void testFAC4(){
        assertEquals("-100.0",operaciones.FaC("-148"));
    }
    public void testFAC5(){
        assertEquals("8.22222222222222",operaciones.FaC("46.8"));
    }
    public void testFAC6(){
        assertEquals("error",operaciones.FaC("adios"));
    }

    /**
     * Realizamos las pruebas para pasar de Millas a Kilómetros
     */
    public void testMaKms1() {
        assertEquals("1.0",operaciones.mAKms("1.60934"));

    }

    public void testMaKms2(){
        assertEquals("100.0",operaciones.mAKms("160.934"));

    }
    public void testMaKms3(){
        assertEquals("20.000062137273666",operaciones.mAKms("32.1869"));

    }
    public void testMaKms4(){
        assertEquals("-100.0",operaciones.mAKms("-160.934"));

    }
    public void testMaKms5(){
        assertEquals("8.000049709818933",operaciones.mAKms("12.8748"));

    }
    public void testMaKms6(){
        assertEquals("error",operaciones.mAKms("hola"));
    }

    /**
     * Realizamos los test de pruebas para pasar de Kilómetros a Millas
     */
    public void testKmsaM1(){
        assertEquals("1.60934",operaciones.kmsAm("1"));

    }
    public void testKmsaM2(){
        assertEquals("160.934",operaciones.kmsAm("100"));

    }
    public void testKmsaM3(){
        assertEquals("32.1868",operaciones.kmsAm("20"));

    }
    public void testKmsaM4(){
        assertEquals("-160.934",operaciones.kmsAm("-100"));
    }
    public void testKmsaM5(){
        assertEquals("12.87472",operaciones.kmsAm("8"));

    }
    public void testKmsaM6(){
        assertEquals("error",operaciones.kmsAm("patata"));
    }


}