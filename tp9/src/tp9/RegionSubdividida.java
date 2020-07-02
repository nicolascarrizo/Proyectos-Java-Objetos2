package tp9;

import java.util.ArrayList;

public class RegionSubdividida extends Cultivo{

	// es un compuesto 
	
	private ArrayList<Cultivo> cultivos;
	
	
	
	public RegionSubdividida() {
		cultivos = new ArrayList<Cultivo>(4);
	}



	@Override
	public Integer getGanaciaAnual() {
		
		Integer ganancia=0;
		for(Cultivo cultivo : cultivos){
			ganancia = ganancia + cultivo.getGanaciaAnual();
		}
		
		return ganancia / cultivos.size();
		
	}
	
	public void agregarCultivo(Cultivo cultivo) {
		cultivos.add(cultivo);
	}
	


	@Override
	public void eliminarCultivo(Cultivo cultivo) {
		if(this.cultivos.contains(cultivo)) {
			this.cultivos.remove(cultivo);
		}
		
	}
	
	public ArrayList<Cultivo> getCultivos(){
		return cultivos;
	}

	
	

}
