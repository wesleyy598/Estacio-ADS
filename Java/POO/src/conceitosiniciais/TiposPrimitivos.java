package conceitosiniciais;
public class TiposPrimitivos {

    public static void main ( String[] args ) {
		
		
		/* Declarando tres variaveis do tipo float*/
		
		
		float nota1, nota2, nota3;
		
		
		
		
		/* Inicializando as tres vari veis float */
		nota1 = 10;
		nota2 = 7;
		nota3 = 5;
		/* Declarando e inicializando tr s variaveis float*/
		float n1 = 5, n2 = 2, n3 = 9;

		int idade = 28;
		char sexo = 'M'; //Lembrar de usar ap stofros
		double salario = 3000.00;
		boolean achou = false;

		/*
		 * quando uma vari vel   declarada como final a mesma n o pode ter seu
		 * conte do alterado
		 */
		final char FLAG = 'F';
		String nome = "helder";

		/*
		 * Erro, pois literais num ricas com casas decimais s o double
		 */
		// nota1 = 8.5
		nota1 = 8.5f; 			// convers o explicita para float
		nota2 = 7.0f; 			// convers o explicita para float
		

		System.out.println("Dados do Aluno");
		System.out.print("Idade \t= " + idade + "\n" );
		System.out.println("Sexo \t= " + sexo);
		System.out.println("Notas \t= " +
						   nota1 + "\t" +
						   nota2 + "\t" +
						   nota3);
		System.out.println("Achou \t= " + achou);
		System.out.println("Flag \t= " + FLAG);

		/* Conversao de double para int */
		double d = 34.78;
		int i = (int) d;
		System.out.println("double : " + d + "\n int : " + i);

    }
    
}