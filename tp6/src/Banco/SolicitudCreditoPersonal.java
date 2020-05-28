
package Banco;

public class SolicitudCreditoPersonal extends Solicitud{

	private Banco banco;

	public SolicitudCreditoPersonal(Cliente cliente, Double monto, Double plazoEnMeses, Propiedad propiedad) {
		super(cliente, monto, plazoEnMeses, propiedad);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void aceptarCredito(){
		
		if(this.ingresosMensualesMayoresA() && montoDeLaCuota()) {
			
			this.banco.agregarSolicitud(this.nuevaSolicitud());
			
		}else{
			
			
		}
		
	}
	
	@Override
	public Solicitud nuevaSolicitud() {
		return new SolicitudCreditoPersonal(this.getCliente(), this.getMonto(), 
				this.getPlazoEnMeses(), this.getPropiedad());
	}
	
	public boolean ingresosMensualesMayoresA() {
		
		return this.getCliente().getSueldoNetoAnual() >= 15000;
		
	}
	
	@Override
	public boolean montoDeLaCuota() {
		
		return this.montoDeCuotaMensual() < (this.getCliente().getSueldoNetoMensual() - 0.7);
	}
	

}
