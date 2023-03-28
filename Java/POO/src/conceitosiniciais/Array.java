package conceitosiniciais;



public class Array {

    public static void main(String[] args) {
		/* declarando dois arrays do tipo int*/
		int[] a1;
		int[] a2;
		/* instanciando os dois arrays */
		a1 = new int[ 10 ]; // array com 10 posi��es de int
		a2 = new int[ 30 ]; // array com 30 posi��es de int
		/* imprimindo o tamanho dos array a1 e a2 */
		
		a1[0]=2;
		a1[1]=4;
		a1[2]=6;
		
		
		
		
		
		
		
		
		
		
		System.out.println("a1 tamanho : " + a1.length);
		System.out.println("a2 tamanho : " + a2.length);

		/* declarando, instanciando e atribuindo valores ao array notas */
		float[] notas = { 7.5f , 9.0f , 10.0f };
		/* imprimindo as posi��es do array notas */
		System.out.println("Notas : " + notas[0] + " - " +
										notas[1] + " - " +
										notas[2]);

		/* simulando array bidimensional*/
		int[][] matriz = new int[ 3 ][ 4 ];
		System.out.println("Linhas da Matriz : " + matriz.length);
		System.out.println("Colunas da Matriz : " + matriz[0].length);
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[1][0] = 5;
		matriz[1][1] = 6;
		matriz[1][2] = 7;
		matriz[1][3] = 8;
		matriz[2][0] = 9;
		matriz[2][1] = 10;
		matriz[2][2] = 11;
		matriz[2][3] = 12;
		/* Imprimindo o array */
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[0].length; j++)
				System.out.print(matriz[i][j] + " ");
    }
}