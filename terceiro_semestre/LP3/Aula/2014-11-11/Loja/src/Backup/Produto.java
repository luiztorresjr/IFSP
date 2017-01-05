package Backup;

import loja.*;

public class Produto implements Comparable{
    private String Nome;
    private String Descricao;
    private float Preco;
    private int Codigo; 
    
    public Produto(){
        
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String Descricao){
        this.Descricao = Descricao;
    }

    public float getPreco() {
        return Preco;
    }
    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    //Comparar com Inteiro os produtos
    public int compareTo(Object b){
        Produto p1 = (Produto)b;
        if(this.Codigo == p1.getCodigo())
            return 0;
        else if(this.Codigo<p1.getCodigo())
            return -1 ;
        else
            return 1;
    } 
    
    //Comparar os produto Com String
    /*public int compareTo(Object b){
        Produto p1 = (Produto)b;
        return this.Nome.compareTo( p1.getNome());
    }*/
    
    public boolean equals(Object obj){
        Produto prod = (Produto) obj;
        if(this.getCodigo() == prod.getCodigo())
            return true;
        else 
            return false;
    }
}




