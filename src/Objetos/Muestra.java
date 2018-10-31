package Objetos;


import java.util.HashSet;
import java.util.Set;

import EstadosDeVerificacion.NivelDeVerificacion;


public class Muestra {
	
	private Set<Verificacion> verificaciones= new HashSet<Verificacion>(); 
	// si tenemos tiempo delegar este colaborador en un objeto que lo calcule
	private String fotografia;
	private Ubicacion ubicacionDeLaMuestra;
	private NivelDeVerificacion nivelDeVerificacionDeMuestra;
	private String aliasDePrimerVerificador;

	
	//Constructores
	public Muestra(String aliasVerificador, Verificacion verificacion) {
		this.verificaciones.add(verificacion);
		this.nivelDeVerificacionDeMuestra = verificacion.getNivelDeVerificacion();
		this.aliasDePrimerVerificador 	  = aliasVerificador;
	}
	
	//Geters
	public NivelDeVerificacion getNivelDeVerificion() {
		return this.nivelDeVerificacionDeMuestra;
	}
	
	public String getAliasDeCreadorDeMuestra() {
		return this.aliasDePrimerVerificador;
	}
	private  Integer tamanioDeVerificaciones() {
		//no es mi responsabilidad
		return this.verificaciones.size();
	}
	//Booleans 
	public Boolean esDeUsuario(String alias) {
		return this.aliasDePrimerVerificador == alias;
	}
	public boolean esMuestraVerificablePara (Usuario u, Verificacion v) {
		
		return this.getAliasDeCreadorDeMuestra() != u.getAlias() || 
			   this.tamanioDeVerificaciones() < 3;
	}
	public Boolean tieneVerificacionDe(String alias) {
		boolean res = false;
		for(Verificacion v : verificaciones) {
			res = res || v.esVerificacionDe(alias);
		}
		return res;
	}
	public boolean esVerificacionAlta() {
		return this.tamanioDeVerificaciones() == 3;
	}
		
	//Acciones que realiza la muestra
	public void cambiarVerificacion(NivelDeVerificacion nuevoNivel) {
		this.nivelDeVerificacionDeMuestra = nuevoNivel;
	}
	public void agregarVerificacion(Verificacion verificacion) {
		this.verificaciones.add(verificacion);
		this.nivelDeVerificacionDeMuestra.chequerEstadoDe(this);
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
		
		
	}

	
	
	

