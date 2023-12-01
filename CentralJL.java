package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import model.JavalarDAO;
import model.LerDados;

public class CentralJL {

    private ArrayList<Planeta> Planetas = new ArrayList<>();
    private ArrayList<String> dados = new ArrayList<>();
    private ArrayList<String> addLinhas = new ArrayList<>();
    private int indice = 0;
    private PlanoC plano = new PlanoC(15, 15);
    private LerDados lerDados;

    public CentralJL() {
        Planetas();
        lerDados = new LerDados();
    }

    private void Planetas() {
        Planetas.add(new Phyton(6, 7, "phyton", plano));
        Planetas.add(new JavaScript(5, 7, "JavaScript", plano));
        Planetas.add(new Ruby(4, 7, "Ruby", plano));
        Planetas.add(new PHP(3, 7, "Php", plano));
        Planetas.add(new CSharp(2, 7, "C#", plano));
        Planetas.add(new CplusPlus(1, 7, "C++", plano));
        Planetas.add(new C(0, 7, "C", plano));
    }

    public void QBugs(int bugs) {
        try {
            for (int i = 0; i < 1; i++) {
                int quantBug = bugs;
                int quantMaxBugs = 0;

                if (quantMaxBugs < 112 && quantBug < 112) {
                    if (quantBug > -1) {
                        plano.sorteioBug(quantBug);
                    } else {

                    }
                } 
                quantMaxBugs = contarElementos(plano.Celulas, celula -> !celula.bug);
    
            }
        } catch (java.util.InputMismatchException e) {
            System.err.println("\nentrada invalida!!");
            QBugs(bugs);
        }
    }

    public void QDevs(int devs) {
        try {
            for (int i = 0; i < 1; i++) {
                int quantDev = devs;
                int quantMaxDevs = 0;

                if (quantMaxDevs < 112 && quantDev < 112) {
                    if (quantDev > -1) {
                        plano.sorteioDev(quantDev);
                    } else {                     
                    }
                } 

                quantMaxDevs = contarElementos(plano.Celulas, celula -> !celula.dev);
              
            }
        } catch (java.util.InputMismatchException e) {
            System.err.println("\nErro, tente novamente!!");
            QDevs(devs);
        }
    }

    private int contarElementos(ArrayList<Celula> lista, Predicate<Celula> condition) {
        return (int) lista.stream().filter(condition).count();
    }

    public void posicao(ArrayList<Planeta> planetas) {
        System.out.println("\nLocalização ao vivo dos planetas:");

        for (Planeta planeta : planetas) {
            if (planeta.getPosicaox() > 7) {
                System.out.println("Planeta -> " + planeta.nome + " se encontra ao NORTE");
            } else {
                System.out.println("Planeta -> " + planeta.nome + " se encontra ao SUL");
            }
        }
    }

    public void ArquivoLido(File file) throws IOException {
        String filePath = file.getAbsolutePath();
        try {
            List<String> linhasLidas = lerDados.leituraDeDados(filePath);
            addLinhas.addAll(linhasLidas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rodada(String linha) {
        ArrayList<Integer> numerosDaRodada = new ArrayList<>();

        for (String numeros : lerDados.Separar(linha)) {
            int n = Integer.parseInt(numeros);
            numerosDaRodada.add(n);
        }

        System.out.println("Este é o progama javalar, aproveite :)\n");
 
        QBugs(numerosDaRodada.get(9));
        QDevs(numerosDaRodada.get(8));

        System.out.println("\nRelatório de rotação dos planetas:");

        for (int i = 1; i <= 7; i++) {
            Planetas.get(i - 1).calcTempo(numerosDaRodada.get(i));
        }

        System.out.println("\nRelatorio de colisão dos planetas:");
        for (Planeta planeta : Planetas) {
            plano.CosilaoBug(plano, planeta);
        }
        for (Planeta planeta : Planetas) {
            plano.ColisaoDev(plano, planeta);
        }

        posicao(Planetas);
    }

    public void passarEntreLinhas() {
        if (indice < addLinhas.size()) {
            String linhaAtual = addLinhas.get(indice++);
            rodada(linhaAtual);
        } else {
            System.out.println("Fim do arquivo lido, escolha um novo arquivo!");
        }
    }

    public void relatorio() {

        dados.add("Breno Magalhaes");
        dados.add("542638");
        dados.add("AE_10.csv");

        for (int i = 0; i < 7; i++) {
            dados.add("" + Planetas.get(i).bugsColididos);
        }

        for (int i = 0; i < 7; i++) {
            dados.add("" + Planetas.get(i).devsColididos);
        }

        for (int i = 0; i < 7; i++) {
            dados.add("" + Planetas.get(i).movimentos);
        }

        for (int i = 0; i < 7; i++) {
            dados.add("" + Planetas.get(i).horas);
        }

        for (int i = 0; i < 7; i++) {
            dados.add("" + Planetas.get(i).anos);
        }
        
        int bugQ1 = 0;
		int devQ1 = 0;
		int bugQ2 = 0;
		int devQ2 = 0;
		int bugQ3 = 0;
		int devQ3 = 0;
		int bugQ4 = 0;
		int devQ4 = 0;

        String relatorio = "Breno Magalhaes," + "542638," + "AE_10.csv," + Planetas.get(0).bugsColididos + "," + Planetas.get(1).bugsColididos + "," + Planetas.get(2).bugsColididos
				+ "," + Planetas.get(3).bugsColididos + "," + Planetas.get(4).bugsColididos + "," + Planetas.get(5).bugsColididos + "," + Planetas.get(6).bugsColididos + "," + Planetas.get(0).devsColididos
				+ "," + Planetas.get(1).devsColididos + "," + Planetas.get(2).devsColididos + "," + Planetas.get(3).devsColididos + "," + Planetas.get(4).devsColididos + "," + Planetas.get(5).devsColididos
				+ "," + Planetas.get(6).devsColididos + "," + Planetas.get(0).movimentos + "," + Planetas.get(1).movimentos + "," + Planetas.get(2).movimentos + "," + Planetas.get(3).movimentos
				+ "," + Planetas.get(4).movimentos + "," + Planetas.get(5).movimentos + "," + Planetas.get(6).movimentos + "," + Planetas.get(0).horas + "," + Planetas.get(1).horas
				+ "," + Planetas.get(2).horas + "," + Planetas.get(3).horas + "," + Planetas.get(4).horas + "," + Planetas.get(5).horas + "," + Planetas.get(6).horas 
				+ "," + Planetas.get(0).anos + "," + Planetas.get(1).anos + "," + Planetas.get(2).anos + "," + Planetas.get(3).anos + "," + Planetas.get(4).anos
				+ "," + Planetas.get(5).anos + "," + Planetas.get(6).anos + "," + bugQ1 + "," + bugQ2 + "," + bugQ3 + "," + bugQ4 + "," + devQ1 + "," + devQ2 + "," + devQ3 + "," + devQ4;

        	
        		
		        dados.add(""+ bugQ1);
		        dados.add(""+ bugQ2);
		        dados.add(""+ bugQ3);
		        dados.add(""+ bugQ4);
		        dados.add(""+ devQ1);
		        dados.add(""+ devQ2);
		        dados.add(""+ devQ3);
		        dados.add(""+ devQ4);
		        
        ArrayList<String> relatorioLista = new ArrayList<>();
        relatorioLista.add(relatorio);

        JavalarDAO dao = new JavalarDAO();
        dao.JavalarDAO(relatorioLista);

        dados.clear();
        System.out.println("Gravando relatório...\nRelatorio gravado com sucesso!");
    }

    public ArrayList<Planeta> getListaDePlaneta() {
        return Planetas;
    }

    public PlanoC getplano() {
        return plano;
    }
}
