package colecoes.timefutebol;

public class Jogador extends Pessoa {
  
 private int numero;
  private String posicao;

  public Jogador (String cpf, String nome,
                  int numero, String posicao ) {
    super(cpf, nome);
    this.setNumero(numero);
    this.setPosicao(posicao);
  }

  public void setNumero (int numero) {
    this.numero = numero;
  }

  public void setPosicao (String posicao) {
    this.posicao = posicao;
  }

  public int getNumero (){
    return this.numero;
  }

  public String getPosicao () {
    return this.posicao;
  }

  public String toString () {
    return "[" + this.getCpf() + "," + this.getNome() + "," +
           this.getNumero() + "," + this.getPosicao()+ "]";
  }

  
}