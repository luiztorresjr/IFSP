package Aula_06_08;
import javax.swing.JOptionPane;

public class Mostrar {

    public void amostra(Produto p){

        JOptionPane.showMessageDialog(null,"Produto : "+p.getnome()+"\nDescricao : "+p.getdescricao());
        JOptionPane.showMessageDialog(null,"Codigo : "+p.getcodigo()+"\nPreco : "+p.getpreco());

    }
}
