package tp3;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PersonaTest {
	
	Persona personaB;
	Persona personaA;
	
	@BeforeEach
	public void setUp() {
		personaB = new Persona("Matias", 25, 20);
		personaA = new Persona("Juan", 2020 ,  18);
	}
	
	
	@Test
	public void tienenMismaEdad(){
		assertTrue("No es verdadero", personaA.menorQue(personaB));
	}


}
