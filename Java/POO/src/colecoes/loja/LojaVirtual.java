/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.loja;

/**
 *
 * @author professor
 */
public class LojaVirtual {
 
   public static void main(String[] args) {
   
       
    Produto prod1 = new Produto(1,"notebook");
    Produto prod2 = new Produto(2,"teclado");
    
    
    CarrinhoCompras carrinhocompras = new CarrinhoCompras();
    
    carrinhocompras.adicionarItem(prod1,10);
    carrinhocompras.adicionarItem(prod2,20);
    
    
    System.out.println(carrinhocompras.toString());
    
    
    
   }
    
    
    
}
