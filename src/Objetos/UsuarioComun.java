package Objetos;

public class UsuarioComun extends Usuario {

	public UsuarioComun(String alias) {
		super(alias);
		this.nivelDeConocimiento = new Novato();
	}

	@Override
	public void chequearEstado() {
		

	}

}
