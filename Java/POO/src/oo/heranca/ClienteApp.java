/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oo.heranca;

/**
 * Aplicação para demonstrar o uso de Herança
 */
public class ClienteApp {

    public static void main(String[] args) {

	//Declarando uma variável cliente pessoa juridica
        ClientePJ clientePJ;
	//Declarando uma variável cliente pessoa fisica
	ClientePF clientePF;

	//Instanciando um objeto cliente pessoa fisica
        clientePF = new ClientePF("Jose","rua xxxx", "111.999.999");

        //Instanciando um objeto cliente pessoa juridica
        clientePJ = new ClientePJ("Faculdade X","rua xyz", "99.999.999.9999");
        //Imprimindo na tela os dados
	System.out.println(clientePJ.toString());
	System.out.println(clientePF.toString());


	}
}
