package controller;

public class C extends Planeta {

	public C(int posicaox, int posicaoy, String nome, PlanoC plano) {
		super(posicaox, posicaoy, nome, plano);
		
		this.nome = "C";
		this.limitedireita = 14;
		this.limiteesquerda = 0;
		this.limitecima = 14;
		this.limitebaixo = 0;
		this.movimento = 10;
		this.quantAnos = 56;
		this.hrDias = 0.1;
		this.contarDias = 0.1;
		this.bugsColididos = 0;
		this.devsColididos = 0;
		this.anos = 0;
								
	}
}