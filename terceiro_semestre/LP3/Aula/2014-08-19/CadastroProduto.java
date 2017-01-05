package Aula_06_08;
import javax.swing.JOptionPane;

public class CadastroProduto {
    public Produto CadProduto(){

    Produto p = new Produto ();
    p.setnome(JOptionPane.showInputDialog("Digite o Nome do Produto "));
    p.setdescricao(JOptionPane.showInputDialog("Digite a Descrição Do Produto"));
    String pre = JOptionPane.showInputDialog("Digite o Preço");
    if (pre != null)
    {
    	p.setpreco(Float.parseFloat((pre)));
    }
    else
    {
    	pre = "0";
    	p.setpreco(Float.parseFloat((pre)));
    }

    String pre1 = JOptionPane.showInputDialog("Digite o Codigo");
    if(pre1 != null)
    {

    	p.setpreco(Float.parseFloat((pre)));
    }
    else
    {
    	pre1 = "0";
    	p.setcodigo((Long.parseLong(pre1)));
    }
    return p;
    }

}
