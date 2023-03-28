

package conceitosiniciais;

import java.util.Scanner;

public class EntradaeSaidaScanner {

   public static void main (String[] args) {

       
       Scanner sc = new Scanner(System.in);
        //exibindo uma mensagem
	System.out.println("digite o seu nome");

        //lendo uma variável String com Keyboard
        String nome = sc.nextLine();

        System.out.println("digite a sua idade");
        int idade = sc.nextInt();


        System.out.println("o seu nome é "+nome  +" a sua idade é "+idade);


	}
}
