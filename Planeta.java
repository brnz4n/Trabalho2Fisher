package controller;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public abstract class Planeta implements Movimento {
	
	private int posicaox;
	private int posicaoy;
	protected PlanoC PlanoC;
	protected ArrayList<Integer> id;
	protected ImageIcon imagem;
	public String nome;
	public int movimento;
	protected int limitedireita;
	protected int limiteesquerda;
	protected int limitecima;
	protected int limitebaixo;
	protected int quantAnos;
	protected double hrDias;
	protected double contarDias;
	protected int bugsColididos = 0;
	protected int devsColididos = 0;
	protected double anos;
	protected double dias;
	protected double horas;
	protected double movimentos;
	
	public Planeta(int posicaox, int posicaoy, String nome, PlanoC plano) {
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		this.nome = nome;
		this.PlanoC = plano;
	}
	
	public int getPosicaox() {
		return posicaox;
	}
	
	public int getPosicaoy() {
		return posicaoy;
	}
	public String getNome() {
        return nome;
    }

	public void calcTempo(int tempo) {
        System.out.println("\nPlaneta " + nome + ": ");

        int posicoesAndadas = 0;

        horas = tempo * hrDias;
        dias = horas / contarDias;

        int andar = movimento * tempo;

        if (movimento > 0) {
            andar = movimento * tempo;

            for (int i = 0; i < andar; i++) {
                if (posicaox < limitedireita && posicaoy == limitebaixo) {
                    posicaox++;
                } else if (posicaox > limiteesquerda && posicaoy == limitecima) {
                    posicaox--;
                } else if (posicaox == limitedireita && posicaoy < limitecima) {
                    posicaoy++;
                } else if (posicaox == limiteesquerda && posicaoy > limitebaixo) {
                    posicaoy--;
                }

                posicoesAndadas++;

                if (posicoesAndadas == quantAnos) {
                    anos++;
                    posicoesAndadas = 0;
                }
            }

            movimentos = (andar / tempo);

            System.out.println("Após " + tempo + " unidades de tempo, o planeta " + nome + " se encontra na Posição (y, x): (" + posicaoy + "," + posicaox + ")");
            System.out.println("Anos andados: " + anos);
            System.out.println("Horas: " + horas);
            System.out.println("Dias: " + dias);
            System.out.println("Velocidade de movimento do " + nome + " está em: " + movimentos);

        } else {
            System.out.println("O planeta " + nome + "Explodiu " + " Posicao da explosão: (" + posicaoy + ", " + posicaox + ")");
        }
    }
}