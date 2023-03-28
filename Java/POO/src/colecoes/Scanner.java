package colecoes;

/**
 * SubClasse de Equipamento com o objetivo de demonstrar os seguintes conceitos de
 * orienta��o a objetos : Heran�a e Redefini��o de M�todos 
 */


public class Scanner extends Equipamento { //heran�a

	private int resolucao;

	
	public Scanner (int codigo, String reservado, int resolucao) {
		/* Chamando o construtor da superclasse (Equipamento) */
		super(codigo, reservado);
		setResolucao (resolucao);
		
	}

	/* Redefini��o do m�todo escreve da superclasse Equipamento */
   public String toString() {
     System.out.println("  ");
     return(super.toString() + "Tamanho do hd : " +tamanho_hd );
   
  }
 
}