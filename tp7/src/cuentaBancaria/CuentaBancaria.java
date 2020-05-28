package cuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
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
	
	public void hacerMovimiento(CuentaBancaria cuenta, int monto) {
		cuenta.setSaldo(cuenta.getSaldo() - monto);
		cuenta.agregarMovimientos("Extraccion");
	}
	
	public abstract void extraer(int monto);
	
}