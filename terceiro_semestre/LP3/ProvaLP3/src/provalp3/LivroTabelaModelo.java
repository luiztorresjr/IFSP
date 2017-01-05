/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package provalp3;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a132067x
 */
 //extend informa que será um modelo table
public class LivroTabelaModelo extends AbstractTableModel{

	//instacia o arraylist aqui 
    private Estante estante;
	//coloque o nome das colunas da tabela em um vetor de string
    String[] nomeColuna={"Título", "Autores", "Ano de Publicação", "ISBN"};
    
	//informa que o construtor recebe a array quando iniciar
    public LivroTabelaModelo(Estante estante){
        this.estante=estante;
    }
    //solicia no array o seu tamanho
    @Override
    public int getRowCount() {
        return estante.size();
    }

	//informar quantia de colunas será igual a do vetor iniciado nesta classe
    @Override
    public int getColumnCount() {
        return nomeColuna.length;
    }
    //retorna os nomes para as colunas do vetor de string
    @Override
    public String getColumnName(int col){
        return nomeColuna[col];
    }
	
	//informa qu as celulas poderam ser editadas
    @Override
    public boolean  isCellEditable(int linha, int col){
        if(col==0){
            return false;
        }
        else {
            return true;
        }
    }
	
	//metodo usado para editar 
	//caso seja necessario deixar uma celula não editavel e só retirar do case
	//object neste caso será o valor novo que ira substiruir o antigo valor
    public void setValueAt(Object valor, int linha, int col){
        Livro livro = (Livro) estante.get(linha);
		//switch é feito por coluna 
		//os case devem ter break para poder editar coluna por coluna
        switch(col){
            case 0:
                livro.setTitulo(valor.toString());
                break;
            case 1:
                livro.setAutores(valor.toString());
                break;
            case 2:
                int novoAno = Integer.parseInt(valor.toString());
                livro.setAno(novoAno);
                break;
            case 3:
                int novoIsbn = Integer.parseInt(valor.toString());
                livro.setIsbn(novoIsbn);
            break;
        }
    }
	
	//metodo usado para retorno dos valores do arraylist na tabela
    @Override
    public Object getValueAt(int linhaInd, int colunaInd) {
        //instancia o tipo de object e solicita um get na ArrayList para cada linha.
        Livro livro = (Livro) estante.get(linhaInd);
        //switch para colocar os valores nas colunas de cada linha
		//os case não devem ter break;
        switch(colunaInd){
            case 0:
                return livro.getTitulo();
            case 1:
                return livro.getAutores();
            case 2:
                return livro.getAno();
            case 3:
                return livro.getIsbn();
            default:
                return "Ocorreu um erro";
        }
    }
   
}
