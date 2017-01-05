/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.soft.theminister;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz
 */
public class gravarDados {
    Cliente c = new Cliente();
    public void gravarDados(Cliente c) {
        try {
            try (PrintWriter arq = new PrintWriter(new BufferedWriter(new FileWriter("Cadastro.txt", true)))) {
                arq.println("Usuario Nome do usuario: "+c.getNome()+" Endereço do usuario: "+c.getEndereco()+" Numero da casa: "+c.getNumero()+" Cep do usuario: "+c.getCep()+" Cidade do usuario: "+c.getCidade()+" Telefone do usuario: "+c.getTelefone());
            } catch (IOException ex) {
                Logger.getLogger(gravarDados.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Arquivo salvo com Sucesso!!");
        } catch (HeadlessException erro) {
            JOptionPane.showMessageDialog(null,"FALHA Arquivo não salvo. ERRO:!!"+erro.getMessage());           
        
    }
    }
    public void Sistema(Cliente c){    
        System.out.println("\nCliente: "+c.getNome());   
        System.out.println("Nome: "+c.getNome());            
        System.out.println("Endereço: "+c.getEndereco());       
        System.out.println("Cidade: "+c.getCidade());
        System.out.println("Numero: "+c.getCidade());
        System.out.println("Cep: "+c.getCep());
        System.out.println("Telefone: "+c.getTelefone());
    }
   public void leitura(Cliente c){
       try {
           try (BufferedReader leitura = new BufferedReader(
                   new FileReader("Cadastro.txt"))) {
               String linha = leitura.readLine();
               
               while (linha != null) {
                   System.out.println("linha="+linha);
                   linha = leitura.readLine();
               }       }
} catch (FileNotFoundException ex) {
  System.out.println("Erro " + ex);
} catch (IOException ex) {
  System.out.println("Erro " + ex);
}
   }
}
