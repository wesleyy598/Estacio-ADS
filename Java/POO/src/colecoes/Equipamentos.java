package colecoes;

/**
 * Classe modelando um conjunto de equipamentos com o objetivo de demonstrar os
 * seguintes conceitos de orienta��o a objetos : Objeto, heran�a, cole��o
 */


import java.util.ArrayList;

public class Equipamentos {
	/* Declarando um objeto : vector de Equipamento */
    private ArrayList eqarray; 	
	
	public Equipamentos () {
		this.eqarray = new ArrayList();
	}

     /*   Datashow extends Equipamento
        estou dizendo qeu datashow é um equipamento*/

	public void insere (Equipamento equipamento) {
		this.eqarray.add(equipamento);
		
	}
	
	
/*        public void insereDataShow(Datashow ds){
		
	}

	public void insereComputador(Computador comp){
		
	}*/

}










