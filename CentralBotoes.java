package view;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class CentralBotoes extends JPanel{
	Botao button1;
	Botao button2;
	Botao button3;
	Botao button4;
	Botao button5;
	
	public CentralBotoes() {
		setLayout(new GridLayout(5,0));
		button1 = novoBotao("Processar proximo instante",12);
		button1.addActionListener(null);
		add(button1);
		button2 = novoBotao("Ler novo arquivo de entrada",12);
		add(button2);
		button3 = novoBotao("Gravar relatorio",12);
		add(button3);
		button4 = novoBotao("Ler dados de outros participantes",12);
		add(button4);
		button5 = novoBotao("Gravar arquivo de saida",12);
		add(button5);
	}
	public Botao novoBotao(String texto, int tamanhofonte) {

		Botao b = new Botao(texto);
		b.setFont(new Font("Arial", Font.PLAIN, tamanhofonte));
		return b;
	}

}