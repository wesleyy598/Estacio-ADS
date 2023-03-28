/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oo.encapsulamento;

public class Login {
	/*atributos*/
	private String nomeUsuario;
	private int senha;

	/*método construtor*/
	public Login(String nomeUsuario,int senha) {
		this.nomeUsuario=nomeUsuario;
		this.senha=senha;
	}
	//métodos getters e setters
        public String getNomeUsuario(){
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario){
	    	this.nomeUsuario =nomeUsuario;
	}
        public int getSenha(){
		return senha;
	}
	public void setSenha(int senha){
	    	this.senha =senha;
	}

}
