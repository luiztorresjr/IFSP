/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author a132067x
 */
public class VisualizarProdutoJPanel extends javax.swing.JPanel {
    Prateleira prateleira;
    /**
     * Creates new form VisualizarProdutoJPanel
     */
    public VisualizarProdutoJPanel(Prateleira prateleira) {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTiutloVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTiutloVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTiutloVisualizar;
    private javax.swing.JTable tbProdutos;
    // End of variables declaration//GEN-END:variables
}
