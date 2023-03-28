package oo.encapsulamento;

/*CLASSE PuBLICA*/
public class Computador {

	/*atributos da classe*/
	private String nomeHost;
	private int hd;
	private int ram;
	
	
	 
	/*CONSTRUTOR*/
	public Computador (String nomeHost, int hd, int ram ) {
		this.nomeHost=nomeHost;
		this.hd=hd;
		this.ram=ram;
	}

	
	/*MeTODOS GETTERS E SETTERS*/
    public String getNomeHost() {
		return nomeHost;
	}

	public void setNomeHost (String nomeHost) {
		this.nomeHost=nomeHost;
	}
	
	public int getHd(){
		return hd;
	}

	public void setHd(int hd){
		this.hd=hd;
	}
	

}