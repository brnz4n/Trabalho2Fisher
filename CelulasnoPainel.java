package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CelulasnoPainel extends JPanel{
	protected int posicaox;
	protected int posicaoy;
	protected int id;
	
	public CelulasnoPainel(int posicaox, int posicaoy, int id) {
		this.posicaoy = posicaoy;
		this.posicaox = posicaox;
		padraoCelula();
	}
	
	public void padraoCelula() {
		setLayout(new BorderLayout());
		JPanel panel = new JPanel(new BorderLayout());
		setLayout(new BorderLayout());
		add(panel);
		}
}