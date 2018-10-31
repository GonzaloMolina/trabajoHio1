package Objetos;

import EstadosDeConocimiento.NivelDeConocimiento;
import EstadosDeVerificacion.NivelDeVerificacion;

public abstract class Usuario {
	private String identificacion;
	protected NivelDeConocimiento nivelDeConocimiento;
	
	//Constructor
	public Usuario(String alias) {
		this.identificacion = alias;
	}
	//Mensajes que buscan algo
	public Integer cantidadDeMuestrasEnviadas(AplicacionVinchuca app) {
		return app.muestrasEnviadasDe(this);
	}
	public Integer cantidadDeMuestrasVerificadas(AplicacionVinchuca app) {
		return  app.verificacionesDe(this);
	}
	
	//Geters
	public String getAlias() {
		return this.identificacion;
	}
	public NivelDeVerificacion getNivelDeVerificacion() {
		return nivelDeConocimiento.getNivelDeVerificacion();
	}
	
	//Acciones del usuario
	//Envio de muestra
	public void enviarMuestra(Muestra nuevaMuestra, AplicacionVinchuca app) {
		this.enviarMuestraAlaAplicacion(nuevaMuestra, app);
		this.chequearEstado(this, app);
	}
	
	private void enviarMuestraAlaAplicacion(Muestra nuevaMuestra, AplicacionVinchuca app) {
		app.recibirMuestra(nuevaMuestra);
		
	}
	private void chequearEstado(Usuario usuario, AplicacionVinchuca app) {
		usuario.nivelDeConocimiento.resolverEstado(this, app);
	}
	
	//Verificacion de muestra
	//Nose si esta bien fusionar la muestra en este mensaje, quizas tendríamos que 
	//hacer un mensaje que sea tipo  this.creacionDeVerificacion(verificacion, muestra)
	//asi sacamos ese if horrendo de ahí
	public void verificarMuestra(Verificacion verificacion, Muestra nuevaMuestra, AplicacionVinchuca app){
		if(nuevaMuestra.esMuestraVerificablePara(this.getAlias(), verificacion, nuevaMuestra)) {
			nuevaMuestra.agregarVerificacion(verificacion); 
			this.enviarMuestra(nuevaMuestra, app);
		}
		this.chequearEstado(this, app);
	}
	public void setNivelDeConocimiento(NivelDeConocimiento nuevoNivel) {
		this.nivelDeConocimiento = nuevoNivel;
	}

}
