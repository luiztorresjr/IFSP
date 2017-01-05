package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.MainController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {
	private String info;
	private JFrame frame;
	private JTextField tfBusca;
	private MainController jController;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
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
		jController = new MainController();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
				
		JLabel lbtituloResultado = new JLabel("Resultado.:");
		lbtituloResultado.setBounds(255, 104, 64, 14);
		frame.getContentPane().add(lbtituloResultado);
		
		JLabel lbResultado = new JLabel("");
		lbResultado.setBounds(188, 127, 221, 20);
		lbResultado.setForeground(Color.RED);
		lbResultado.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lbResultado);
		
		tfBusca = new JTextField();
		tfBusca.setBounds(139, 286, 86, 20);
		frame.getContentPane().add(tfBusca);
		tfBusca.setColumns(10);
		
		JLabel lblEntreComValor = new JLabel("Entre com  valor que deseja encontrar");
		lblEntreComValor.setBounds(26, 268, 199, 14);
		frame.getContentPane().add(lblEntreComValor);
		
		JLabel lblEntreComA = new JLabel("Entre com a localiza\u00E7\u00E3o do arquivo.:");
		lblEntreComA.setBounds(26, 30, 185, 14);
		frame.getContentPane().add(lblEntreComA);
		
	
		
		JButton btInOrdem = new JButton("In Ordem");
		btInOrdem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info = ""+jController.inOrdemManager();
				lbResultado.setText(info);
			}
		});
		btInOrdem.setBounds(26, 100, 99, 23);
		frame.getContentPane().add(btInOrdem);
		
		JButton btPosOrdem = new JButton("Pos Ordem");
		btPosOrdem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info = ""+jController.posOrdemManager();
				lbResultado.setText(info);
			}
		});
		btPosOrdem.setBounds(26, 146, 99, 23);
		frame.getContentPane().add(btPosOrdem);
		
		JButton btPreOrdem = new JButton("Pre Ordem");
		btPreOrdem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info = ""+jController.preOrdemManager();
				lbResultado.setText(info);
			}
		});
		btPreOrdem.setBounds(26, 190, 99, 23);
		frame.getContentPane().add(btPreOrdem);
		
		
		JButton btArvoreVazia = new JButton("Arvore");
		btArvoreVazia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btArvoreVazia.setBounds(26, 234, 99, 23);
		frame.getContentPane().add(btArvoreVazia);
		
		JButton btBusca = new JButton("Busca");
		btBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btBusca.setBounds(26, 285, 99, 23);
		frame.getContentPane().add(btBusca);
		
		JButton btArquivo = new JButton("Abrir Arquivo");
		btArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					jController.obterArvore();	
			}
		});
		btArquivo.setBounds(26, 55, 99, 23);
		frame.getContentPane().add(btArquivo);
		
		JLabel lblArvoreEmOrde = new JLabel("Arvore em orde de inser\u00E7\u00E3o.:");
		lblArvoreEmOrde.setBounds(139, 55, 164, 14);
		frame.getContentPane().add(lblArvoreEmOrde);
		
		JLabel label = new JLabel("");
		label.setBounds(139, 80, 190, 14);
		frame.getContentPane().add(label);
		
		
		}
	}

