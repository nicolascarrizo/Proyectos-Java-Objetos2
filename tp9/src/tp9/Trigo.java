package tp9;

public class Trigo extends Cultivo{
	
	// es una hoja 

	@Override
	public Integer getGanaciaAnual() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public void agregarCultivo(Cultivo cultivo) {
		System.out.println("Soy un Trigo (hoja) no puedo agregar");
		
	}

	@Override
	public void eliminarCultivo(Cultivo cultivo) {
		System.out.println("Soy un Trigo (hoja) no puedo eliminar");
		
	}
	

}
