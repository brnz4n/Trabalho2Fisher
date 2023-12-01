package controller;


public class CSharp extends Planeta {
	public CSharp(int posicaox, int posicaoy, String nome, PlanoC plano) {
		super(posicaox, posicaoy, nome, plano);
		
		this.nome= "C#";
		this.limitedireita = 12;
		this.limiteesquerda = 2;
		this.limitecima = 12;
		this.limitebaixo = 2;
		this.movimento = 1;
		this.quantAnos = 40;
		this.hrDias = 4;
		this.contarDias = 4;
		this.bugsColididos = 0;
		this.devsColididos = 0;
		this.anos = 0;
	}

}