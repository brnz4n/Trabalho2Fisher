package controller;

import javax.swing.JOptionPane;
import model.EscreverDados;
import model.JavalarDAO;

public class ChamarDados{
	private JavalarDAO chamarDados;
	private EscreverDados escreverdados;
	private StringBuilder StringBuilder;
	
	public ChamarDados() {
		chamarDados = new JavalarDAO();
		escreverdados = new EscreverDados();
		StringBuilder = new StringBuilder();
	}
	public void obterInformaçoesRelatorio() {
		AlunoDados aluno = alunoQueMaisJogou();

		StringBuilder.append(aluno.getMatricula() + " - " + aluno.getNome());
		StringBuilder.append(", " + retornarPlanetaQueMaisMorreu());
		StringBuilder.append(", " + retornarPlanetaComMaisVida());
		StringBuilder.append(", " + retornarQuadranteComMaisBugs());
		StringBuilder.append(", " + retornarQuadranteComMaisDevs());
		StringBuilder.append(", " + retornarQuantidadeDeInstantesAnalizados());

		double[] VelocidadeMedia = retornarVelocidadeMedia();

		for (int i = 0; i < VelocidadeMedia.length; i++) {
			String nomeDoPlaneta = NomeDosPlanetas.obterNome(i + 1);
			String expression = nomeDoPlaneta + ": " + String.format("%.2f", VelocidadeMedia[i]);
			if (i == 0) {
				StringBuilder.append(", " + expression);
			} else {
				StringBuilder.append(" - " + expression);
			}
		}

		StringBuilder.append(", " + retornarQuantidadeDeBugs());
		StringBuilder.append(", " + retornarQuantidadeDeDevs());
		StringBuilder.append(", " + retornarQuantidadeHoras());
		StringBuilder.append(", " + retornarQuantidadeAnos() + "\n");
		
		System.out.println(StringBuilder.toString());
		
	}
	
	public void salvarInformacoes() {
		EscreverDados dados = new EscreverDados();
		dados.escreverDados("src/teste/relatorio.txt", StringBuilder.toString());
	}
	
	public class NomeDosPlanetas {

	    public static String obterNome(int index) {
	        String[] nomes = {
	            null,
	            "Python",
	            "JavaScript",
	            "Ruby On Rails",
	            "PHP",
	            "C#",
	            "C++",
	            "C"
	        };
	        if (index >= 1 && index < nomes.length) {
	            return nomes[index];
	        } else {
	            return null;
	        }
	    }
	}
	
	public AlunoDados alunoQueMaisJogou() {
		return chamarDados.AlunoQueMaisJogou();
	}
	
	public String retornarPlanetaQueMaisMorreu() {
		return chamarDados.PlanetaQueMaisMorreu();
	}
	
	public String retornarPlanetaComMaisVida() {
		return chamarDados.PlanetaComMaisVida();
	}
	
	public int retornarQuadranteComMaisBugs() {
		return chamarDados.QuadranteComMaisBugs();
	}
	
	public int retornarQuadranteComMaisDevs() {
		return chamarDados.QuadranteComMaisDevs();
	}
	
	public int retornarQuantidadeDeInstantesAnalizados() {
		return chamarDados.QuantidadeDeInstantesAnalizados();
	}

	public double[] retornarVelocidadeMedia() {
		return chamarDados.VelocidadeMedia();
	}
	
	public int retornarQuantidadeDeBugs() {
		return chamarDados.QuantidadeDeBugs();
	}
	
	public int retornarQuantidadeDeDevs() {
		return chamarDados.QuantidadeDeDevs();
	}
	
	public int retornarQuantidadeHoras() {
		return chamarDados.QuantidadeHoras();
	}
	
	public int retornarQuantidadeAnos() {
		return chamarDados.QuantidadeAnos();
	}
}