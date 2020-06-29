package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	private Banco banco;
	private Cliente ailen;
	private Cliente gabriel;
	private Propiedad casa;
	private Propiedad casa2;
	private SolicitudCreditoPersonal solicitudPersonal;
	private SolicitudCreditoHipotecario solicitudHipotecaria;
	
	@BeforeEach
	public void setUp() {
		banco = new Banco();
		casa = new Propiedad("Inmueble", "Pasaje 123", 55000000);
		ailen = new Cliente("Ailen", "Medina", "Pasaje 123", 22, 18000, casa); 
		solicitudPersonal = new SolicitudCreditoPersonal(ailen, 10000, 12);
		
		
		casa2 =  new Propiedad("Inmueble", "Triunvirato", 550000);
		gabriel = new Cliente ("Gabriel", "Santana", "Triunvirato", 80, 80000, casa2);
		solicitudHipotecaria = new SolicitudCreditoHipotecario(gabriel, 25000, 18);
	}
	
	@Test
	void bancoConNuevoClienteTest() {
		banco.agregarCliente(ailen);
		Integer cantDeClientes = banco.getClientes().size();
		assertEquals(1, cantDeClientes);
		
	}
	
	@Test
	void bancoOtorgaCreditoPersonalAAilenTest() {
		banco.agregarCliente(ailen);
		banco.agregarSolicitud(ailen.getSolicitudCredito());
		ailen.setSolicitudCredito(solicitudPersonal);
		banco.otogarCreditoACliente(ailen.getSolicitudCredito());
		Integer creditoObtenido = ailen.getCredito(); 
		assertEquals(10000, creditoObtenido);
	}
	
	@Test
	void bancoNOOtorgaCreditoHipotecarioAGabrielTest() {
		banco.agregarCliente(gabriel);
		banco.agregarSolicitud(gabriel.getSolicitudCredito());
		gabriel.setSolicitudCredito(solicitudHipotecaria);
		banco.otogarCreditoACliente(gabriel.getSolicitudCredito());
		
		Integer creditoObtenido = ailen.getCredito(); 
		
		assertEquals(0, creditoObtenido);
	}
	
	
}
