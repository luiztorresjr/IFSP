package loja;
import javax.swing.JOptionPane;
public class Cadastro {
    private String Nome;
    private String Descricao;
    private int Preco;
    private int Codigo;
   
 
    
 public Produto cadastrar() {
    Produto cadastro = new Produto();     
        cadastro.setNome(JOptionPane.showInputDialog("Nome do produto:"));
        cadastro.setDescricao(JOptionPane.showInputDialog("Descricao do produto: "));
        cadastro.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Preco do produto: ")));
        cadastro.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Cod. do produto: ")));
    return cadastro;   
   }
}
    