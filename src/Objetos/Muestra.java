package Objetos;

import java.util.HashSet;
import java.util.Set;


public class Muestra {
	
	private Set<Verificacion> verificaciones= new HashSet<Verificacion>(); 
	// si tenemos tiempo delegar este colaborador en un objeto que lo calcule
	private String fotografia;
	private Ubicacion ubicacionDeLaMuestra;
	private NivelDeVerificacion nivelDeVerificacionDeMuestra;
	private String aliasDePrimerVerificador;
	

	public Muestra(String aliasVerificador, Verificacion verificacion) {
		this.verificaciones.add(verificacion);
		this.nivelDeVerificacionDeMuestra = verificacion.getNivelDeVerificacion();
		this.aliasDePrimerVerificador 	  = aliasVerificador;
	}
	
	public NivelDeVerificacion getNivelDeVerificion() {
		return this.nivelDeVerificacionDeMuestra;
	}
	
	public Boolean esDeUsuario(String alias) {
		return this.aliasDePrimerVerificador == alias;
	}
	
	public void agregarVerificacion(Verificacion verificacion) {
		this.verificaciones.add(verificacion);
		//cambia el nivel de verificacion. 
		this.nivelDeVerificacionDeMuestra.chequerEstadoDe(this);
	}
	
	public boolean esMuestraVerificablePara (Usuario u, Verificacion v) {
		
		return v.getAliasDeVerificador() != u.getAlias() || this.verificaciones.size() < 3;
	}
	public Boolean tieneVerificacionDe(String alias) {
		boolean res = false;
		for(Verificacion v : verificaciones) {
			res = res || v.esVerificacionDe(alias);
		}
		return res;
	}

	public void cambiarVerificacion(NivelDeVerificacion nuevoNivel) {
		this.nivelDeVerificacionDeMuestra = nuevoNivel;
	}

	public boolean esVerificacionMedia() {
	//estaria bueno generar el objeto que contenga las verificaciones y delegarle los problemas
		return true;
	}
	
}
