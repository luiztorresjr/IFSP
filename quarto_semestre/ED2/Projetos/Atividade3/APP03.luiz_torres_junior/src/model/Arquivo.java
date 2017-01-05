package model;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {
	Arvore arvore = new Arvore();
	String info;
	private BufferedReader bufferedReader;
	public Arquivo() {
		// TODO Auto-generated constructor stub
	}
	
	public void lerArquivo(){		
		String linha=null;
		String file = "arvore.txt";
		try{
			FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			while((linha=bufferedReader.readLine())!= null){
				String letra[] = linha.split(",");
				int[] valor = new int[letra.length];
				for(int i= 0; i <= letra.length; i++){
					valor[i]= Integer.parseInt(letra[i]);			
					}
				
				for(int i= 0; i <= valor.length; i++){
					int no = valor[i];
					arvore.inserir(no);
				}
			}
			
			bufferedReader.close();
		}catch(FileNotFoundException e){
			
		}catch (IOException e) {
			
		}	
	}
}

