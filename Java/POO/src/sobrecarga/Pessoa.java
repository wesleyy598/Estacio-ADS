/**
 * Classe modelando Pessoa com o objetivo de demonstrar os seguintes
 * conceitos de orientcao a objetos : Classe, Encapsulamento e Membros
 * (Atributos e Metodos)
 */
package sobrecarga;

/* Definicao da classe */
public class Pessoa {
	/* Corpo da classe */

	/* Atributos da classe */
	private int codigo;
	private String nome;	 //Nome da Pessoa
	private String endereco; //Endereco da Pessoa
	private String telefone; //Telefone da Pessoa

	/* Metodos da classe */


	//SOBRECARGA DO CONSTRUTOR
	
	/* Construtor 1*/
	public Pessoa(int codigo, String nome, String endereco) {
		setCodigo(codigo);
		setNome(nome);
		setEndereco(endereco);
	}
	
	/* Construtor 2*/
	public Pessoa(int codigo,String nome, String endereco, String telefone) {
		setCodigo(codigo);
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		
	}

	/* Metodos para leitura e escrita dos atributos */

	public void setNome (String nome) {
		this.nome = nome;
	}

	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}


	public void setCodigo (int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome () {
		return nome;
	}

	public String getEndereco () {
		return endereco;
	}

	public String getTelefone () {
		return telefone;
	}
	
	public int getCodigo () {
		return codigo;
	}

   public String toString () {
    return "[" + this.getNome() + "," + this.getEndereco() + "]";
  }

		
}