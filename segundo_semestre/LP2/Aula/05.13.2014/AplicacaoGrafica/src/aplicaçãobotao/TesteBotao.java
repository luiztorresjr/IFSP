/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaçãobotao;

/**
 *
 * @author a132067x
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author a1320769
 */
public class TesteBotao extends JFrame {
    private final int largura = 200;
    private final int altura = 200;
    private JLabel titulo,rotuloNome;
    private JTextField campoNome;
    private JButton botao;
    private BotaoHandler manipuladorBotao;
   public TesteBotao(){
   super("Exemplo de uso do botao");
   setPreferredSize(new Dimension(largura,altura));
   Container c = getContentPane();
   c.setLayout(new BorderLayout());
   titulo = new JLabel ("Dados Cadastrais");
   rotuloNome = new JLabel("Nome:");
   campoNome = new JTextField(20);
   botao = new JButton("Enviar");
   manipuladorBotao = new BotaoHandler();
   botao.addActionListener(manipuladorBotao);
   c.add(titulo,BorderLayout.NORTH);
   c.add(rotuloNome,BorderLayout.WEST);
   c.add(campoNome,BorderLayout.CENTER);
   c.add(botao,BorderLayout.SOUTH);
   }
            public static void main(String[] args) {
                TesteBotao tb = new TesteBotao();
                tb.setVisible(true);
            }
           private class BotaoHandler implements ActionListener{
               @Override
               public void actionPerformed(ActionEvent e){
                   System.out.println("Evento:"+e.getActionCommand());
                   System.out.println("Nome de usuario:"+campoNome.getText());
               }
        //private Container getContetPane() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}