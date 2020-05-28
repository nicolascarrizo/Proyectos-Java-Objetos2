package tp3;

import java.util.ArrayList;


public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<Persona> integrantes;
	
	
	public EquipoDeTrabajo(String nombre, Persona personaB) {
		super();
		this.nombre = nombre;
		
		
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}
	
	

	public void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}

	public Integer promedioEdad(){	
		Integer promedio = 0;
		for (Integer x=0; x < this.getIntegrantes().size();x++) {
			promedio = promedio + integrantes.get(x).getEdad();
		}
		
		return promedio / this.getIntegrantes().size();
	}
		
	
	
	
	
}
