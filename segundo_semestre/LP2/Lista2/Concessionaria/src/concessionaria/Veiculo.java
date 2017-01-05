/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;


/**
 *
 * @author a132067x
 */
public class Veiculo {    
	int ano;
	float preco;
	String marca, modelo;

        public Veiculo() {
        }	

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }	
}
