package controller;

public class Ruby extends Planeta {
	public Ruby(int posicaox, int posicaoy, String nome, controller.PlanoC plano) {
		super(posicaox, posicaoy, nome, plano);
		this.nome= "Ruby on Rails";
		this.limitedireita = 10;
		this.limiteesquerda = 4;
		this.limitecima = 10;
		this.limitebaixo = 4;
		this.movimento = 2;
		this.quantAnos = 24;
		this.hrDias = 48;
		this.contarDias = 48;
		this.bugsColididos = 0;
		this.devsColididos = 0;
		this.anos = 0;
	}

}