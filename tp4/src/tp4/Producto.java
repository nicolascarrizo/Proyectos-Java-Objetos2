package tp4;

public class Producto {

		private String nombre;
		private Double precio;
		private Boolean preciosCuidado = false;
		
		public Producto(String nombre, Double precio, Boolean preciosCuidado) {
			super();
			this.setNombre(nombre);
			this.setPrecio(precio);
			this.setPreciosCuidado(preciosCuidado);
		}

		public Producto(String nombre, Double precio) {
			this.setNombre(nombre);
			this.setPrecio(precio);
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Double getPrecio() {
			return precio;
		};


		public void setPrecio(Double precio) {
			this.precio = precio;
		}

		public Boolean getPreciosCuidado() {
			return preciosCuidado;
		}

		public void setPreciosCuidado(Boolean preciosCuidado) {
			this.preciosCuidado = preciosCuidado;
		}
		
		public void aumentarPrecio(Double precio){
			 this.setPrecio(this.getPrecio() + precio);
			
		}
		
		public Double bajarPrecio(Double precio){
			return this.getPrecio() - precio;
			
		}
		
		
		
		
}
