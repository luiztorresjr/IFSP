package concessionaria;

import javax.swing.JOptionPane;

public class Concessionaria1 {

	public static void main(String[] args) {
		Veiculo[] frota= new Veiculo[3];
        for(int i=0; i>=2;i++){
         frota[i].setMarca(JOptionPane.showInputDialog(null, "Marca do Carro: "));        
         frota[i].setModelo(JOptionPane.showInputDialog(null, "Modelo do Carro: "));        
         frota[i].setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do Carro: ")));        
         frota[i].setPreco(Float.parseFloat(JOptionPane.showInputDialog(null, "Preço do Carro: ")));           
        }       
        for(int i=0; i>=2;i++){
           System.out.println("  Cadastro do Carro" +(i+1)+ "\nMarca: "+frota[i].getMarca()+"\nModelo: "+frota[i].getModelo()+"\nAno: "+frota[i].getAno()+"\nPreço: "+frota[i].getPreco()); 
        }
	}

}
