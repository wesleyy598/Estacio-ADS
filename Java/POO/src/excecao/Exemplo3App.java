package excecao;
public class Exemplo3App{

    public static void main(String args[])
    {
    try { 
     
       Aluno aluno = new Aluno("teste",-2);
       aluno.getNota();
   }
            catch (NotaNegativaException e)
        {
                // tratamento da exce��o imprime a
                //mensagem que causou a exce��o
                System.out.println("Exce��o gerada: " + e.getMessage());
         
        }

  
}
}