package colecoes;

/**
 * SubClasse de Equipamento com o objetivo de demonstrar os seguintes conceitos de
 * orienta��o a objetos : Heran�a, Redefini��o de M�todos, Polimorfismo e
 * SobreCarga de M�todos
 */


public class DataShow extends Equipamento { //heran�a
	
	private int tamanho_cabo;

	public DataShow (int codigo, String reservado, int tamanho_cabo) {
		super(codigo,reservado);
		setTamanhoCabo(tamanho_cabo);
	}

	public void setTamanhoCabo(int tamanho_cabo) {
		this.tamanho_cabo = tamanho_cabo;
	}

	public int getTamanhoCabo() {
		return tamanho_cabo;
	}

	public String toString () {
	    return(super.toString() + "Tamanho do cabo: " + this.tamanho_cabo);
	}
}
