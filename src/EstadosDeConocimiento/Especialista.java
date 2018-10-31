package EstadosDeConocimiento;

import EstadosDeVerificacion.Alta;
import EstadosDeVerificacion.Media;
import Objetos.AplicacionVinchuca;
import Objetos.Usuario;

public class Especialista extends NivelDeConocimiento {
	
	public Especialista() {
		this.rankingDeConocimiento = 2;
		this.nivelDeVerificacion = new Alta();
	}
	@Override
	public void resolverEstado(Usuario usuario, AplicacionVinchuca app) {
		
	}

}
