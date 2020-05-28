package tp4;

public class ProductoDePrimeraNecesidad extends Producto{
	

	
	public ProductoDePrimeraNecesidad(String nombre, Double precio, Boolean preciosCuidado) {
		super(nombre, precio, preciosCuidado);
		// TODO Auto-generated constructor stub
	}
	
	public Double precioPrimeraNecesidad() {
		return this.getPrecio() * 0.9;
	}

	
	
		
		

	}




