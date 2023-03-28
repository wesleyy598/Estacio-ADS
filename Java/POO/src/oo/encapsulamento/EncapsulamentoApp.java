/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oo.encapsulamento;


public class EncapsulamentoApp {

  public static void main(String[] args){

	//instanciando o objeto 1
	Login login1 = new Login("helder",123456);
	//instanciando o objeto 2
	Login login2 = new Login("adm",654321);

        login1.setSenha(789456);
        System.out.println("login "+login1.getNomeUsuario());

   }
}
