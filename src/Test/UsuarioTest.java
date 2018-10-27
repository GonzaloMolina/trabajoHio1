package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.AplicacionVinchuca;
import Objetos.Muestra;
import Objetos.Usuario;
import Objetos.UsuarioComun;
import Objetos.Verificacion;

class UsuarioTest {

	@Test
	void unUsuarioComunEmpiezaComoNovato() {
		Usuario usuarioComun1 = new UsuarioComun("usuario1");
		AplicacionVinchuca ap = new AplicacionVinchuca();
		
		
		assertEquals(new Integer(0) , usuarioComun1.cantidadDeMuestrasEnviadas(ap));
		assertEquals(new Integer(0) , usuarioComun1.cantidadDeMuestrasVerificadas(ap));
		assertEquals("usuario1" , usuarioComun1.getAlias());
		
	}
	@Test 
	void unUsuarioComunEnviaUnaMuestraALaAplicacion() {
		Usuario usuarioComun1 = new UsuarioComun("usuario1");
		AplicacionVinchuca ap = new AplicacionVinchuca();
		Verificacion vr = new Verificacion(usuarioComun1, "vinchuca");
		Muestra nuevaMuestra = new Muestra(usuarioComun1.getAlias(), vr); 
		
		usuarioComun1.enviarMuestra(nuevaMuestra , ap);
		
		assertEquals(new Integer(1), usuarioComun1.cantidadDeMuestrasEnviadas(ap));
;		
	}
}
