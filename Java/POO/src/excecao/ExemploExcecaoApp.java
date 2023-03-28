/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package excecao;

public class ExemploExcecaoApp {

    public static void main(String args[])
    {
        try
        {
int a[] = new int[2];
int b=0;
int c=2;
int resultado = c/b;

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
          // tratamento da exceção imprime a mensagem
           System.out.println("índice fora de faixa");
        }
        catch (ArithmeticException e)
        {
          // tratamento da exceção imprime a mensagem
          System.out.println("erro de divisão por zero");
        }

        finally
        {
          System.out.println("O finally sempre executa");
        }
}
}
