package Objetos;


import java.util.HashSet;
import java.util.Set;

import EstadosDeVerificacion.NivelDeVerificacion;


public class Muestra {
	
	private VerificadorDeMuestra verificador;
	
	private String fotografia;
	private Ubicacion ubicacionDeLaMuestra;
	private String aliasDePrimerVerificador;

	
	//Constructores
	public Muestra(String aliasVerificador, Verificacion verificacion) {
		this.verificador = new VerificadorDeMuestra(verificacion);
				//verificacion.getNivelDeVerificacion 
		this.aliasDePrimerVerificador 	  = aliasVerificador;
	}
	
	//Geters
	public NivelDeVerificacion getNivelDeVerificion() {
		return this.verificador.getNivelDeVerificacion();
	}
	//Booleans 
	public Boolean esDeUsuario(String alias) {
		return this.aliasDePrimerVerificador == alias;
	}

	public boolean esMuestraVerificablePara(String alias, Verificacion verificacion, Muestra nuevaMuestra) {
		return this.verificador.puedeVerificar(alias, verificacion, nuevaMuestra);
	}
	public Boolean tieneVerificacionDe(String alias) {
		return this.verificador.tieneVerificacionDe(alias);
	}
	public boolean esVerificacionAlta() {
		return this.verificador.esVerificacionAlta();
	}
		
	//Acciones que realiza la muestra
	
	public void cambiarVerificacion(NivelDeVerificacion nuevoNivel) {
		this.verificador.nuevoEstado(nuevoNivel);
	}
	public void agregarVerificacion(Verificacion verificacion) {
		this.verificador.agregarVerificacion(verificacion);
	}

	

	
		
		
	}

	
	
	

