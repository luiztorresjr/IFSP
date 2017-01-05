package Aula08l05l2014;

import java.util.Collections;

public class MostrarOrdem extends MostrarPrateleira{

	public MostrarOrdem() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("unchecked")
	public void Vizualizar(Prateleira prateleira){
		Collections.sort(prateleira);
		super.Vizualizar(prateleira);
	}

}
