/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backup;

import loja.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a132067x
 */
public class ProdutosTabelaModelo extends AbstractTableModel implements Observer{
    
    private Prateleira prateleira;
    String[] nomeColunas = {"Codigo","Nome","Preco (R$)", "Descrição"}; 
    
    public ProdutosTabelaModelo(Prateleira prateleira){
        this.prateleira=prateleira;
        prateleira.addObserver(this);
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return prateleira.size();
     }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    
    @Override
    public String getColumnName(int col){
        return nomeColunas[col];       
    }
    
    public boolean isCellEditable(int row, int col){
         if(col==0){
            return false;
        }
        return true;        
    }
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
    public void update(Observable o, Object o1) {
          this.fireTableDataChanged();
    }
}
