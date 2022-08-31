    public class Coche {

	int puertas = 4;
	
    public int agregarPuerta () {
	int puerta = puertas++;
	return puerta;
		
	}

    public int getPuertas() {
        return puertas;
    }
	
    
	
    public static void main(String[] args) {		
        
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
		
	System.out.println(miCoche.getPuertas());		

	}

}
