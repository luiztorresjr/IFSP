import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;

public class TratadorPanelCad implements ActionListener {
	private PanelCad setar;
	private JButton clean, save, rec, exit;
	private CadAluno cadastro;
	private Aluno aluno;
	private String fileName;

	public TratadorPanelCad(JButton bLimpar, JButton bAddCad, JButton bGravar, 
							JButton bSair, PanelCad setar1) {

		clean = bLimpar;
		save = bAddCad;
		rec = bGravar;
		exit = bSair;
		setar = setar1;
	}
	
	public void limparTela(){
		setar.setNome("");
		setar.setCpf("");
		setar.setTel("");
		setar.setEnd("");
		setar.setBairro("");
		setar.setCid("");
		setar.setUf("");
		setar.setCep("");
		setar.setTfield("Tela Limpa");
	}

	public void adicionarAluno(){
		cadastro = new CadAluno();
		aluno = new Aluno();
		
		aluno.setNome(setar.getNome());
		aluno.setCpf(setar.getCpf());
		aluno.setTel(setar.getTel());
		aluno.setEnd(setar.getEnd());
		aluno.setBairro(setar.getBairro());
		aluno.setCid(setar.getCid());
		aluno.setUf(setar.getUf());
		aluno.setCep(setar.getCep());

		try {
			cadastro.adicionar(aluno);
		} catch (IOException e) {
			e.printStackTrace();
		}
		setar.setTfield("Aluno Adicionado!");
	}
	
	public void gravarArquivo(){
		try {
			setar.fSalvar.show();
			if (setar.fSalvar.getFile() == null)
				return;
			fileName = setar.fSalvar.getDirectory() + setar.fSalvar.getFile();
			FileWriter writer = new FileWriter(fileName);
			for(Aluno aluno : cadastro.getCadAlunos())  
				writer.write("Nome: " + aluno.getNome() + "\nCPF: " + aluno.getCpf() +
						  "\nTelefone: " +aluno.getTel()+ "\nEndereço: " + aluno.getEnd() +
						  "\nBairro: " + aluno.getBairro()+ "\nCidade: " + aluno.getCid() +
						  "\nUF: " + aluno.getUf() + "\nCEP: " + aluno.getCep());  
			
			writer.close();
			setar.setTfield("Arquivo Salvo!");
		} catch (IOException exc) {
			setar.setTfield("Erro ao gravar!");
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if (clean == e.getSource()) { // Limpa os todos os campos da tela de cadastro
			limparTela();
		}
		if (save == e.getSource()) { // Salva o cadastro em ArrayList
			adicionarAluno();
		}
		if (rec == e.getSource()) { //Grava os dados do ArrayList em arquivo de texto
			gravarArquivo();
		}
		if (exit == e.getSource()) { // Sai do sistema
			System.exit(0); 
		}
	}
}