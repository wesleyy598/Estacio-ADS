package oo.encapsulamento;
public class ComputadorApp{
	
	public static void main(String[] args){
		
		
		Computador comp1 = new Computador("Maq 1",20,128);
	
		System.out.println("Imprimindo o atributo nomeHost");
	
		System.out.println(comp1.getNomeHost());
	
	
		Computador comp2 = new Computador("maquinalab20",250,1);
		System.out.println(comp2.getNomeHost());
		//System.out.println(comp2.getRam());
		
			
	
		
		//modificando o nome do host
		comp1.setNomeHost("Maq 2");
		
		
		
		
	}
	
}