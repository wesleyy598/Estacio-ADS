package colecoes.timefutebol;

import java.util.ArrayList;
import java.util.Iterator;



public class Time {
  private String nome;
  private String cores;
  private ArrayList jogadores;

  public Time(String nome, String cores) {
    this.setNome(nome);
    this.setCores(cores);
    jogadores = new ArrayList();
  }

  public void setNome (String nome) {
    this.nome = nome;
  }
  public void setCores (String cores) {
    this.cores = cores;
  }

  public String getNome ()  {
    return this.nome;
  }

  public String getCores () {
    return this.cores;
  }

  public void insereJogador (Jogador jogador) {
    this.jogadores.add(jogador);
  }

  public Pessoa pesquisarJogadorPorNome(String nomeJogador) {

	    Iterator it = jogadores.iterator();
	    
	    while (it.hasNext()){
	       				
	       Pessoa pes = (Pessoa)it.next();	    
		
		
                 if (pes.getNome().equals(nomeJogador)){
		  
                        return pes;
		  }
	    	
	    	
	    }
	   return null;
    }
  
  public void alteraNomeJogador(String cpf, String novoNome) {

     for (int i = 0; i < this.jogadores.size(); i++ ) {

          Jogador jogaux = (Jogador) this.jogadores.get(i);
          if (jogaux.getCpf().equals(cpf)){
            jogaux.setNome(novoNome);
           
          }
       }
    
    
    
  } 
  
  public void removerJogador(String cpf) {
    for (int i = 0; i < this.jogadores.size(); i++ ) {
      Jogador jogaux = (Jogador) this.jogadores.get(i);
      if (jogaux.getCpf().equals(cpf)){
        this.jogadores.remove(i);
      } 
    }
  }  

 public String toString () {
      StringBuffer sb = new StringBuffer("Pessoas : ");
      for (int i = 0; i < this.jogadores.size(); i++ ) {
          Pessoa pessoa = (Pessoa) this.jogadores.get(i);
          sb.append(pessoa.toString());
    }
    return sb.toString();
  }
}