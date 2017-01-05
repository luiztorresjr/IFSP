package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import controller.MainController;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow {

	private JFrame frmGerenciadorDeSenhas;
	private MainController jController;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmGerenciadorDeSenhas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
		// criar referencia de um controller para janela principal
		jController = new MainController();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGerenciadorDeSenhas = new JFrame();
		frmGerenciadorDeSenhas.setTitle("Gerenciador de Senhas");
		frmGerenciadorDeSenhas.setBounds(100, 100, 632, 176);
		frmGerenciadorDeSenhas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGerenciadorDeSenhas.getContentPane().setLayout(null);
		
		JLabel lblRetiradaDeSenha = new JLabel("RETIRADA DE SENHA");
		lblRetiradaDeSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblRetiradaDeSenha.setBounds(67, 28, 149, 16);
		frmGerenciadorDeSenhas.getContentPane().add(lblRetiradaDeSenha);
		
		JButton btnServicoNormal = new JButton("Servi\u00E7o Normal");

		btnServicoNormal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//cria a variavel senha e ela recebe a string NORMAL e o
				//numero de clique do mouse no botão
				String senha = "NORMAL "+e.getClickCount();
				//envia o valor senha para o metodo no controller
				jController.retirarSenhaNormal(senha);
			}
		});
		btnServicoNormal.setBounds(67, 56, 149, 29);
		frmGerenciadorDeSenhas.getContentPane().add(btnServicoNormal);
		
		JButton btnServicoPreferencial = new JButton("Servi\u00E7o Preferencial");
		btnServicoPreferencial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//cria a variavel senha e ela recebe a string PRIOR e o
				//numero de clique do mouse no botão
				String senha = "PRIOR "+e.getClickCount();
				//envia o valor senha para o metodo no controller
				jController.retirarSenhaPreferencial(senha);
			}
		});
		btnServicoPreferencial.setBounds(67, 97, 149, 29);
		frmGerenciadorDeSenhas.getContentPane().add(btnServicoPreferencial);
		
		JLabel lblChamarSenha = new JLabel("CHAMAR SENHA");
		lblChamarSenha.setBounds(292, 28, 103, 16);
		frmGerenciadorDeSenhas.getContentPane().add(lblChamarSenha);
		
		JButton btnChamarFila = new JButton("Chamar Fila");
	
		btnChamarFila.setBounds(281, 56, 117, 29);
		frmGerenciadorDeSenhas.getContentPane().add(btnChamarFila);
		
		
		JLabel lblSenhaAtual = new JLabel("SENHA ATUAL");
		lblSenhaAtual.setBounds(480, 28, 89, 16);
		frmGerenciadorDeSenhas.getContentPane().add(lblSenhaAtual);
		
		JLabel lbVisor = new JLabel("NORMAL13");
		lbVisor.setForeground(Color.RED);
		lbVisor.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lbVisor.setHorizontalAlignment(SwingConstants.CENTER);
		lbVisor.setBounds(467, 56, 117, 65);
		frmGerenciadorDeSenhas.getContentPane().add(lbVisor);
		
		btnChamarFila.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//cria a variavel mensagem que recebe  o metodo atualizar do controller
				//
				String mensagem = jController.atualizarSenhaAtual();
				//apresenta o valor da atualização no label da tela 
				lbVisor.setText(mensagem);
				//invoca o metodo chamaSenha do controller para remover a primeira senha
				//eh importante a ordem em que foi invocados os metodos
				//atualizarSenha e depois chamarSenha
				jController.chamarSenha();
			
			}
		});		
		
	}
	
}
