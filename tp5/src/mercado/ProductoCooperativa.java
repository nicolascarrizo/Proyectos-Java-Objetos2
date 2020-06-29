package mercado;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(Double precio, Integer stock) {
		super(precio, stock);
		// TODO Auto-generated constructor stub
	}

	
	public Double getPrecio() {
		return precio * 0.1;
	}

}
