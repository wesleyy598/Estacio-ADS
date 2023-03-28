/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abstratapoliomorfismo;

/**
 * SubClasse de Cliente que modela um Cliente Pessoa Fisica
 */
public class ClientePF extends Cliente {

   private String cpf;

   public ClientePF(String nome, String endereco, String cpf)
   {
	super(nome,endereco);
 	this.cpf=cpf;
   }
   public void setCpf(String cpf) {
	this.cpf = cpf;
   }
   public String getCpf() {
	return cpf;
   }
      public int calcularDesconto(){
	return 5;
   }

   public String toString () {
     return("Cliente Pessoa Juridica : " + super.toString() +
     " " + this.cpf);
   }
}

