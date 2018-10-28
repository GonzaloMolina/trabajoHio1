package Objetos;

public abstract class NivelDeConocimiento {
	protected Integer rankingDeConocimineto;
	protected NivelDeVerificacion nivelDeVerificacion;
	
	
	public Integer getRanking() {
		return this.rankingDeConocimineto;
	}
	 public abstract NivelDeVerificacion getNivelDeVerificacion();
}
