/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import paquete02.Enfermera;
import paquete02.Medico;

/**
 *
 * @author DET PC
 */
public class SueldoTotal {

    private double sueldoMedico;
    private double sueldoEnfermera;

    public SueldoTotal(Medico m, Enfermera e) {
        sueldoMedico = m.obtenerSueldo();
        sueldoEnfermera = e.obtenerSueldo();
    }

    public double obtenerSueldosTotales() {
        return sueldoMedico + sueldoEnfermera;
    }

    public String toString() {
        String cadena = String.format("Total de sueldos a pagar por mes: %.2f", obtenerSueldosTotales());
        return cadena;
    }
}
