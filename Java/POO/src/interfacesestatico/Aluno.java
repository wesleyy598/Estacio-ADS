package interfacesestatico;

/*Aluno herda de pessoa e implementa a interface IFSituacaoAcademica
 *isto fica evidenciado atraves dos identificados extends
 *e implements*/

public class Aluno extends Pessoa implements IFSituacaoAcademica
{

	private String codigo;
	private String situacaoFinal;
	private float media;
	private int faltas;

	/* Construtores */
	
	public Aluno (String nome, String endereco, String codigo) {
		super(nome, endereco);
		setCodigo ( codigo );
	}

	/* Metodos para leitura e escrita dos atributos */
	public void setCodigo (String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo () {
		return codigo;
	}
	
	public int getFaltas () {
		return faltas;
		
	}

	public float getMedia () {
		this.media = 5;
		return media;
	}


	public void exibirsituacaoFinal() {
            if (this.media <=6){
                System.out.println("aprovado");
            }
            else {
                System.out.println("reprovado");
            }  
	}



	/* Redefini��o do m�todo tostring da superclasse Pessoa */
	public String toString () {
	    return("Pessoa: " + super.toString() + " " + this.codigo + " " + this.media + " " + this.faltas + " " + this.situacaoFinal);
	}


}