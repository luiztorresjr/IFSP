package Aula_06_08;

import java.util.Collections;

public class MostrarOrdem extends MostrarPrateleira{
	public void Vizualizar(Prateleira p){

		//Collections.sort(p);//mostra em ordem
		Collections.sort(p);
		Collections.reverse(p);
		super.Vizualizar(p);

	}
}
