package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import view.Painel;

import java.util.ArrayList;
import java.util.Random;

public class PlanoC {

    public ArrayList<Celula> Celulas;
    private int tamanhox;
    private int tamanhoy;
    private int qmaxBug = 0;
    private int qmaxDev = 0;
    public int qbug;
    public int qdev;
    public Celula celula;
    
    public PlanoC(int tamanhox, int tamanhoy) {
        
    	Celulas = new ArrayList<Celula>();
        this.tamanhox = tamanhox;
        this.tamanhoy = tamanhoy;

        int id = 0;

        for (int i = 0; i < tamanhox; i++) {
            for (int j = 0; j < tamanhoy; j++) {
                Celula celula = new Celula(j, i, id);
                Celulas.add(celula);
                id++;
            }
        }
    }

    public void sorteioBug(int qbug) {
        this.qbug = 0;

        System.out.println("Os " + qbug + " bugs estão nas posições: ");

        for (int i = 0; i < qbug; i++) {
            if (qmaxBug < 112) {
                Random random = new Random();
                int aleatorio;
                int checar;

                do {
                    aleatorio = random.nextInt(225);
                    checar = 0;

                    if (!Celulas.get(aleatorio).bug && !Celulas.get(aleatorio).dev && aleatorio != 112) {
                        Celulas.get(aleatorio).bug = true;
                        qmaxBug++;
                        System.out.println(qmaxBug + "");
                        checar = 1;
                    }
                } while (checar == 0);

                if (aleatorio == 112) {
                    i--;
                    continue;
                }

                System.out.println("posição em y e x: (" + Celulas.get(aleatorio).posicaoy + ", " + Celulas.get(aleatorio).posicaox + ")\n");

            } else {
                System.out.println("\nOs bugs acabaram");
            }
        }
    }

    public void sorteioDev(int qdev) {
        this.qdev = 0;

        System.out.println("Os " + qdev + " desenvolvedores estão nas posições: ");

        for (int i = 0; i < qdev; i++) {
            if (qmaxDev < 112) {
                Random random = new Random();
                int aleatorio;
                int checar;

                do {
                    checar = 0;
                    aleatorio = random.nextInt(225);
                    if (!Celulas.get(aleatorio).dev && !Celulas.get(aleatorio).bug && aleatorio != 112) {
                        Celulas.get(aleatorio).dev = true;
                        qmaxDev++;
                        System.out.println(qmaxDev + "");
                        checar = 1;
                    }
                } while (checar == 0);

                if (aleatorio == 112) {
                    i--;
                    continue;
                }

                System.out.println("posição em y e x: (" + Celulas.get(aleatorio).posicaoy + ", " + Celulas.get(aleatorio).posicaox + ")\n");
            } else {
                System.out.println("\nacabou os bugs");
            }
        }
    }

    public void CosilaoBug(PlanoC plano, Planeta planeta) {
        if (planeta.movimento > 0) {
            for (Celula celula : plano.Celulas) {

                if (celula.posicaox == planeta.getPosicaox() && celula.posicaoy == planeta.getPosicaoy() && celula.bug && !celula.dev) {

                    planeta.movimento--;
                    planeta.bugsColididos++;
                    qmaxBug--;

                    celula.bug = false;

                    System.out.println("O planeta " + planeta.nome + " após colidir com um bug diminuiram pra: " + planeta.movimento + " -  Y = " + planeta.getPosicaoy() + ", X = " + planeta.getPosicaox() + ", ID: " + celula.id);
                }
            }
        }
    }

    public void ColisaoDev(PlanoC plano, Planeta planeta) {
        if (planeta.movimento > 0) {
            for (Celula celula : plano.Celulas) {
                if (celula.posicaox == planeta.getPosicaox() && celula.posicaoy == planeta.getPosicaoy() && celula.dev && !celula.bug) {

                    planeta.movimento++;
                    planeta.devsColididos++;
                    qmaxBug--;

                    celula.dev = false;

                    System.out.println("-Movimentos de " + planeta.nome + " após colidir com um desenvolvedor aumentaram pra: " + planeta.movimento + " -  Y = " + planeta.getPosicaoy() + ", X = " + planeta.getPosicaox() + ", ID: " + celula.id);
                }
            }
        }
    }
}
