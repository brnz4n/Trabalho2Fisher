package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import controller.Celula;
import controller.CentralJL;
import controller.PlanoC;

public class Painel extends JPanel {

    public ArrayList<CelulasnoPainel> PlanoCelulas = new ArrayList<>();
    private CelulasnoPainel PainelCelulas;
    private PlanoC plano;
    private CentralJL sistemaJava;
    private Map<String, ImageIcon> imagensPorPlaneta = new HashMap<>();
    
    public Painel(CentralJL sistema) {
        this.sistemaJava = sistema;
        setLayout(new GridLayout(15, 15));
        carregarImagens();
        Grade(sistema);
    }
    
    public void definirImagemNaPosicao(int coluna, int linha, ImageIcon img) {
        if (coluna >= 0 && coluna < 15 && linha >= 0 && linha < 15) {
            int id = linha * 15 + coluna;
            definirImagemParaCelula(id, img);
            definirImagemNaPosicao(7, 2, imagensPorPlaneta.get("C"));
            definirImagemNaPosicao(7, 3, imagensPorPlaneta.get("C++"));
            definirImagemNaPosicao(7, 4, imagensPorPlaneta.get("C#"));
            definirImagemNaPosicao(7, 5, imagensPorPlaneta.get("PHP"));
            definirImagemNaPosicao(7, 6, imagensPorPlaneta.get("RR"));
            definirImagemNaPosicao(7, 7, imagensPorPlaneta.get("JS"));
            definirImagemNaPosicao(7, 8, imagensPorPlaneta.get("Python"));
            definirImagemNaPosicao(7, 9, imagensPorPlaneta.get("Java"));
        }
    }
    public void carregarImagens() {
        imagensPorPlaneta.put("C", new ImageIcon(getClass().getResource("/teste/C.png")));
        imagensPorPlaneta.put("C++", new ImageIcon(getClass().getResource("/teste/c++.png")));
        imagensPorPlaneta.put("C#", new ImageIcon(getClass().getResource("/teste/C#.png")));
        imagensPorPlaneta.put("PHP", new ImageIcon(getClass().getResource("/teste/PHP.png")));
        imagensPorPlaneta.put("Ruby", new ImageIcon(getClass().getResource("/teste/Ruby.png")));
        imagensPorPlaneta.put("JavaScript", new ImageIcon(getClass().getResource("/teste/JavaScript.png")));
        imagensPorPlaneta.put("Phython", new ImageIcon(getClass().getResource("/teste/Phyton.png")));
        imagensPorPlaneta.put("Java", new ImageIcon(getClass().getResource("/teste/Java.png")));
    }
    public void Grade(CentralJL java) {
        int id = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                PainelCelulas = new CelulasnoPainel(j, i, id );  
                PainelCelulas.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                Celula planoCelula = sistemaJava.getplano().Celulas.get(id);
                add(PainelCelulas);
                PlanoCelulas.add(PainelCelulas);
                id++;
            }
        }

    }
    public void definirImagemParaCelula(int id, ImageIcon img) {
        if (id >= 0 && id < PlanoCelulas.size()) {
            CelulasnoPainel celula = PlanoCelulas.get(id);
//            celula.setImage(img);
        }
    }

    
    
//    public void BugsPainel() {
//        for (int id = 0; id < PlanoCelulas.size(); id++) {
//            CelulasnoPainel celula = PlanoCelulas.get(id);
//            Celula planoCelula = sistemaJava.getplano().Celulas.get(id);
//        }
//    }
//
//    public void DevsPainel() {
//        for (int id = 0; id < PlanoCelulas.size(); id++) {
//            CelulasnoPainel celula = PlanoCelulas.get(id);
//            Celula planoCelula = sistemaJava.getplano().Celulas.get(id);
//        }
//    }

//    public void movimentar(CentralJL java) {
//        for (Planeta planeta : java.getListaDePlaneta()) {
//            moverPlanetas(planeta);
//        }
//    }
//    
//    public void moverPlanetasNoPlano() {
//        for (Planeta planeta : sistemaJava.getListaDePlaneta()) {
//            moverPlanetas(planeta);
//        }
//    }
//    public void moverPlanetas(Planeta planeta) {
//        for (CelulasnoPainel CelulaPanel : PlanoCelulas) {
//
//        }
//    }
//    public void Setarimagem(int id, ImageIcon img) {
//        CelulasnoPainel celulaNewIMG = celulasdoPlano.get(id);
//        celulaNewIMG.setImage(img);
//    }
    
//    public ImageIcon obterImagemParaPlaneta(Planeta planeta) {
//        String nomePlaneta = planeta.getNome();
//
//        switch (nomePlaneta) {
//            case "C":
//                return imagensPorPlaneta.get("C");
//            case "C++":
//                return imagensPorPlaneta.get("C++");
//            case "C#":
//                return imagensPorPlaneta.get("C#");
//            case "PHP":
//                return imagensPorPlaneta.get("PHP");
//            case "RR":
//                return imagensPorPlaneta.get("RR");
//            case "JS":
//                return imagensPorPlaneta.get("JS");
//            case "Python":
//                return imagensPorPlaneta.get("Python");
//            case "Java":
//                return imagensPorPlaneta.get("Java");
//            // Adicione mais cases conforme necessário para outros planetas
//            default:
//                // Caso o nome do planeta não seja reconhecido, você pode retornar uma imagem padrão ou null
//                return null;
//        }
//    }
    
}
