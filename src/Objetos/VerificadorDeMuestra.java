package Objetos;

import java.util.HashSet;
import java.util.Set;

import EstadosDeVerificacion.NivelDeVerificacion;

public class VerificadorDeMuestra {
	
	private Set<Verificacion> verificaciones= new HashSet<Verificacion>(); 
	private NivelDeVerificacion nivelDeVerificacionDeMuestra;

	//Constructor
	public VerificadorDeMuestra(Verificacion nuevaVerificacion) {
		this.verificaciones.add(nuevaVerificacion);
		this.nivelDeVerificacionDeMuestra = nuevaVerificacion.getNivelDeVerificacion();
	}
	//Getters
	public NivelDeVerificacion getNivelDeVerificacion() {
		return this.nivelDeVerificacionDeMuestra;
	}
	public Integer cantidadDeVerificaciones() {
		return this.verificaciones.size();
	}

	//Acciones
	public void agregarVerificacion(Verificacion verificacion) {
		this.verificaciones.add(verificacion);
	}
	public void nuevoEstado(NivelDeVerificacion nuevoNivel) {
		this.nivelDeVerificacionDeMuestra = nuevoNivel;
	}
	
	
	//Booleanos
	public boolean esVerificacionAlta() {
		return this.cantidadDeVerificaciones() == 3;
	}
	public boolean puedeVerificar(String usuario, Verificacion nuevaVerificacion) {
		boolean res = false;
		for(Verificacion v : verificaciones) {
			res = res || v.noEsVerificacionDe(usuario);
		}
		return res;
	}
	public Boolean tieneVerificacionDe(String alias) {
		return null;
	}
	public void chequearNivelDeVerificacion(Muestra muestra) {
		this.nivelDeVerificacionDeMuestra.chequerEstadoDe(muestra);
		
	}
}



//public String void getTipoDeMuestra(){
		//por cada muestra hay que ver las observaciones y el tipo de usuario
		
	//	if(verificador.todosLosUsuariosMismoNivel) {
	//		verificador.observacionFinal();
	//	}
	//	if(verificador.algunoDiferente) {
	//		verificador.getMayorNivel
	//	}
	//	if(verificador.todosDifertentes) {
	//		verificador.getObservacionDeMayorNivel();
	//	}