package controller;

public class Phyton extends Planeta {

	public Phyton(int posicaox, int posicaoy, String nome, PlanoC plano) {
		super(posicaox, posicaoy, nome, plano);
		this.nome= "Phyton";
		this.limitedireita = 8;
		this.limiteesquerda = 6;
		this.limitecima = 8;
		this.limitebaixo = 6;
		this.movimento = 4;
		this.quantAnos = 8;
		this.hrDias = 24;
		this.contarDias = 24;
		this.bugsColididos = 0;
		this.devsColididos = 0;
		this.anos = 0;
	}

}