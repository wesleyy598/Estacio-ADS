

package conceitosiniciais;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaeSaidaJOption {

   public static void main (String[] args) {

       
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        //exibindo uma mensagem
	
        String idade = JOptionPane.showInputDialog("Digite sua idade: ");
        
        int idadeInt = Integer.valueOf(idade);


        JOptionPane.showMessageDialog(null, "O nome foi "+nome+ " " + "e a idade foi "+idadeInt);


	}
}
