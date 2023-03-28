/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.loja;

/**
 *
 * @author professor
 */
public class Item {
    
    private Produto produto;
     private int qte;

    public Item(Produto produto, int qte) {
        this.produto = produto;
        this.qte = qte;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the qte
     */
    public int getQte() {
        return qte;
    }

    /**
     * @param qte the qte to set
     */
    public void setQte(int qte) {
        this.qte = qte;
    }

    @Override
    public String toString() {
        return "Item{" + "produto=" + produto + ", qte=" + qte + '}';
    }
   
    
    
    
}
