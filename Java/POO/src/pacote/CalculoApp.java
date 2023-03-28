/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*definindo o nome do pacote que a classe pertence*/
package pacote;



/*comandos imports para a importação de classes*/
import javax.swing.*;
//importando a classe Color do pacote java.awt
import java.awt.Color;

public class CalculoApp{
	public static  void main(String[] argumentos){


		float a;
		float b;

		float resultadosoma;
		float resultadomulti;

		a=2;
		b=4;
		resultadosoma = a+b;
		resultadomulti = a*b;

		System.out.println(resultadosoma);
		System.out.println(resultadomulti);

		JOptionPane.showMessageDialog(null,"resultados " +resultadosoma +" "+resultadomulti);


	}

}
