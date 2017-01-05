/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aula;

/**
 *
 * @author a132067x
 */
class Pessoa {
    String nome;
    int idade;    
   
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }    
    
    public void mostrar(){
        System.out.println("Nome.:"+nome+"\nIdade.:"+idade);
    }
      
}
