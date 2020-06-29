
package banco;

public class SolicitudCreditoPersonal extends Solicitud{

	public SolicitudCreditoPersonal(Cliente cliente, Integer monto, Integer plazoEnMeses) {
		super(cliente, monto, plazoEnMeses);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean esCreditoAceptado() {
		return this.ingresosAnuales() && this.montoDeLaCuota();
	}

	private boolean ingresosAnuales() {
		return super.getCliente().getSueldoNetoMensual() > 15000;
	}

	private boolean montoDeLaCuota() {
		Double limite = super.getCliente().getSueldoNetoMensual() * 0.70;
		Integer montoCuota = super.montoMensual();
		
		return montoCuota < limite;
	}



}
