package interfacesestatico;

/*Programa exemplo utilizando interface*/

public class AlunoApp {
	
	public static void main(String args[])
	{
		Aluno alu;
		
		alu = new Aluno("Jose","Rua tal","1");
		/*alu.getFaltas();
		alu.getMedia();
		alu.situacaoFinal();*/
		System.out.println(alu.toString());
	}
}