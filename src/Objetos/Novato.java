package Objetos;

public class Novato extends NivelDeConocimiento {
	
	public Novato() {
		this.rankingDeConocimineto = 0;
		this.nivelDeVerificacion = new Bajo();
	}
	public NivelDeVerificacion getNivelDeVerificacion() {
		return this.nivelDeVerificacion;
	}

}
