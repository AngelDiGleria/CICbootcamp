package es.cic.bootcamp.ejercicio001;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrincipalTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSumar() {
		Principal principal = new Principal();
		
		int resultado = principal.sumar(4,5);
		
		assertEquals(9, resultado, "La suma no es correcta");
	}

}
