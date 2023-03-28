/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.timefutebol;

/**
 *
 * @author professor
 */
public class TimeApp {
    public static void main(String[] args){
        Jogador jog1 = new Jogador("001", "souza", 10, "atacante");
        Jogador jog2 = new Jogador("002", "ronaldo", 10, "atacante");
        Jogador jog3 = new Jogador("005", "neymar", 11, "atacante");
        Jogador jog4 = new Jogador("009", "julio cesar", 1, "goleiro");
        
        Time time = new Time("Brasil","verdeamarelo");
        
        time.insereJogador(jog1);
        time.insereJogador(jog2);
        time.insereJogador(jog3);
        time.insereJogador(jog4);
        System.out.println("jogadores");
        System.out.println(time.toString());
        
        time.alteraNomeJogador("001", "thiago silva");
        System.out.println("jogadores exibicao 2");
        System.out.println(time.toString());
        
        time.removerJogador("002");
        System.out.println("jogadores exibicao apos remocao");
        System.out.println(time.toString());
        
        Pessoa pes = time.pesquisarJogadorPorNome("neymar");
        
        System.out.println("dados do jogador pesquisado"+pes.toString());
        
        
    }
}
