package banco;

public abstract class Solicitud{
	
	private Cliente cliente;
	private Integer monto;
	private Integer plazoEnMeses;
	

	public Solicitud(Cliente cliente, Integer monto, Integer plazoEnMeses) {
		super();
		this.cliente = cliente;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
		
	}
	
	public Integer montoMensual() {
		return this.monto / this.plazoEnMeses;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public Integer getMonto() {
		return monto;
	}


	public Integer getPlazoEnMeses() {
		return plazoEnMeses;
	}



	public void setPlazoEnMeses(Integer plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}


	public abstract Boolean esCreditoAceptado();

	
	

}
