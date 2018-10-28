package Objetos;

public abstract class Usuario {
	private String identificacion;
	protected NivelDeConocimiento nivelDeConocimiento;
	
	
	public Usuario(String alias) {
		this.identificacion = alias;
	}
	public Integer cantidadDeMuestrasEnviadas(AplicacionVinchuca app) {
		return app.muestrasEnviadasDe(this);
	}
	public Integer cantidadDeMuestrasVerificadas(AplicacionVinchuca app) {
		return  app.verificacionesDe(this);
	}
	public abstract void chequearEstado();
	
	public String getAlias() {
		return this.identificacion;
	}
	public NivelDeVerificacion getNivelDeVerificacion() {
		return nivelDeConocimiento.getNivelDeVerificacion();
	}
	public void enviarMuestra(Muestra nuevaMuestra, AplicacionVinchuca ap) {
		ap.recibirMuestra(nuevaMuestra);
	}
	public void verificarMuestra(Verificacion verificacion, Muestra nuevaMuestra, AplicacionVinchuca ap){
		
		if(nuevaMuestra.esMuestraVerificablePara(this, verificacion)) {
			nuevaMuestra.agregarVerificacion(verificacion); 
			ap.recibirMuestra(nuevaMuestra);
		}
	}
}
