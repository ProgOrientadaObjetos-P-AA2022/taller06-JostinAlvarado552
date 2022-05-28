/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author DET PC
 */
public class Hospital {
     private String nombre;
    private String ciudad;
    private String provincia;
    private String direccion;
    private int numesp;

    public Hospital(String n,String d, String c, String p,int e) {
        nombre = n;
        direccion = d;
        ciudad = c;
        provincia = p;
        numesp = e;
    }
    public void establecerNombre(String n){
    nombre = n;
    }
    public void establecerDireccion(String d){
        direccion = d;
    
    }
    public void establecerCiudad(String c){
    ciudad = c;
    }
    public void establecerProvincia(String p){
    provincia = p;
    }
    public void establecerEspecialidades(int e){
    numesp = e;
    }
    public String obtenerNombre(){
    return nombre;
    }
    public String obtenerDireccion(){
    return direccion;
    }
    public String obtenerCiudad(){
    return ciudad;
    }
    public String obtenerProvincia(){
    return provincia;
    }
    public int obtenerEspecialidades(){
    return numesp;
    }
 
      public String toString() {
        String cadena = String.format("%s\n"
                + "Direccion: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Numero de especialidades: %s\n",
                obtenerNombre(),
                obtenerDireccion(),
                obtenerCiudad(),
                obtenerProvincia(),
                obtenerEspecialidades());
        return cadena;
    }
}
