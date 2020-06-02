
package colegio;

import javax.swing.JOptionPane;

public class Alumno extends Persona {
    
   String curso;
   String matricula;
    
        
    public Alumno(String nombre, String apellido, String fnac, String direccion, int edad) {
        super(nombre, apellido, fnac, direccion, edad);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    public void mostrarDatos(){
        
        System.out.println("**********************************");
        System.out.println("");
        System.out.println("DATOS INGRESADOS DE ALUMNO\nNombre: " + getNombre() + " " + "\nApellido: " + getApellido());
        System.out.println("Fecha nac.: " + getFnac());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Edad: " + getEdad());
        System.out.println("Curso: " + getCurso());
        System.out.println("Matricula" + getMatricula());
        System.out.println("**********************************");
            
    }

   
    
}
