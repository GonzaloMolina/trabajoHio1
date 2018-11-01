package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Objetos.Usuario;
import Objetos.UsuarioComun;
import Objetos.Verificacion;

class VerificacionTest {
	Usuario usuario1; 
	Verificacion verificacion1;
	
	@BeforeEach
	
	void setUp() {
		usuario1 = new UsuarioComun("usuario1");
		verificacion1 = new Verificacion(usuario1, "vinchuca");
	}
	@Test
	void unaVerificacionTieneUnAliasYObservacion() {	
		assertEquals("usuario1" , verificacion1.getAliasDeVerificador());
		assertEquals("vinchuca" , verificacion1.getObservacionDeVerificador());
		
	}

}
