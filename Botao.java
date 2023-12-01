package view;

import java.awt.Font;
import javax.swing.JButton;

public class Botao extends JButton{
	
	public Botao(String texto) {
		setText(texto);
		setFont(new Font("arial", Font.BOLD, 50));
	}
	
}