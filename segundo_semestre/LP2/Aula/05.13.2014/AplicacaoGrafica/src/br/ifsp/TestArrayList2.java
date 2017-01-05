/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsp;

import java.util.ArrayList;

/**
 *
 * @author a132067x
 */
public class TestArrayList2 {
    private Empregado e1, e2, e3;
    
    @SuppressWarnings("unused")
	public static void main(String[] args){
        TestArrayList2 t2 = new TestArrayList2();
    }
  
	@SuppressWarnings("rawtypes")
	public TestArrayList2(){
        @SuppressWarnings("unchecked")
		ArrayList<Empregado> al = new ArrayList();
        e1 = new Empregado ("Jose", (double)2000.00);
        e2 = new Empregado ("Alex", (double)1800.00);
        e3 = new Empregado("Maria", (double)6900.00);
        al.add(e1);
        al.add(e2);
        al.add(e3);
        for(int i=0; i<al.size();i++){
            Empregado e = (Empregado)al.get(i);
            System.out.println("Nome do Empregado:"+e.getNome()+" e  Salario:"+e.getSalario());
        }
    }
    public class Empregado{
        private String nome;
        private double salario;
        //public Empregado(String nome, double salario){

        public Empregado(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public String getNome() {
            return nome;
        }

        public double getSalario() {
            return salario;
        } 
    }
}
