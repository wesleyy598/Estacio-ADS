package excecao;
public class Aluno{
	
	String nome;
	float nota;
	
	public Aluno(String nome, float nota){
		 this.nome=nome;
		 this.nota=nota;
	}

	public float getNota() throws NotaNegativaException{
	  if(this.nota < 0) {
       throw new NotaNegativaException();
      }
    return this.nota;
  }
	
	
}

