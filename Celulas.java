package view;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Celulas extends JPanel {
	
	protected ImageIcon image;
	protected int posicaox;
	protected int posicaoy;
	protected int id;
	
	public Celulas(int posicaox, int posicaoy, int id) {
		
		this.posicaoy = posicaoy;
		this.posicaox = posicaox;
		this.id = id;
		this.image = null;
	}
	
	public ImageIcon getImage() {
		return image;
	}

	public int getPosicaox() {
		return posicaox;
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public int getPosicaoy() {
		return posicaoy;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
