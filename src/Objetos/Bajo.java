package Objetos;

public class Bajo extends NivelDeVerificacion {

	@Override
	public void chequerEstadoDe(Muestra muestra) {
		if(muestra.esVerificacionMedia()) {
			muestra.cambiarVerificacion(new Media());
		}else {
			muestra.cambiarVerificacion(new Alta());
		}
		
	}



}
