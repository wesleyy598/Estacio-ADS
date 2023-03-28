/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;


public class TelaSwing2 extends JFrame {

    //método principal que instancia um frame e exibe na tela
    public static void main(String[] args) {

		TelaSwing2 agenda = new TelaSwing2();
		agenda.setSize( 420,250 );
		agenda.show();


    }

    //construtor da aplicação frame
    public TelaSwing2() {

        try {
           inicie();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }



    private void inicie() throws Exception {
     this.setLayout(null);
     this.setDefaultCloseOperation(3);
     this.setResizable(false);
     this.setTitle("Agenda");

     JButton jButtonSalvar  = new JButton();
     JLabel jLabelCodigo = new JLabel("Codigo");
     JTextField jTextFieldCodigo = new JTextField();
     JLabel jLabelNome = new JLabel("Nome");
     JTextField jTextFieldNome = new JTextField();
     //Definindo a posição x e y  - largura e altura do
     //componente
     jLabelCodigo.setBounds(new Rectangle(0,0,50,15));
     jTextFieldCodigo.setBounds(new Rectangle(58,3,99,22));
     jLabelNome.setBounds(new Rectangle(0, 25, 50, 15));
     jTextFieldNome.setBounds(new Rectangle(58,25,99,22));
     jButtonSalvar.setBounds(new Rectangle(0, 55, 99, 27));

     jButtonSalvar.setToolTipText("insere novo item");
     jButtonSalvar.setText("Salvar");

     this.getContentPane().add(jLabelCodigo, null);
     this.getContentPane().add(jTextFieldCodigo, null);
     this.getContentPane().add(jLabelNome, null);
     this.getContentPane().add(jTextFieldNome, null);
     this.getContentPane().add(jButtonSalvar, null);

    }
}
