package Banco;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Double sueldoNetoMensual;
	private Double sueldoNetoAnual;
	
	public Cliente(String nombre, String apellido, String direccion, Integer edad, Double sueldoNetoMensual,
			Double sueldoNetoAnual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.sueldoNetoAnual = sueldoNetoAnual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(Double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public Double getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}

	public void setSueldoNetoAnual(Double sueldoNetoAnual) {
		this.sueldoNetoAnual = sueldoNetoAnual;
	}
	
	public void solicitarCreditoPersonal(Double monto, Double plazoEnMeses, Propiedad propiedad) {
		new SolicitudCreditoPersonal(this, monto, plazoEnMeses, propiedad);
	}
	
	public void solicitarCreditoHipotecario(Double monto, Double plazoEnMeses, Propiedad propiedad) {
		new SolicitudCreditoHipotecario(this, monto, plazoEnMeses, propiedad);
	}
	
	
	

}
