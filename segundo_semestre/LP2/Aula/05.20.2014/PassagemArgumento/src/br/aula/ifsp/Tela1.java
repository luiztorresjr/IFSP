package br.aula.ifsp;



import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tela1(){//construtor padrão
		}
		
	public Tela1(AplicacaoGrafica ag){
		this.ag=ag;
	}
	
	private AplicacaoGrafica ag;
	
	@SuppressWarnings("null")
	private void jButton1ActionPerformed(ActionEvent evt){
	Cliente c = new Cliente();
	JTextField JTextField1;
	JTextField JTextField2;	
	c.setNome(JTextField1.getText());
	c.setEndereco(JTextField2.getText());	
	ag.gravarDados(c);
	}
}
