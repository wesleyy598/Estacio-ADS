/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abstratapoliomorfismo;

/* Definição da classe */
public abstract class Cliente {

    /* Atributos da classe */
    private String nome; //Nome do cliente
    private String endereco; //Endereco do cliente

    /* Construtor */
    public Cliente (String nome, String endereco) {
	this.nome=nome;
	this.endereco=endereco;
     }

    public void setNome(String nome) {
	this.nome = nome;
    }
    public void setEndereco(String endereco) {
	this.endereco = endereco;
    }
    public String getNome () {
	return nome;
    }
    public String getEndereco() {
	return endereco;
    }
        /*Método abstrato sem implementação*/
    public abstract int calcularDesconto();


    /* Método que retorna os atributos do cliente */
    public String toString(){
    	return(this.nome+ " " + this.endereco);
    }
}
