package cadastro;

import javax.swing.JOptionPane;

public class CadastroCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
			c.setNome(JOptionPane.showInputDialog("Entre com o Nome:"));
			c.setEndereco(JOptionPane.showInputDialog("Entre com o Endereço:"));
			c.setTelefone(JOptionPane.showInputDialog("Entre com o Telefone:"));
			c.setEmail(JOptionPane.showInputDialog("Entre com o Email:"));	
			System.out.println("Nome: "+c.getNome()+"\nEndereço: "+c.getEndereco()+"\nTelefone: "+c.getTelefone()+"\nEmail: " + c.getEmail());

	}

}
