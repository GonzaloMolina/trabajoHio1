package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Objetos.AplicacionVinchuca;


class AplicacionVinchucaTest {
	
	AplicacionVinchuca app;
	
	@BeforeEach
	void setUp() { 
		app = new AplicacionVinchuca();
	}
	@Test
	void unaAplicacionNoTieneNiMuestrasNiUsuario() {
		
		assertEquals(0 , app.getMuestras().size());
		assertEquals(0 , app.getUsuarios().size());
		
	}
	@Test
	void unaAplicacionAgregaUnUsuario() {
		 
	}

}
