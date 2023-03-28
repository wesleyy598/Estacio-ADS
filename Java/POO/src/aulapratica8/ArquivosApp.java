/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica8;

/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 05/01/03
 */

import java.io.*;
import java.util.*;  

public class ArquivosApp {
    
    public static void main(String[] args){
	try {
			FileOutputStream out = new FileOutputStream("e:\\teste.txt");

			
			String nome = "Helder";

			out.write("\n".getBytes());
			out.write(nome.getBytes());
			out.close();
                        
                        FileInputStream in = new FileInputStream("e:\\teste.txt");
				int tamanho = in.available();
				byte bytes[] = new byte[tamanho];
				in.read(bytes);
				String s = new String(bytes);
                                System.out.println("dados"+s);
				
			//visualizarArquivo();

		} catch (FileNotFoundException e) {
		
		} catch (IOException e) {
		
		}
        
        
    }
				
		
}
