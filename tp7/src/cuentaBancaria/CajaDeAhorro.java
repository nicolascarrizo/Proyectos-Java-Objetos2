package cuentaBancaria;

public class CajaDeAhorro extends CuentaBancaria {
	
	 private int limite;
	 
	 public CajaDeAhorro(String titular, int limite){
		 super(titular);
		 this.limite=limite;
	 }
	 
	 public int getLimite(){
		 return this.limite;
	 }
	 
	 //operacion concreta 
	 @Override
	 public boolean puedeExtrar(int monto) {
		 return (this.getSaldo() >= monto && this.getLimite() >= monto);
		 }
}


