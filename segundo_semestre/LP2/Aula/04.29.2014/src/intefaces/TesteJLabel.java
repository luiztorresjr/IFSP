package intefaces;

import java.awt.*;

import javax.swing.*;


@SuppressWarnings("serial")
public class TesteJLabel extends JFrame {
	
	JLabel label1;
	private JLabel label2;
	
	public TesteJLabel(){
		super("Teste de uso do JLabel");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		
		label1 = new JLabel("Rotulo de JLabel");	
		
		ImageIcon icone1 = new ImageIcon ("E:/2ºSemestre/LP2/Aula/04.29.2014/drawable/truco.jpg");		
		label2 = new JLabel ("Figura", icone1, SwingConstants.LEFT);		
		c.add(label1);		
		c.add(label2);		
		this.setPreferredSize(new Dimension(200,500));
		this.pack();
		this.setVisible(true);
		
	}
	
	
}
