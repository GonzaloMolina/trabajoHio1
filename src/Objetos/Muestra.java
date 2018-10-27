package Objetos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Muestra {
	
	private Set<Verificacion> verificaciones= new HashSet<Verificacion>();
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
}
