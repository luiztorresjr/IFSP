package br.soft.theminister;

public class Data{
	public Data(){
		
	}
String data;
public void setData( String data){
	
	String dia = data.substring(0,1);
	String mes = data.substring(2,3);
	String ano = data.substring(4,5);
	
	data = dia+"/"+mes+"/"+ano;
}
public String getData(){
	return data;
}
}