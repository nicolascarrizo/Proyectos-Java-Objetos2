package tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {

	EquipoDeTrabajo equipoDeTrabajo;
	Persona personaB;
	Persona personaA;
	Persona personaC;
	
	
	@BeforeEach
	public void setUp() { 
		personaB = new Persona("Matias", 25, 20);
     	personaA = new Persona("Juan", 2020 ,  25);
		personaC = new Persona("Federico", 251 ,  30);

		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
