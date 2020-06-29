package llamadasTelefonicas;

public class LlamadaDescuento extends LlamadaTelefonica{
	
	public LlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
	}
	
	// METODO CONCRETO
	@Override
	public boolean esHoraPico() {
		return false;
	}
	
	// METODO CONCRETO
	@Override
	public float costoNeto(){
		return this.getTiempo()*0.95f;
	}
}