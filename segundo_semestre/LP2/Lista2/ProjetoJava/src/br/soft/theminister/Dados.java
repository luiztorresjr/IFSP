package br.soft.theminister;

	import java.awt.HeadlessException;
	import java.io.FileNotFoundException;
	import java.io.PrintWriter;
	import javax.swing.JOptionPane;

public class Dados {
	    Cliente c = new Cliente();
	    public Dados() {
	    	
	    }
	    public void gravarDados(Cliente c){
	        try {
	        	c.Cliente.add(PrintWriter arq = new PrintWriter("CADASTRO.txt"))
	            try () {
	                arq.println("Nome do usuario: "+c.getNome());
	                arq.println("Endereço do usuario: "+c.getEndereco());
	                arq.println("Numero da casa: "+c.getNumero());
	                arq.println("Cep do usuario: "+c.getCep());
	                arq.println("Cidade do usuario: "+c.getCidade());                
	                arq.println("Telefone do usuario: "+c.getTelefone());
	            }
	            JOptionPane.showMessageDialog(null,"Arquivo salvo com Sucesso!!");
	        } catch (FileNotFoundException | HeadlessException erro) {
	            JOptionPane.showMessageDialog(null,"FALHA Arquivo não salvo. ERRO:!!"+erro.getMessage());           
	        
	    }
	    }
	    public void Sistema(Cliente c){       
	        System.out.println("Nome do usuario: "+c.getNome());            
	        System.out.println("Endereço do usuario: "+c.getEndereco());       
	        System.out.println("Cidade do usuario: "+c.getCidade());
	        System.out.println("Cidade do usuario: "+c.getCep());
	        System.out.println("Telefone do usuario: "+c.getTelefone());
	    }
	}



