package controller;

public class JavaScript extends Planeta {

	public JavaScript(int posicaox, int posicaoy, String nome, PlanoC plano) {
		super(posicaox, posicaoy, nome, plano);
		
		this.nome = "JavaScript";
		this.limitedireita = 9;
		this.limiteesquerda = 5;
		this.limitecima = 9;
		this.limitebaixo = 5;
		this.movimento = 3;
		this.quantAnos = 16;
		this.hrDias = 10;
		this.contarDias = 10;
		this.bugsColididos = 0;
		this.devsColididos = 0;
		this.anos = 0;
	
	}

}