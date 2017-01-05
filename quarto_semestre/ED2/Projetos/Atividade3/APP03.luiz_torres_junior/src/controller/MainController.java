package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import model.Arvore;

public class MainController {
	String info;
	Arvore arvore = new Arvore();
	private BufferedReader bufferedReader;
	
	public MainController(){
		
	}
	public void obterArvore(){
		
		String linha=null ;
		String caminho = "arvore.txt";		
		try{
			FileReader fileReader = new FileReader(caminho);
			bufferedReader = new BufferedReader(fileReader);
			linha = bufferedReader.readLine();
			StringTokenizer tokenizer = new StringTokenizer(linha, ",");
			while(tokenizer.hasMoreTokens()) {
				  int converte = Integer.parseInt(tokenizer.nextToken());
				  arvore.inserirNo(converte);
				}
		}
		catch (FileNotFoundException f) {
			info="Arquivo n�o encontrado";
			System.out.println(info);	
		}catch(IOException e){
			info="Erro de entrada";
			System.out.println(info);	
		}catch(NullPointerException n){
			info="Valor nulo";
			System.out.println(info);
		}
	}
	public String inOrdemManager(){
		if(arvore.inOrdem().isEmpty())	
			return "Arvore vazia";
		else{	
			Iterator<Integer>iterator = arvore.inOrdem().iterator();
			while(iterator.hasNext()){
				info = ""+iterator.next();
			}
		}
		return info;
	}
	public String posOrdemManager(){
		if(arvore.posOrdem().isEmpty())
			return "Arvore vazia";
		else
			return ""+arvore.posOrdem();
	}
	public String preOrdemManager(){
		if(arvore.preOrdem().equals(null))
			info ="Arvore vazia";
		else{
			while (arvore.preOrdem().hasNext()){
					info = " "+arvore.preOrdem().next();
				}
			}
		return info;
	}
	
	public String buscaResultado(int valor){
		//if(arvore.preOrdem()==-1)
			//return "Valor N�o encontrado";
		//else
			//return "Valor encontrado";
	}
}
