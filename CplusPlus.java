package controller;

public class CplusPlus extends Planeta {
	public CplusPlus(int posicaox, int posicaoy, String nome, PlanoC plano) {
		
		super(posicaox, posicaoy, nome, plano);
		this.nome= "C++";
		this.limitedireita = 13;
		this.limiteesquerda = 1;
		this.limitecima = 13;
		this.limitebaixo = 1;
		this.movimento = 2;
		this.quantAnos = 48;
		this.hrDias = 0.5;
		this.contarDias = 0.5;
		this.bugsColididos = 0;
		this.devsColididos = 0;
		this.anos = 0;
	}

}