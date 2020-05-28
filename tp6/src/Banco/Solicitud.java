package Banco;

public abstract class Solicitud{
	
	private Cliente cliente;
	private Double monto;
	private Double plazoEnMeses;
	private Propiedad propiedad;
	

	public Solicitud(Cliente cliente, Double monto, Double plazoEnMeses, Propiedad propiedad) {
		super();
		this.cliente = cliente;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
		this.propiedad = propiedad;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}


	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Double getPlazoEnMeses() {
		return plazoEnMeses;
	}
	public void setPlazoEnMeses(Double plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}
	


	public Double montoDeCuotaMensual() {
		return this.getMonto() / this.getPlazoEnMeses();
	}
	
	public abstract void aceptarCredito();
	
	public abstract Solicitud nuevaSolicitud();
	
	public abstract boolean montoDeLaCuota();
	
	

}
