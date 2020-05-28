package llamadasTelefonicas;

public abstract class LlamadaTelefonica {
	private int tiempo; //dato primitivo
	private int horaDelDia; //dato primitivo 
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	public int getTiempo(){ //operaciones primitivas
		return this.tiempo;
	}
	public int getHoraDelDia(){ // operacion primitivas
		return this.horaDelDia;
	}
	
	//HACER ABSTRACT ES UNA FORMA DE IMPLEMENTAR EL TEMPLATE METHOD
	public abstract boolean esHoraPico();


	public float costoFinal(){
		if(this.esHoraPico()){
			return this.costoNeto()*1.2f*this.getTiempo();
		}else{
			return this.costoNeto()*this.getTiempo();
		}
	}
	
	public float costoNeto(){
		return this.getTiempo()*1;
	}
}