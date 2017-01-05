package Aula_06_08;

import java.util.Iterator;
import javax.swing.JOptionPane;

public class MostrarPrateleira {

		public void Vizualizar(Prateleira p1){


		if(p1.size() == 0)
		{
			JOptionPane.showMessageDialog(null, "Não a protudo Cadastrado \n");
		}
		else
		{
			Produto p;
			Iterator<Produto> x = p1.iterator();

			String info = new String();
			while(x.hasNext())
	    	{
				p = x.next();
	    		info +="Nome:  "+p.getnome()+"  Codigo:  "+p.getcodigo()+"  Descriçâo:  "+p.getdescricao()+"  Preço:  "+p.getpreco()+"\n";

	    	}

			JOptionPane.showMessageDialog(null, info);
		}

		}
}
