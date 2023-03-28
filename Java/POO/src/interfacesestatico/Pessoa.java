package interfacesestatico;

/**
 * Classe modelando cliente com o objetivo de demonstrar os seguintes
 * conceitos de orienta��o a objetos : Classe, Encapsulamento e Membros
 * (Atributos e M�todos)
 */



/* Defini��o da classe */
public abstract class Pessoa {
	/* Corpo da classe */

	/* Atributos da classe */
	private String nome;	    //Nome da pessoa
	private String endereco;	//endereco da pessoa
	

	/* M�todos da classe */

	
	/* Construtor */
	public Pessoa (String nome, String endereco) {
		setNome(nome);
		setEndereco(endereco);
	}

	/* M�todos para leitura e escrita dos atributos */

	public void setNome (String nome) {
		this.nome = nome;
	}

	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}

	public String getNome () {
		return nome;
	}

	public String getEndereco () {
		return endereco;
	}

	/* M�todo que escreve os atributos da pessoa na sa�da padr�o */
    public String toString(){
    	return(this.nome+ " " + this.endereco);
    }
		

}