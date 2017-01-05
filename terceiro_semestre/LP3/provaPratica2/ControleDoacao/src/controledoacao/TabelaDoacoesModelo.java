/*
 * Copyright (C) 2014 
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. Andre See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package controledoacao;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andre
 */
public class TabelaDoacoesModelo extends AbstractTableModel implements Observer{

    private Doacoes doacoes;
    String[] colunas = {"Nome do doador", "Telefone", "Valor"};

    public TabelaDoacoesModelo(Doacoes doacoes) {
        this.doacoes = doacoes;
        doacoes.addObserver(this);
    }

    @Override
    public int getRowCount() {
        return doacoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Doacao doacao = (Doacao) doacoes.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return doacao.getNomeDoador();
            case 1:
                return doacao.getTelefone();
            case 2:
                return doacao.getValor();
            default:
                return "Campo inválido.";
        }
    }
    
    public boolean isCellEditable(int row, int col){
        if(col==0) return false;
        else return true;
    }
    
    public void setValueAt(Object valor, int row, int col){
        Doacao doacao = (Doacao) doacoes.get(row);
        switch(col){
            case 0:
                doacao.setNomeDoador(valor.toString());
                break;
            case 1:
                doacao.setTelefone(valor.toString());
                break;
            case 2:
                double novoValor = Double.parseDouble(valor.toString());
                doacao.setValor(novoValor);
                break;               
        }
    }

    @Override
    public void update(Observable o, Object o1) {
        fireTableDataChanged();
    }

}
