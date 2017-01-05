/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a132067x
 */
public class ProdutosTabelaModelo extends AbstractTableModel implements Observer{
    //instancia a prateleira  
    private Prateleira prateleira;
    
    //cria um vetro de string para os nomes das colunas
    String[] nomeColunas = {"Codigo","Nome","Preco (R$)", "Descrição"}; 
    
    
    //metodo construtor 
    //deve receber o arraylist neste cso prateira para inicializar com um valor
    public ProdutosTabelaModelo(Prateleira prateleira){
        this.prateleira=prateleira;
        prateleira.addObserver(this);
    }
    
    //conta quantas linhas tera a tabela que é o tabanho 
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return prateleira.size();
     }
    //informa quantas colunas terá a tabela que é o tamanho do vetor de nome das colunas
    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    //informa o nome das colunas
    @Override
    public String getColumnName(int col){
        return nomeColunas[col];       
    }
    //informa que as colunas podem ser editadas
    public boolean isCellEditable(int row, int col){
         if(col==0){
            return false;
        }
        return true;        
    }
    @Override
    
    //metodo para poder passar os novos valores editados
     public void setValueAt(Object value, int row, int col){
        
         Produto produto = (Produto) prateleira.get(row);         
         switch(col){
            /*
            case 0:
                int novoCodigo = Integer.parseInt(value.toString());
                produto.setCodigo(novoCodigo);                
                break;
            */
            case 1:             
                produto.setNome(value.toString());                
                break;
            case 2:
                float novoPreco = Float.parseFloat(value.toString());
                produto.setPreco(novoPreco);
                break;
            case 3:
                produto.setDescricao(value.toString());
                break;           
         }        
     }
    
    @Override
    //retona os valores da pratelira para as colunas da tabela
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Produto produto = (Produto) prateleira.get(rowIndex);        
        switch(columnIndex){
            case 0:
                return produto.getCodigo();
            case 1:
                return produto.getNome();
            case 2:
                return produto.getPreco();
            case 3:
                return produto.getDescricao();
            default:
                return "Ocoreu um erro";
        }
        
    }    

    @Override
    //infoma para a tabela ser atualizada caso ocorra alteração no arraylist que é observado
    public void update(Observable o, Object o1) {
          this.fireTableDataChanged();
    }
}
