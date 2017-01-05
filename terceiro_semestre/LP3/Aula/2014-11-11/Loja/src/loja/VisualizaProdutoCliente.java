/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import javax.swing.JOptionPane;

/**
 *
 * @author a132067x
 */
public class VisualizaProdutoCliente extends javax.swing.JPanel {
    Prateleira prateleira;
    /**
     * Creates new form VisualizarProdutoJPanel
     */
    public VisualizaProdutoCliente(Prateleira prateleira) {
        this.prateleira=prateleira;
        initComponents();
        //criar o modelo 
        ProdutosTabelaModelo produtos = new ProdutosTabelaModelo(prateleira);
        
        //vincular a tabela ao model
        tbProdutos.setModel(produtos);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTiutloVisualizar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();

        lbTiutloVisualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTiutloVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTiutloVisualizar.setText("Produtos Cadastrados");
        lbTiutloVisualizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbProdutos);

        btAtualizar.setText("Atualizar");
        btAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAtualizarMouseClicked(evt);
            }
        });
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTiutloVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAtualizar)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTiutloVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(btAtualizar)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = this.tbProdutos.getSelectedRow();
        
           this.prateleira.remove(linhaSelecionada);
           this.tbProdutos.revalidate();
           JOptionPane.showMessageDialog(this, "Produto removido com sucesso!");  
           this.btAtualizar.setEnabled(false);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseClicked
        // TODO add your handling code here:
        if(this.tbProdutos.getSelectedRow() >=0){
            this.btAtualizar.setEnabled(true);
        }
        else{
            this.btAtualizar.setEnabled(false);
        }            
    }//GEN-LAST:event_btAtualizarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTiutloVisualizar;
    private javax.swing.JTable tbProdutos;
    // End of variables declaration//GEN-END:variables
}
