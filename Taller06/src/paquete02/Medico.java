/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author DET PC
 */
public class Medico {

    private String nombre;
    private String especialidad;
    private double sueldo;

    public Medico(String m, String e, double s) {
        nombre = m;
        especialidad = e;
        sueldo = s;
    }

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerTipo(String e) {
        especialidad = e;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
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
                obtenerNombre(), obtenerSueldo(),
                obtenerEspecialidad());
        return cadena;
    }

}
