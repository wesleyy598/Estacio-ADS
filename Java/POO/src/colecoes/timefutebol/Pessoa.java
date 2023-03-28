package colecoes.timefutebol;


public class Pessoa {
  /** CPF da pessoa */
  private String cpf;
  /** Nome da pessoa */
  private String nome;

  /**
   * Construtor
   * @param cpf cpf da pessoa
   * @param nome nome da pessoa
   */
  public Pessoa (String cpf, String nome) {
    setCpf(cpf);
    setNome(nome);
  }

  /**
   * Atribui o cpf da pessoa
   * @param cpf cpf a ser atribu�do
   */
  public void setCpf (String cpf) {
    this.cpf = cpf;
  }

  /**
   * Atribui o nome da pessoa
   * @param nome nome a ser atribu�do
   */
  public void setNome (String nome) {
    this.nome = nome;
  }

  /**
   * Retorna o cpf da pessoa
   * @return cpf
   */
  public String getCpf () {
    return this.cpf;
  }

  /**
   * Retorna o nome da pessoa
   * @return nome
   */
  public String getNome () {
    return this.nome;
  }

  /**
   * Retorna a representacao String da Pessoa
   * @return representacao String da Pessoa
   */
  public String toString () {
    return "[" + this.getCpf() + "," + this.getNome() + "]";
  }


}