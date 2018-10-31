package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import Objetos.AplicacionVinchuca;
import Objetos.Muestra;
import Objetos.Usuario;
import Objetos.UsuarioComun;
import Objetos.Verificacion;

class MuestraTest {

	@Test
	void unaMuestraDeUnUsuarioNovatoTieneNivelDeVerificacionBajo() {
	   Usuario usuario1 = new UsuarioComun("usuario");
	   Verificacion vr = new Verificacion(usuario1, "vinchuca");
	 	   
	   Muestra nuevaMuestra = new Muestra("usuario" , vr); 
	 
	   assertEquals( 0 , nuevaMuestra.getNivelDeVerificion());
	}
	@Test
	void unMuestraConDosVerificacionesDeUsuariosbajosTieneNivelMedio() {
		Usuario usuario1 = new UsuarioComun("usuario1");
		Usuario usuario2 = new UsuarioComun("usuario2");
		 Verificacion vr = new Verificacion(usuario1, "vinchuca");
		 Verificacion v2 = new Verificacion(usuario2, "vinnchuca");
		 AplicacionVinchuca app = Mockito.mock(AplicacionVinchuca.class);
				 
				 
		Muestra nuevaMuestra = new Muestra(usuario1.getAlias() , vr); 
		usuario2.verificarMuestra(v2, nuevaMuestra, app);
		
		assertEquals( 1 , nuevaMuestra.getNivelDeVerificion());
	}

}
