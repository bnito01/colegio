package colegio;


public class Persona {
    
    String nombre;
    String apellido;
    String fnac;
    String direccion;
    int edad;
    

    public Persona(String nombre, String apellido, String fnac, String direccion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fnac = fnac;
        this.direccion = direccion;
        this.edad = edad;
    }
    
        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFnac() {
        return fnac;
    }

    public void setFnac(String fnac) {
        this.fnac = fnac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
