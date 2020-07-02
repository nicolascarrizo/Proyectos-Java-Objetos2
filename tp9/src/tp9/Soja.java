package tp9;

public class Soja extends Cultivo{

	// es una hoja, no tienen hijos las hojas 
	
	@Override
	public Integer getGanaciaAnual() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public void agregarCultivo(Cultivo cultivo) {
		System.out.println("Soy una Soja (hoja) no puedo agregar");
		
	}

	@Override
	public void eliminarCultivo(Cultivo cultivo) {
		System.out.println("Soy una Soja (hoja) no puedo eliminar");
		
	}
	

}
