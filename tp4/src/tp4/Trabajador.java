package tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos;

	public Trabajador(List<Ingreso> ingresos) {
		super();
		this.ingresos = ingresos;
	}

	public Trabajador() {
		ingresos = new ArrayList<>();	
		
	}

	public List<Ingreso> getIngresos() {
		return ingresos;
	}
	
	public Integer getTotalPercibido() {
		return null;
		
	}
	
	public Integer getMontoImponible() {
		return null;
		
	}
	
	public Integer getImpuestoAPagar() {
		return null;
		
	}
	
	
	

}
