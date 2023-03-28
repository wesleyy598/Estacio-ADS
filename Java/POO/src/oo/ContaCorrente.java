/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oo;

public class ContaCorrente {
	/*atributos*/
	private int agencia;
	private int numero;
	private float limite;

	/*método construtor versao 1*/
	public ContaCorrente(int agencia, int numero,
			     float limite)
{
		this.agencia=agencia;
		this.numero=numero;
		this.limite=limite;
	}
        /*método construtor versao 2*/
	public ContaCorrente(int agencia, int numero)
{
		this.agencia=agencia;
		this.numero=numero;
	}

	//métodos getters e setters
        public int getAgencia(){
		return agencia;
	}
	public void setAgencia(int agencia){
	    	this.agencia=agencia;
	}
        public int getNumero(){
		return numero;
	}
	public void setNumero(int numero){
	    	this.numero=numero;
	}
        public float getLimite(){
		return limite;
	}

        public void setLimite(float limite){
	    	this.limite =limite;
	}

}
