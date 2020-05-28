package BancoTest;

import org.junit.jupiter.api.BeforeEach;

import Banco.Cliente;
import Banco.Propiedad;
import Banco.SolicitudCreditoPersonal;


class SolicitarCreditoPersonalTest {
	
	Cliente julian;
	Propiedad propiedad;
	SolicitudCreditoPersonal solicitud;
	
	@BeforeEach
	public void setUp() {
		julian = new Cliente ("Julian", "Martinez", "Bernal", 34, 20000d, 100000d);
		propiedad = new Propiedad("Casa media", "Bernal", 5421d);
		julian.solicitarCreditoPersonal(17000d, 12000d, propiedad);
		
		
		
	}
	
	

	

}
