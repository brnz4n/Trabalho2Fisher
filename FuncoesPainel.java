package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import controller.CentralJL;
import controller.ChamarDados;
import controller.MainB;
import controller.Planeta;
import model.EscreverDados;
import model.JavalarDAO;

public class FuncoesPainel extends JFrame implements ActionListener{

	private ChamarDados GravarRelatorio = new ChamarDados();
	private Painel painel;
	private CentralBotoes botoes;
	private CentralJL CentralJL;
	private EscreverDados eDados;
	private JavalarDAO lDados;
	private File arqSelecionado;
	
	public FuncoesPainel() {
		
		arrumarJanela();
		setSize(820,600);
		setTitle("Javalar do pai");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); 
		setVisible(true);		
	}
	
	public void arrumarJanela() {
		
		CentralJL = new CentralJL();
		eDados = new EscreverDados();
		setLayout(new BorderLayout());
		painel = new Painel(CentralJL);
		painel.setPreferredSize(new Dimension(600,600));
		painel.addAncestorListener(null);
		add(painel, BorderLayout.WEST);	
		
		botoes = new CentralBotoes();
		botoes.setPreferredSize(new Dimension(200,0));
		botoes.addAncestorListener(null);
		add(botoes, BorderLayout.EAST);
		
		botoes.button1.addActionListener(new paineis(botoes.button1));
		botoes.button2.addActionListener(new paineis(botoes.button2));
		botoes.button3.addActionListener(new paineis(botoes.button3));
		botoes.button4.addActionListener(new paineis(botoes.button4));
		botoes.button5.addActionListener(new paineis(botoes.button5));
	}

	private class paineis implements ActionListener{
		Botao botao;
		public paineis(Botao botoes) {
			this.botao=botoes;
		}
	
		public void actionPerformed(ActionEvent e) {
		    String buttonText = botao.getText();

		    switch (buttonText) {
		        case "Processar proximo instante" -> {
		            CentralJL.passarEntreLinhas();
		            painel.revalidate();
		        }
		        case "Ler novo arquivo de entrada" -> {
		            SelecionarArquivo();
		            botoes.button3.setEnabled(true);
		        }
		        case "Gravar relatorio" -> CentralJL.relatorio();

		        case "Ler dados de outros participantes" -> {
		            GravarRelatorio.obterInformaçoesRelatorio();
		            botoes.button5.setEnabled(true);
		        }
		        case "Gravar arquivo de saida" -> GravarRelatorio.salvarInformacoes();
		        
		        default -> {
		           
		        }
		    }
		}
	
	public void SelecionarArquivo() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + "\\OneDrive\\Área de Trabalho\\arquivosT2"));
		
		int returnvalor = fileChooser.showOpenDialog(fileChooser);
		
		if(returnvalor == JFileChooser.APPROVE_OPTION){
			File selectedFile = fileChooser.getSelectedFile();
			String arqselecionado = selectedFile+"";
			
			try {
				CentralJL.ArquivoLido(selectedFile);
			} catch (IOException e) {
				e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}