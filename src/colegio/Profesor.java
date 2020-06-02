
package colegio;

import javax.swing.JOptionPane;

public class Profesor extends Persona {
    
    String asigantura;
    String cedula;

    public Profesor(String nombre, String apellido, String fnac, String direccion, int edad) {
        super(nombre, apellido, fnac, direccion, edad);
    }
  

    public String getAsigantura() {
        return asigantura;
    }

    public void setAsigantura(String asigantura) {
        this.asigantura = asigantura;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void mostrarDatos(){
    
        System.out.println("**********************************");
        System.out.println("");
        System.out.println("DATOS INGRESADOS DE PROFESOR\nNombre: " + getNombre() + " " + "\nApellido: " + getApellido());
        System.out.println("Fecha nac.: " + getFnac());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Edad: " + getEdad());
        System.out.println("Asignatura: " + getAsigantura());
        System.out.println("Cedula" + getCedula());
        System.out.println("**********************************");
    }
    
}
