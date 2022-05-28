/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete02.Medico;

/**
 *
 * @author DET PC
 */
public class Enfermera {

    private String nombre;
    private String tipo;
    private double sueldo;
    private double sueldos;
    private Medico medico;

    public Enfermera(String e, String t, double s) {
        nombre = e;
        tipo = t;
        sueldo = s;
    }

    public void establecerNombre(String e) {
        nombre = e;
    }

    public void establecerTipo(String t) {
        tipo = t;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String toString() {
        String cadena = "";
        cadena = String.format("%s\n"
                + "%s - "
                + "Sueldo: %.2f - "
                + "%s",
                cadena,
                obtenerNombre(),
                obtenerSueldo(),
                obtenerTipo());
        return cadena;
    }

}
