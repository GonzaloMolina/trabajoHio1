package EstadosDeVerificacion;

import Objetos.Muestra;

public class Media extends NivelDeVerificacion {

	@Override
	public void chequerEstadoDe(Muestra muestra) {
		muestra.cambiarVerificacion(new Alta());
	}

}
