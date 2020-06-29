package banco;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Integer sueldoNetoMensual;
	private Solicitud solicitudCredito;
	private Integer credito;
	private Propiedad propiedad;
	
	public Cliente(String nombre, String apellido, String direccion, Integer edad, Integer sueldoNetoMensual, Propiedad propiedad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.propiedad = propiedad;
		this.credito = 0;

	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}


	public String getDireccion() {
		return direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public Integer getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(Integer sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public Solicitud getSolicitudCredito() {
		return solicitudCredito;
	}

	public void setSolicitudCredito(Solicitud solicitudCredito) {
		this.solicitudCredito = solicitudCredito;
	}

	public Integer getCredito() {
		return credito;
	}

	public void setCredito(Integer credito) {
		this.credito = credito;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	

}
