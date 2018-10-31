package EstadosDeConocimiento;

import EstadosDeVerificacion.NivelDeVerificacion;
import Objetos.AplicacionVinchuca;
import Objetos.Usuario;

public abstract class NivelDeConocimiento {
	protected Integer rankingDeConocimiento;
	protected NivelDeVerificacion nivelDeVerificacion;
	
	
	public Integer getRanking() {
		return this.rankingDeConocimiento;
	}
	public NivelDeVerificacion getNivelDeVerificacion() {
		return this.nivelDeVerificacion;
	}
	public abstract void resolverEstado(Usuario usuario, AplicacionVinchuca app);
}
