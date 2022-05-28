/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import paquete02.Enfermera;
import paquete02.Hospital;
import paquete02.Medico;
import paquete01.SueldoTotal;

/**
 *
 * @author DET PC
 */
public class Taller06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        boolean bandera2 = true;
        String cadena = "";
        System.out.println("Ingrese nombre de la entidad hospitalaria");
        String nom_hos = entrada.nextLine();
        System.out.println("Ingrese la direccion de la entidad hospitalaria");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia de la ciudad");
        String provincia = entrada.nextLine();
        System.out.println("Ingrese el numero de especialidades");
        int numesp = entrada.nextInt();
        entrada.nextLine();
        Hospital hospital = new Hospital(nom_hos, direccion, ciudad, provincia, numesp);
        cadena = String.format("%s\n%s", cadena, hospital);
        System.out.println("Ingreso de Medicos");
        while (bandera) {
            System.out.println("Ingrese el nombre del medico");
            String medico = entrada.nextLine();
            System.out.println("Ingrese su especialidad");
            String especialidad = entrada.nextLine();
            System.out.println("Ingrese el sueldo mensual del medico");
            double sueldo_med = entrada.nextDouble();
            entrada.nextLine();
            Medico m1 = new Medico(medico, especialidad, sueldo_med);

            System.out.println("Desea ingresar más medicos. Ingrese n para"
                    + " salir del ciclo repetitivo");
            String opcion = entrada.nextLine();
            cadena = String.format("%s\n%s", cadena, m1);
            if (opcion.equals("n")) {
                bandera = false;
            }
        }
        System.out.println("Ingreso de Enfermeras/os");
        while (bandera2) {
            System.out.println("Ingrese el nombre del enfermero");
            String enfermera = entrada.nextLine();
            System.out.println("Tipo de contrato");
            String tipo = entrada.nextLine();
            System.out.println("Ingrese el sueldo mensual");
            double sueldo_enf = entrada.nextDouble();
            entrada.nextLine();
            Enfermera e1 = new Enfermera(enfermera, tipo, sueldo_enf);
            System.out.println("Desea ingresar más enfermeros/as. Ingrese n para"
                    + " salir del ciclo repetitivo");
            String opcion = entrada.nextLine();
            cadena = String.format("%s\n%s", cadena, e1);
            if (opcion.equals("n")) {
                bandera2 = false;
            }
        }

        System.out.println(cadena);

    }

}
