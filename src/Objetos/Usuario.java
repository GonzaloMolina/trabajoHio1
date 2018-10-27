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
		return  0;
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
}
