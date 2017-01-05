/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11l08l2014;

/**
 *
 * @author a132067x
 */
public class Produto {
    String nome, descricao;
    Float preco;
    int cod;
    
    public Produto(){
       
    }
    public void setNome(String n){
        nome = n;
    }
    public void setDescricao(String d){
        descricao = d;
    }
    public void setPreco(float p){
        preco = p;
    }
    public void setCod(int c){
        cod = c;
    }
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public float getPreco(){
       return preco;
    }
    public int getCod(){
       return cod;
    }
}
