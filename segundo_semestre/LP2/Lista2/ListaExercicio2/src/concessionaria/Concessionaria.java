package concessionaria;

import javax.swing.JOptionPane;

public class Concessionaria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo v = new Veiculo();
		v.setMarca(JOptionPane.showInputDialog(null, "Marca do Carro: "));
		v.setModelo(JOptionPane.showInputDialog(null, "Modelo do Carro: "));
		v.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do Carro: ")));
		v.setPreco(Float.parseFloat(JOptionPane.showInputDialog(null, "Preço do Carro: ")));
		System.out.println("  Cadastro do Carro   \nMarca: "+v.getMarca()+"\nModelo: "+v.getModelo()+"\nAno: "+v.getAno()+"\nPreço: "+v.getPreco());
	}

}
