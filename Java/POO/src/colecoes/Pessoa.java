/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colecoes;

public class Pessoa{

	private int idade;
 private String nome;

	public Pessoa(int idade, String nome){
		this.idade=idade;
		this.nome=nome;
	}

	public int getIdade(){
		return idade;
	}

	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setIdade(int idade){
		this.idade=idade;
	}
}
