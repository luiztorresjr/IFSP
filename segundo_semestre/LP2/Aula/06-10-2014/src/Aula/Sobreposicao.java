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
public class Sobreposicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        Pessoa p = new Pessoa();
        Aluno a = new Aluno();
        a.setNome("Luiz");
        a.setIdade(23);
        a.setCurso("ADS");
        a.setMatricula(132067);
        p.setNome("Luiz");
        p.setIdade(23);
        System.out.println("Pessoa.:\n");
        p.mostrar();
        System.out.println("Aluno.:\n");
        a.mostrar();       
    }
    
}
