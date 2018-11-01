package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Objetos.AplicacionVinchuca;
import Objetos.Muestra;
import Objetos.Usuario;
import Objetos.UsuarioComun;
import Objetos.Verificacion;

class UsuarioTest {
	Usuario usuario1;
	Usuario usuario2;
	Verificacion verificacion1;
	Verificacion verificacion2;
	Muestra muestra1;
	AplicacionVinchuca app;
	
	@BeforeEach
	void setUp() {
		usuario1      = new UsuarioComun("usuario1");
		usuario2 	  = new UsuarioComun("usuario2");
		verificacion1 = new Verificacion(usuario1, "vinchuca");
		verificacion2 = new Verificacion(usuario2, "vinchuca");
		muestra1      = new Muestra(usuario1.getAlias(), verificacion1);
		app 		  = new AplicacionVinchuca();

	}
	@Test
	void unUsuarioComunEmpiezaComoNovato() {
		//este test lo podemos hacer todo con mock
			
		assertEquals(new Integer(0) , usuario1.cantidadDeMuestrasEnviadas(app));
		assertEquals(new Integer(0) , usuario1.cantidadDeMuestrasVerificadas(app));
		assertEquals("usuario1" , usuario1.getAlias());
		
	}	
	@Test
	void unUsuarioEspecialiastaTieneNivelDeConocimientoEspecialiasta() {
		
	}
	@Test 
	void unUsuarioComunEnviaUnaMuestraALaAplicacion() {
		//este tambien	
		usuario1.enviarMuestra(muestra1 , app);
		assertEquals(new Integer(1), usuario1.cantidadDeMuestrasEnviadas(app));	
	}
	@Test
	void unUsuarioComunEnviaUnaVerificacionAUnoAplicacion() {
		//algun dia voy a usar mock
		usuario1.enviarMuestra(muestra1, app);
		usuario2.verificarMuestra(verificacion2, muestra1, app);
		assertEquals(new Integer(1) , usuario2.cantidadDeMuestrasVerificadas(app));		
	}
}
