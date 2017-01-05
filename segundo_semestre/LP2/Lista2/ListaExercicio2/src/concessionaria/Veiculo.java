package concessionaria;

public class Veiculo {
	private String marca;
    private String modelo;
    private int ano;
    private float preco;
	public Veiculo() {
		// TODO Auto-generated constructor stub
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
	   }
