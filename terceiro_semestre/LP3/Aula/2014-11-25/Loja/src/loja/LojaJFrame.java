/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loja;

//import javax.swing.JFrame;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import loja.Prateleira;
import loja.ProdutoDAO;

/**
 *
 * @author a132067x
 */
public class LojaJFrame extends javax.swing.JFrame {
    Prateleira prateleira;
    /**
     * Creates new form LojaJFrame
     * @param prateleira
     */
    public LojaJFrame(Prateleira prateleira) {
        prateleira = new Prateleira();
        initComponents();
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        mnProduto = new javax.swing.JMenu();
        mnCadastrar = new javax.swing.JMenuItem();
        mnVisualizar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnProduto.setText("Produto");
        mnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProdutoActionPerformed(evt);
            }
        });

        mnCadastrar.setText("Cadastrar Novo");
        mnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarActionPerformed(evt);
            }
        });
        mnProduto.add(mnCadastrar);

        mnVisualizar.setText("Visualizar Produtos");
        mnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVisualizarActionPerformed(evt);
            }
        });
        mnProduto.add(mnVisualizar);

        barraMenu.add(mnProduto);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnProdutoActionPerformed

    private void mnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarActionPerformed
        // TODO add your handling code here:
        //JFrame telaCadastroProduto = new CadastroProdutoJFrame(prateleira);
        //telaCadastroProduto.setVisible(true);
         JFrame telacliente = new JFrame();
         telacliente.setSize(500,500);
         JPanel visualizarClienteTabela = new VisualizarProdutoJPanel1(prateleira);
         telacliente.setContentPane(visualizarClienteTabela);
         telacliente.setVisible(true);
        JPanel telaCadastroProduto = new CadastroProdutoJPanel(prateleira);
        JScrollPane jsc = new JScrollPane(telaCadastroProduto, 
                                            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                                            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        telaCadastroProduto.setVisible(true);
        this.setContentPane(jsc);
        this.revalidate();
        this.repaint();
        
    }//GEN-LAST:event_mnCadastrarActionPerformed

    private void mnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVisualizarActionPerformed
        // TODO add your handling code here:
        JPanel telaVisualizarProdutos = new VisualizarProdutoJPanel(prateleira);
        this.setContentPane(telaVisualizarProdutos);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_mnVisualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LojaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LojaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LojaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LojaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                try {
                    //Carrega os dados do banco de dados
                    ProdutoDAO produtoDAO = new ProdutoDAO();
                    List produtos = produtoDAO.list();
                    
                    //colocar os produtos na prateleira
                    Prateleira prateleira = new Prateleira();
                    prateleira.setPrateleira(produtos);
                    
                    new LojaJFrame(prateleira).setVisible(true);
                    //new  LojaJFramecliente(prateleira).setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Não é possivel localizar a ap");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem mnCadastrar;
    private javax.swing.JMenu mnProduto;
    private javax.swing.JMenuItem mnVisualizar;
    // End of variables declaration//GEN-END:variables
}
