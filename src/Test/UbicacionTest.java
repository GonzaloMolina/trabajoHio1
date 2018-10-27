package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Ubicacion;

class UbicacionTest {

	@Test
	void unaUbicacionTieneLatitudYLongitud() {
		Ubicacion ub1 = new Ubicacion(10d , 10d);
		
		assertEquals(new Double(10) , ub1.getLatitud());
		assertEquals(new Double(10) , ub1.getLongitud());
	}

}
