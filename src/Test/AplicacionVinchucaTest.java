package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.AplicacionVinchuca;
import Objetos.Muestra;
import Objetos.Verificacion;

class AplicacionVinchucaTest {

	@Test
	void unaAplicacionNoTieneNiMuestrasNiUsuario() {
		AplicacionVinchuca av = new AplicacionVinchuca();
		

		assertEquals(0 , av.getMuestras().size());
		assertEquals(0 , av.getUsuarios().size());
		
	}
	@Test
	void unaAplicacionAgregaUnUsuario() {
		 
	}

}
