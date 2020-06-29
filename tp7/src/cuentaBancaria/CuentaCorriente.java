package cuentaBancaria;


public class CuentaCorriente extends CuentaBancaria {
	
	private int descubierto;
	
	public CuentaCorriente(String titular, int descubierto){
		super(titular);
		this.descubierto=descubierto;
	}
	
	public int getDescubierto(){
		return this.descubierto;
	}
 
	// operacion concreta
	@Override
	public boolean puedeExtrar(int monto) {
		return (this.getSaldo() + this.getDescubierto() >= monto);
		}
	}
