package conceitosiniciais;

//Defini��o de classe
public class Comentarios {
 

	/**
  	 * M�todo main da Aplica��o
     * @param args par�metros da linha de comando
  	 */
  	 /*
  	  
  	  **/
  	  
  	  
  	 
    public static void main(String[] args) {

		/*
		 * O la�o abaixo ir� passar por todos os par�metros fornecidos na linha
		 * de comando e ir� escrev�-los na sa�da padr�o
		 */
		int i = 0; // Vari�vel inteira
		System.out.print("Par�metros : ");
		while (i < args.length) {
			/* Ecreve posi��o i do array args na sa�da padr�o */
			System.out.print(args[i] + " ");
			i++; // Incrementa a vari�vel i de 1 unidade
		}
	}
	
}

