/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.loja;

import java.util.ArrayList;

/**
 *
 * @author professor
 */
public class CarrinhoCompras {
    
    private ArrayList carrinho;
    
     
    public CarrinhoCompras(){
        carrinho = new ArrayList();
    }
    
    public void adicionarItem(Produto prod, int qte){
        Item item = new Item(prod,qte);
        carrinho.add(item);
    }
    
     public String toString () {
      StringBuffer sb = new StringBuffer("Produtos : ");
      for (int i = 0; i < this.carrinho.size(); i++ ) {
          Item item = (Item) this.carrinho.get(i);
          sb.append(item.toString());
    }
    return sb.toString();
  }
    
}
