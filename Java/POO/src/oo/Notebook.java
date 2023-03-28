/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oo;
/*Classe representando um modelo para armazenar dados
de um notebook*/
public class Notebook {

   int codigo;
   int tamanho;

   public Notebook(int codigo, int tamanho) {
     this.codigo=codigo;
     this.tamanho=tamanho;
   }

   public void ligar(){
	System.out.println("ligando o notebook");
   }

   public void desligar(){
	System.out.println("desligando o notebook");
   }


}
