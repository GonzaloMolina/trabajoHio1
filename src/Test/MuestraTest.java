package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Muestra;
import Objetos.NivelDeConocimiento;
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
		
		Muestra nuevaMuestra = new Muestra(usuario1.getAlias() , vr); 
	}

}