/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abstratapoliomorfismo;

/**
 * SubClasse de Cliente que modela um Cliente Pessoa Juridica
 */

public class ClientePJ extends Cliente {

   private String cnpj;

   public ClientePJ (String nome, String endereco, String cnpj)
   {
	super(nome,endereco);
 	this.cnpj=cnpj;
   }

   public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
   }

   public String getCnpj () {
	return cnpj;
   }

   public int calcularDesconto(){
	return 10;
   }


   public String toString () {
     return("Cliente Pessoa Juridica : " + super.toString() +
     " " + this.cnpj);
   }
}
