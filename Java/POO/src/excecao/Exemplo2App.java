package excecao;

import java.sql.SQLException;

public class Exemplo2App {

    public static void main(String args[])
    {
        try
        {
            int a[] = new int[2];
            System.out.println(a[4]);
            
         //   Acessar banco de dados
        }
        
        
        
        catch (ArrayIndexOutOfBoundsException e)
        {
                // tratamento da exce��o imprime a
                //mensagem que causou a exce��o
                /*System.out.println("Exce��o gerada: " + e.getMessage());
                System.out.println("\nPilha de erros");
                // imprime a pilha de erros gerados
                e.printStackTrace();*/
                System.out.println("Vc tentou acessar um �ndice fora de faixa");
        }
        
        
        
        catch (SQLException e)
        {
                // tratamento da exce��o imprime a
                //mensagem que causou a exce��o
                /*System.out.println("Exce��o gerada: " + e.getMessage());
                System.out.println("\nPilha de erros");
                // imprime a pilha de erros gerados
                e.printStackTrace();*/
                System.out.println("Vc tentou acessar um �ndice fora de faixa");
        }
        
        
        catch (Exception e)
        {
                // tratamento da exce��o imprime a
                //mensagem que causou a exce��o
                /*System.out.println("Exce��o gerada: " + e.getMessage());
                System.out.println("\nPilha de erros");
                // imprime a pilha de erros gerados
                e.printStackTrace();*/
                System.out.println("Vc tentou acessar um �ndice fora de faixa");
        }


        finally
        {
		  System.out.println("O finally � sempre executado");
        }
}
}