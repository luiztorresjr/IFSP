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
import javax.swing.JOptionPane;

/**
 *
 * @author Andre
 */
public class CadastroDoacao extends javax.swing.JFrame {

    Doacoes doacoes;

    /**
     * Creates new form CadastroDoacao
     */
    public CadastroDoacao(Doacoes doacoes) {
        initComponents();
        this.setTitle("Cadastro de Doação");
        this.doacoes = doacoes;
    }

    private void limparFormularios() {
        this.tfNomeDoador.setText("");
        this.tfTelefone.setText("");
        this.tfValor.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCadastroDoacao = new javax.swing.JLabel();
        lbNomeDoador = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        btDoar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tfNomeDoador = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCadastroDoacao.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbCadastroDoacao.setText("Cadastro de Doação");

        lbNomeDoador.setText("Nome do doador:");

        lbValor.setText("Valor: R$");

        btDoar.setText("Doar!");
        btDoar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        lbTelefone.setText("Telefone:");

        tfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btDoar)
                .addGap(45, 45, 45)
                .addComponent(btLimpar)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbValor)
                                .addGap(18, 18, 18)
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNomeDoador)
                                .addGap(18, 18, 18)
                                .addComponent(tfNomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lbCadastroDoacao))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTelefone)
                        .addGap(18, 18, 18)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadastroDoacao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeDoador)
                    .addComponent(tfNomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValor)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDoar)
                    .addComponent(btLimpar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        int resultado = JOptionPane.showConfirmDialog(rootPane,
                "Você realmente deseja apagar os campos do formulário?",
                "Apagar formulário?",
                JOptionPane.YES_NO_OPTION);

        if (resultado == JOptionPane.YES_OPTION) {
            this.limparFormularios();
        }
    }//GEN-LAST:event_btLimparActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void tfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneActionPerformed

    private void btDoarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoarActionPerformed
        
       int resultado = JOptionPane.showConfirmDialog(rootPane,
                "Você deseja doar " + tfValor.getText() + "?",
                "Confirmar doação?",
                JOptionPane.YES_NO_OPTION);

        if (resultado == JOptionPane.YES_OPTION) {
            Doacao novaDoacao = new Doacao();
            String nomeDoador = this.tfNomeDoador.getText();
            String telefone = this.tfTelefone.getText();
            
             try{
                double valor = Double.parseDouble(this.tfValor.getText());
                novaDoacao.setValor(valor);
                novaDoacao.setNomeDoador(nomeDoador);            
                novaDoacao.setTelefone(telefone);
            
                try {
                    DoacaoDAO doacaoDAO = new DoacaoDAO();
                    doacaoDAO.insert(novaDoacao);
                } catch (Exception e) { 
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Não foi possivel inserir o produto no Banco");
                    return;
                }
                
                this.doacoes.add(novaDoacao);
            }catch(NumberFormatException n){                
                JOptionPane.showMessageDialog(null, "Digite um numero valido para o campo valor");
            }      
            
            

            this.limparFormularios();
        }
    }//GEN-LAST:event_btDoarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDoar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel lbCadastroDoacao;
    private javax.swing.JLabel lbNomeDoador;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextField tfNomeDoador;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}