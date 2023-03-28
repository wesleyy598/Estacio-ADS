package colecoes;

/**
 * Classe modelando Equipamento com o objetivo de demonstrar os seguintes
 * conceitos de orienta��o a objetos : Classe, Encapsulamento e Membros
 * (Atributos e M�todos)
 */


/* Defini��o da classe */
public abstract class Equipamento {


	/* Atributos da classe */
	private int codigo;	 //Codigo do equipamento
	private String reservado; //se est� reservado ou n�o
	
	/* M�todos da classe */

	/* Construtor */
	public Equipamento (int codigo, String reservado) {
		this.codigo=codigo;
		this.reservado=reservado;
	}

	/* M�todos para leitura e escrita dos atributos */
	public void setCodigo (int codigo) {
		this.codigo = codigo;
	}

	public void setReservado (String reservado) {
		this.reservado = reservado;
	}

   public int getCodigo () {
		return codigo;
	}

	public String getReservado(){
		return reservado;
	}

	
	/* M�todo que escreve os atributos do Equipamento na sa�da padr�o */
  public String toString () {
		return("\n" + "Codigo: " + codigo + " " + "Reservado: " + reservado + "\n");

  }
  
  

}