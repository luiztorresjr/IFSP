package Partes;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Tela extends JFrame{
	
	
	public Tela(){	
		JFrame t = new JFrame();
		t.setLayout(new BorderLayout());
	}
	public void run(){
		Tela t = new Tela();
		t.setVisible(true);
		t.setSize(200,200);	
		t.setTitle("Tela de Cadastro");
		t.setResizable(true);
		JTextField n = new JTextField();
		n.setBounds(100, 100, 50, 50);		
		JLabel nome = new JLabel("Nome.:");
		nome.setBounds(100, 100, 0, 0);
		JLabel sobre=new JLabel("Sobrenome.:");
		JLabel cidade = new JLabel("Cidade.:");
		JLabel estado = new JLabel("Estado.:");
		JLabel pais = new JLabel("Pais.:");
		JButton salva = new JButton("Salvar");
		JButton limpa = new JButton("Limpar");
		t.add(limpa);
		t.add(salva);
		t.add(nome);
		t.add(n);
		t.add(sobre);
		t.add(cidade);
		t.add(estado);
		t.add(pais);
		t.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	}
}