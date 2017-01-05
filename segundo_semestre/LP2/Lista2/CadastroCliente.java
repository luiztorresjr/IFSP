import javax.swing.JOptionPane;

public class CadastroCliente{
	public static void main(String[] args){
	Cliente c = new Cliente(){
	c.setNome(JOptionPane.showInputDialog("Entre com o Nome:"));
	c.setEndereco(JOptionPane.showInputDialog("Entre com o Endereço:"));
	c.setTelefone(JOptionPane.showInputDialog("Entre com o Telefone:"));
	c.setEndereco(JOptionPane.showInputDialog("Entre com o Email:"));	
	System.out.println("Nome: %s\nEndereço: %s\nTelefone: %s\nEmail: %s"c.getNome(),c.getEndereco(), c.getTelefone(), c.getEmail());
	}	