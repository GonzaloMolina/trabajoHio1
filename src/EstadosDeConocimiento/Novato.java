package EstadosDeConocimiento;

import EstadosDeVerificacion.Bajo;
import Objetos.AplicacionVinchuca;
import Objetos.Usuario;

public class Novato extends NivelDeConocimiento {
	
	public Novato() {
		this.rankingDeConocimiento = 0;
		this.nivelDeVerificacion = new Bajo();
	}

	@Override
	public void resolverEstado(Usuario usuario, AplicacionVinchuca app) {
		if(usuario.cantidadDeMuestrasEnviadas(app) >= 20 
		   && usuario.cantidadDeMuestrasVerificadas(app) >= 10) {
			usuario.setNivelDeConocimiento(new Experto());
		}
		
	}
	
}
