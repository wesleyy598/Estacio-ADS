package colecoes;

/**
 *Aplica��o ReservaAPP que utiliza as classes 
 *Equipamentos, Computador, etc...
 *
 */


public class ReservaApp {

	public static void main (String[] args) {
		
		
	  	
		/* Declarando e instanciando um objeto do tipo Equipamentos */
		
		
		
		Equipamentos equipamentos = new Equipamentos();
		
		 	
		/* Instanciando um objeto do tipo Computador */
		Computador computador1 = new Computador(1,"Nao",10);
		Computador computador2 = new Computador(2, "Nao",20);
		
		equipamentos.insere(computador1);
		equipamentos.insere(computador2);
		
        /* Instanciando um objeto do tipo Computador */			
		DataShow datashow1 = new DataShow(3,"Nao",10);
		DataShow datashow2 = new DataShow(4, "Sim",20);

		equipamentos.insere(datashow1);
		equipamentos.insere(datashow2);
	
            	
	
	}
}





