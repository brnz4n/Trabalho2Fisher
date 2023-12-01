package controller;

public class PHP extends Planeta {
	
	public PHP(int posicaox, int posicaoy, String nome, controller.PlanoC plano) {
		super(posicaox, posicaoy, nome, plano);
		this.nome= "PHP";
		this.limitedireita = 11;
		this.limiteesquerda = 3;
		this.limitecima = 11;
		this.limitebaixo = 3;
		this.movimento = 2;
		this.quantAnos = 32;
		this.hrDias = 60;
		this.contarDias = 60;
		this.bugsColididos = 0;
		this.devsColididos = 0;
		this.anos = 0;
	}

}