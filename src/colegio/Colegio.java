
package colegio;

import java.util.Scanner;


public class Colegio {


    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
        String nombre;
        String apellido;
        String fnac;
        String direccion;
        int edad;
        String curso;
        String matricula;
        String asignatura;
        String cedula;
        
        
       
       System.out.println("INGRESE DATOS DE ALUMNO ");   
       System.out.print("Ingrese Nombre: ");        
        nombre = input.nextLine();
        
        System.out.print("Ingresa Apellido: ");
        apellido = input.nextLine();
        
        System.out.print("Ingresa Fech.Nacimiento: ");
        fnac = input.nextLine();
        
        System.out.print("Ingresa Dirección: ");
        direccion = input.nextLine();
        
        System.out.print("Ingresa Edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa Curso: ");
        curso = input.nextLine();
        
        System.out.print("Ingresa Matricula: ");
        matricula = input.nextLine();
         
         
        Alumno objAlumno = new Alumno(nombre, apellido, fnac, direccion, edad);
        objAlumno.setCurso(curso);
        objAlumno.setMatricula(matricula);
        objAlumno.mostrarDatos();    
        
        System.out.println("INGRESE DATOS PROFESOR ");   
        System.out.print("Ingresa Nombre: ");        
        nombre = input.nextLine();
        
        System.out.print("Ingresa Apellido: ");
        apellido = input.nextLine();
        
        System.out.print("Ingresa Fech.Nacimiento: ");
        fnac = input.nextLine();
        
        System.out.print("Ingresa Dirección: ");
        direccion = input.nextLine();
        
        System.out.print("Ingresa Edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa Asignatura: ");
        asignatura = input.nextLine();
        
        System.out.print("Ingresa Cedula: ");
        cedula = input.nextLine();
        
        Profesor objProfesor = new Profesor(nombre, apellido, fnac, direccion, edad);
        objProfesor.setAsigantura(asignatura);
        objProfesor.setCedula(cedula);
        objProfesor.mostrarDatos();
    }
    
}
