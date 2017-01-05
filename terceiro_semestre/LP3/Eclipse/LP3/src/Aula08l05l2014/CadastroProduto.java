package Aula08l05l2014;

import javax.swing.JOptionPane;

public class CadastroProduto {
	Produto p = new Produto();
	public CadastroProduto() {
		// TODO Auto-generated constructor stub
	}
	public Produto cadastrar(){
		p.setNome(JOptionPane.showInputDialog("Entre com o nome do Produto: "));
		p.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Entre com o preço do produto: ")));
		p.setDescricao(JOptionPane.showInputDialog("Entre com a descrição do Produto: "));
		p.setCod(Integer.parseInt(JOptionPane.showInputDialog("Entre com o codigo do Produto: ")));
		return p;
	}

}
