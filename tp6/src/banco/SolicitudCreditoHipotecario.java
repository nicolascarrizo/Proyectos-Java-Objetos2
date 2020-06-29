package banco;

public class SolicitudCreditoHipotecario extends Solicitud{

	public SolicitudCreditoHipotecario(Cliente cliente, Integer monto, Integer plazoEnMeses) {
		super(cliente, monto, plazoEnMeses);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean esCreditoAceptado() {
		// TODO Auto-generated method stub
		return this.montoDeCuota() && this.montoTotalSolicitado() && this.edadCliente();
	}

	private boolean edadCliente() {
		Integer edadCliente = super.getCliente().getEdad();
		return edadCliente + añosPaganado() < 65;
	}
	
	private Integer añosPaganado() {
		Integer plazo = super.getPlazoEnMeses();
		if(plazo < 12) {
			return 0;
		}else if (plazo == 12) {
			return 1;
		}else {
			return 2;
		}
	}

	private boolean montoDeCuota() {
		Double montoCuota = super.getCliente().getSueldoNetoMensual() * 0.50;
		Integer cuotaCredito = super.montoMensual();
	
		return montoCuota >= cuotaCredito;
	}

	private boolean montoTotalSolicitado() {
		Double garantia = super.getCliente().getPropiedad().getValorFiscal() * 0.70;
		Integer montoTotal = super.getMonto();
		
		return garantia > montoTotal;
		
	}


	
	

}
