package mercado;

public  class Producto{
	
	protected Double precio;
	private Integer stock;
	
	public Producto(Double precio, Integer stock) {
		super();
		this.precio = precio;
		this.stock = stock;
	}
	
	
	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	public void decrementarStock(){
		this.setStock(this.getStock() - 1);
			
	}
	
	
	

}
