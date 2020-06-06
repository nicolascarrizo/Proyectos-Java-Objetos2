package tp9;

import java.util.ArrayList;

public class Sistema {
	
	// el cliente que maneja el componente
	
	private ArrayList<Cultivo> tierra;

	public Sistema(){
		
		tierra = new ArrayList<Cultivo>();
		
	}
	
	public  ArrayList<Cultivo> getTierra(){
		return tierra;
	}
	
	
	public Integer getMontoTotalDeGananciaAnual() {
		Integer ganancias = 0;
		
		for(Cultivo cultivo : tierra) {
			ganancias += cultivo.getGanaciaAnual();
		}
		
		return ganancias;
	}
	
	public void agregarCultivoALaTierra(Cultivo cultivo) {
		tierra.add(cultivo);
	}

}


