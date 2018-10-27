package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Usuario;
import Objetos.UsuarioComun;
import Objetos.Verificacion;

class VerificacionTest {

	@Test
	void unaVerificacionTieneUnAliasYObservacion() {
		Usuario u1 = new UsuarioComun("usuario1");
		Verificacion vr = new Verificacion(u1, "vinchuca");
		
		assertEquals("usuario1" , vr.getAliasDeVerificador());
		assertEquals("vinchuca" , vr.getObservacionDeVerificador());
		
	}

}
