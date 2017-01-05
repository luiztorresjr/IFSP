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
class Aluno extends Pessoa{
    int matricula;
    String curso;  

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void mostrar(){
        System.out.println("Nome.:"+nome+"\nIdade.:"+idade+"\nMatricula.:"+matricula+"\nCurso.:"+curso);
    }
}
