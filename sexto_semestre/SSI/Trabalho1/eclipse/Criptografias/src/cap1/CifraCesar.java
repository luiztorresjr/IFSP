package cap1;

import java.util.ArrayList;
import java.util.Iterator;

public class CifraCesar {

	public static void main(String[] args) {
		troca();
	}

	public String criptografia(String mensagem) {
		for (int i = 0; i < mensagem.length(); i++) {
			mensagem.charAt(i);
		}
		return mensagem;
	}

	public static void troca() {
		ArrayList<Character> alfabeto = new ArrayList<Character>();
		for (char letra = 'a'; letra <= 'z'; letra++) {
			alfabeto.add(letra);
		}
		int pos=0;
		int tamanho = alfabeto.size();
		while(pos < tamanho){
			alfabeto.get((pos+3) % 26);
		}
	}
}