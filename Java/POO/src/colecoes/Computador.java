package colecoes;

/**
 * SubClasse de Equipamento com o objetivo de demonstrar os seguintes conceitos dxe
 * orienta��o a objetos : Heran�a e Redefini��o de M�todos 
 */


public class Computador extends Equipamento { //heran�a

	private int tamanho_hd;

	
	public Computador (int codigo, String reservado, int tamanho_hd) {
		/* Chamando o construtor da superclasse (Equipamento) */
		super(codigo, reservado);
		this.tamanho_hd=tamanho_hd;
		
	}

	/* M�todos para leitura e escrita dos atributos */
	public void setTamanho_hd (int tamanho_hd) {
		this.tamanho_hd = tamanho_hd;
	}

	public int getTamanho_hd () {
		return tamanho_hd;
	}

	public String getReservado () {
		return super.getReservado();
	}

	/* Redefini��o do m�todo escreve da superclasse Equipamento */
   public String toString() {
     System.out.println("  ");
     return(super.toString() + "Tamanho do hd : " +tamanho_hd );
   
  }
 
}