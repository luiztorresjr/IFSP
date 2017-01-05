/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JPanel;

/**
 *
 * @author Luiz
 */
public class LojaClienteJFrame extends javax.swing.JFrame {
    Prateleira prateleira;
    /**
     * Creates new form LojaClienteJFrame
     * @param prateleira
     */
    
    //classe criada para iniciar a tabela junto com a tela inicial
    public LojaClienteJFrame(Prateleira prateleira) {      
        this.prateleira=prateleira;
        initComponents();
        //instacia uma Jpanel para usar
        JPanel telaVisualizarProdutos;
        //a JPanel instaciada recebe um nova tela de Visualizar o produto quando inicializar
        telaVisualizarProdutos = new VisualizaProdutoCliente(prateleira);
        //informa que a Jframe recebe a tela
        this.setContentPane(telaVisualizarProdutos);
        //manda revalidar a Jframe
        this.revalidate();
        //redesenha a tela
        //fique atento a orde destes comandos pois podem alterar o resultado esperado
        //portanto coloque nessa mesma ordem
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}