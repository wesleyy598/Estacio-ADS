/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colecoes;

import java.util.ArrayList;
public class PessoasApp{

	public static void main(String[] args){
	 	ArrayList pessoas = new ArrayList();

		Pessoa p1 = new Pessoa(20,"Helder");
		Pessoa p2 = new Pessoa(25,"Joana");

		pessoas.add(p1);
		pessoas.add(p2);


	}

}
