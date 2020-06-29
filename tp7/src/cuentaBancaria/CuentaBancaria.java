package cuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	// operaqciones primitivas
	private String titular;
	private int saldo;
	private List<String> movimientos;
	
	public CuentaBancaria(String titular){
		this.titular=titular;
		this.saldo=0;
		this.movimientos= new ArrayList<String>();
	}
 
	public String getTitular(){
		return this.titular;
  }
	
	public int getSaldo(){
		 return this.saldo;
	}
	
	protected void setSaldo(int monto){
		 this.saldo=monto;
	}
	
	public void agregarMovimientos(String movimiento){
		 this.movimientos.add(movimiento);
	}
	
	//metodo plantilla 
	public void extraer(int monto) {
		if (this.puedeExtrar(monto)) {
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimientos("Extracccion");
		}
		
	}
	
	//hook method
	public abstract boolean puedeExtrar(int monto);
	
}