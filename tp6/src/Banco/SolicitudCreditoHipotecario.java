package Banco;

public class SolicitudCreditoHipotecario extends Solicitud{
	
	private Banco banco;

	public SolicitudCreditoHipotecario(Cliente cliente, Double monto, Double plazoEnMeses, Propiedad propiedad) {
		super(cliente, monto, plazoEnMeses, propiedad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aceptarCredito() {
		
		if(this.montoDeLaCuota() && this.montoTotalSolicitado() && this.edadAlPagar()) {
			
			this.banco.agregarSolicitud(this.nuevaSolicitud());
					
		}else {
			
		}
	}
	
	@Override
	public Solicitud nuevaSolicitud() {
		return new SolicitudCreditoHipotecario(this.getCliente(), this.getMonto(), 
				this.getPlazoEnMeses(), this.getPropiedad());
	}
	
	
	public boolean montoTotalSolicitado() {
		
		return this.getMonto() < (this.getPropiedad().getValorFiscal() - 0.7);
		
	}
	
	public boolean edadAlPagar() {
		return this.getCliente().getEdad() < 65;
		
	}
	
	@Override
	public boolean montoDeLaCuota(){
		
		return this.montoDeCuotaMensual() < (this.getCliente().getSueldoNetoMensual() - 0.5);
	}
	

}
