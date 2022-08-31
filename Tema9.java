
package Introduccion;

public class Tema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        
        cliente.setEdad(31);
        cliente.setNombre("Martin");
        cliente.setTelefono("2664409520");
        cliente.setCredito(500);
        
        trabajador.setEdad(20);
        trabajador.setNombre("Amadeo");
        trabajador.setTelefono("2665034194");
        trabajador.setSalario(1000);
        
        System.out.println("----CLIENTE---");       
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());
        
        System.out.println("---TRABAJADOR---");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
        
        
    }
    
}

    class Persona {
    int edad;
    String nombre;
    String telefono;

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

    class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

    class Trabajador extends Persona {
        private double salario;
        
        public double getSalario(){
            return salario;
        }
        
    public void setSalario(double salario) {
        this.salario = salario;
    }
    }