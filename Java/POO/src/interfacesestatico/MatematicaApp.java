package interfacesestatico;

/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 05/01/20
 */
public class MatematicaApp {
    
    public static void main(String[] args) {
        
        
        double x =2.0;
		
	exibeNomeApp();

        System.out.println(x*Matematica.RAIZDEDOIS);
        
        System.out.println(Matematica.Soma(2,4));
        
                
    }
    
    
    public static void exibeNomeApp(){
		System.out.println("Matematica App");
	}

}

