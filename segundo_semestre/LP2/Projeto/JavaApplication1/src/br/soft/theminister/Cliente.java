/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.soft.theminister;

import java.util.logging.Logger;
import static javax.accessibility.AccessibleAction.INCREMENT;


public class Cliente {  
    
    private static final Logger LOG = Logger.getLogger(Cliente.class.getName());

    
    private String nome;
    private String endereco;
    private int cep;
    private String telefone;
    private int numero;
    private String cidade;
    private String email;
    private int incremento;
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente() {        
		// TODO Auto-generated constructor stub
	}
    public String getNome() {
	return nome;
	}
    public void setNome(String nome) {
    	this.nome = nome;
	}
    public String getEndereco() {
	return endereco;
	}
    public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
     
     public String getTelefone(){
         return telefone;
     }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
