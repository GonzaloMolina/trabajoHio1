package EstadosDeVerificacion;

import Objetos.Muestra;

public class Bajo extends NivelDeVerificacion {

	@Override
	public void chequerEstadoDe(Muestra muestra) {
		if(muestra.esVerificacionAlta()) {
			muestra.cambiarVerificacion(new Alta());
		}else {
			muestra.cambiarVerificacion(new Media());
		}
		
	}



}
