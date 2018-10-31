package EstadosDeConocimiento;


import EstadosDeVerificacion.Media;
import Objetos.AplicacionVinchuca;
import Objetos.Usuario;

public class Experto extends NivelDeConocimiento{
	public Experto() {
		this.rankingDeConocimiento = 1;
		this.nivelDeVerificacion = new Media();
	}
	
	@Override
	public void resolverEstado(Usuario usuario, AplicacionVinchuca app) {
		if(usuario.cantidadDeMuestrasEnviadas(app) < 20 &&
		   usuario.cantidadDeMuestrasVerificadas(app) < 10) {
			usuario.setNivelDeConocimiento(new Novato());
		}
		
	}

}
