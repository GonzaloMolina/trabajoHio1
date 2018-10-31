package Objetos;

import EstadosDeConocimiento.Novato;

public class UsuarioComun extends Usuario {

	public UsuarioComun(String alias) {
		super(alias);
		this.nivelDeConocimiento = new Novato();
	}

}
