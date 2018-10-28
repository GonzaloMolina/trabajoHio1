package Objetos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AplicacionVinchuca {
	private Set<Muestra> muestras = new HashSet<Muestra>();
	private Set<Usuario> usuarios = new HashSet<Usuario>();
	
	
	public Set<Muestra> getMuestras(){
		return this.muestras;
	}
	public Set<Usuario> getUsuarios(){
		return this.usuarios;
	}
	public void recibirMuestra(Muestra nuevaMuestra) {
		muestras.add(nuevaMuestra);
	}
	public Integer muestrasEnviadasDe(Usuario usuario) {
		
	return muestras.stream().filter( unaMuestra -> unaMuestra.esDeUsuario(usuario.getAlias()))
		.collect(Collectors.toList()).size();	
	}
	public Integer verificacionesDe(Usuario usuario) {
	
	return muestras.stream().filter( unaMuestra -> unaMuestra.tieneVerificacionDe(usuario.getAlias()))
			.collect(Collectors.toList()).size();
	}
}
