package Introduccion;


public class Tema8 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(31);
        persona1.setNombre("Martin");
        persona1.setTelefono("2664409520");
        
        System.out.println("Nombre: "+ persona1.getNombre());
        System.out.println("Edad: "+ persona1.getEdad());
        System.out.println("Telefono: "+ persona1.getTelefono());        
      
           
              
    }
}

class Persona {
     private int edad;
     private String nombre;
     private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     
     
     
    }