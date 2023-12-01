package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import controller.AlunoDados;
import model.Conexao;

public class JavalarDAO {
	private Conexao conexao;
	
	public void JavalarDAO(ArrayList<String> a) {
       
		for(String string : a) {
			String[] partesT = string.split(",");
			
			String nome = partesT[0];
            int matricula  = Integer.parseInt(partesT[1]);
            String nomeAquivo = partesT[2];
            int bug_python = Integer.parseInt(partesT[3]);
            int bug_javascript = Integer.parseInt(partesT[4]);
            int bug_ruby = Integer.parseInt(partesT[5]);
            int bug_php = Integer.parseInt(partesT[6]);
            int bug_csharp = Integer.parseInt(partesT[7]);
            int bug_cmais = Integer.parseInt(partesT[8]);
            int bug_c = Integer.parseInt(partesT[9]);
            int dev_python = Integer.parseInt(partesT[10]);
            int dev_javascript = Integer.parseInt(partesT[11]);
            int dev_ruby = Integer.parseInt(partesT[12]);
            int dev_php = Integer.parseInt(partesT[13]);
            int dev_csharp = Integer.parseInt(partesT[14]);
            int dev_cmais = Integer.parseInt(partesT[15]);
            int dev_c = Integer.parseInt(partesT[16]);
            double v_python = Double.parseDouble(partesT[17]);
            double v_javascript = Double.parseDouble(partesT[18]);
            double v_ruby = Double.parseDouble(partesT[19]);
            double v_php = Double.parseDouble(partesT[20]);
            double v_csharp = Double.parseDouble(partesT[21]);
            double v_cmais = Double.parseDouble(partesT[22]);
            double v_c = Double.parseDouble(partesT[23]);
            double d_python = Double.parseDouble(partesT[24]);
            double d_javascript = Double.parseDouble(partesT[25]);
            double d_ruby = Double.parseDouble(partesT[26]);
            double d_php = Double.parseDouble(partesT[27]);
            double d_csharp = Double.parseDouble(partesT[28]);
            double d_cmais = Double.parseDouble(partesT[29]);
            double d_c = Double.parseDouble(partesT[30]);
            double a_python = Double.parseDouble(partesT[31]);
            double a_javascript = Double.parseDouble(partesT[32]);
            double a_ruby = Double.parseDouble(partesT[33]);
            double a_php = Double.parseDouble(partesT[34]);
            double a_csharp = Double.parseDouble(partesT[35]);
            double a_cmais = Double.parseDouble(partesT[36]);
            double a_c = Double.parseDouble(partesT[37]);
            
            int bugQ1 = Integer.parseInt(partesT[38]);
            int bugQ2 = Integer.parseInt(partesT[39]);
            int bugQ3 = Integer.parseInt(partesT[40]);
            int bugQ4 = Integer.parseInt(partesT[41]);
            int devQ1 = Integer.parseInt(partesT[42]);
            int devQ2 = Integer.parseInt(partesT[43]);
            int devQ3 = Integer.parseInt(partesT[44]);
            int devQ4 = Integer.parseInt(partesT[45]);
		
		
		 try {
	    	  Connection connection = new Conexao().getConexao();
		
	    	  PreparedStatement insert = connection.prepareStatement("INSERT INTO javalar (nome, matricula, nome_arquivo, "
	  	            + "bug_python, bug_javascript, bug_ruby, bug_php, bug_csharp, bug_cmais, bug_c, "
		            + "dev_python, dev_javascript, dev_ruby, dev_php, dev_csharp, dev_cmais, dev_c, "
		            + "v_python, v_javascript, v_ruby, v_php, v_csharp, v_cmais, v_c, "
		            + "d_python, d_javascript, d_ruby, d_php, d_csharp, d_cmais, d_c, "
		            + "a_python, a_javascript, a_ruby, a_php, a_csharp, a_cmais, a_c, "
		            + "bug_q1, bug_q2, bug_q3, bug_q4, " + "dev_q1, dev_q2, dev_q3, dev_q4) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
	    	 
	    	  	insert.setString(1, nome);
		        insert.setInt(2, matricula);
		        insert.setString(3, nomeAquivo);
		        insert.setInt(4, bug_python);
		        insert.setInt(5, bug_javascript);
		        insert.setInt(6, bug_ruby);
		        insert.setInt(7, bug_php);
		        insert.setInt(8, bug_csharp);
		        insert.setInt(9, bug_cmais);
		        insert.setInt(10, bug_c);
		        insert.setInt(11, dev_python);
		        insert.setInt(12, dev_javascript);
		        insert.setInt(13, dev_ruby);
		        insert.setInt(14, dev_php);
		        insert.setInt(15, dev_csharp);
		        insert.setInt(16, dev_cmais);
		        insert.setInt(17, dev_c);
		        insert.setDouble(18, v_python);
		        insert.setDouble(19, v_javascript);
		        insert.setDouble(20, v_ruby);
		        insert.setDouble(21, v_php);
		        insert.setDouble(22, v_csharp);
		        insert.setDouble(23, v_cmais);
		        insert.setDouble(24, v_c);
		        insert.setDouble(25, d_python);
		        insert.setDouble(26, d_javascript);
		        insert.setDouble(27, d_ruby);
		        insert.setDouble(28, d_php);
		        insert.setDouble(29, d_csharp);
		        insert.setDouble(30, d_cmais);
		        insert.setDouble(31, d_c);
		        insert.setDouble(32, a_python);
		        insert.setDouble(33, a_javascript);
		        insert.setDouble(34, a_ruby);
		        insert.setDouble(35, a_php);
		        insert.setDouble(36, a_csharp);
		        insert.setDouble(37, a_cmais);
		        insert.setDouble(38, a_c);
		        insert.setInt(39, bug_python);
		        insert.setInt(40, bug_javascript);
		        insert.setInt(41, bug_ruby);
		        insert.setInt(42, bug_php);
		        insert.setInt(43, bug_csharp);
		        insert.setInt(44, bug_cmais);
		        insert.setInt(45, bug_c);
		        insert.setInt(46, dev_python);
		        
		        insert.execute();

		        connection.close();
		      } catch (SQLException exception) {
		        exception.printStackTrace();
		      }
		    }
		  }

		private ResultSet getData() {
			
			try {
				Connection conexao = new Conexao().getConexao();

				String bd = "SELECT * FROM javalar";

				return conexao.prepareStatement(bd).executeQuery();
			} catch (SQLException e) {
				System.err.println("Conexao mal sucedida, tente novamente");
				e.printStackTrace();
			}

			return null;
		}

		public AlunoDados AlunoQueMaisJogou() {

			ArrayList<AlunoDados> estudantes = new ArrayList<AlunoDados>();

			try {
				Connection conexao = new Conexao().getConexao();

				String sql = "SELECT * FROM javalar";

				ResultSet resultados = conexao.prepareStatement(sql).executeQuery();

				while (resultados.next()) {
					String name = resultados.getString("nome");
					int matricula = resultados.getInt("matricula");

					estudantes.add(new AlunoDados(name, matricula));
				}

				conexao.close();

			} catch (Exception e) {
				System.err.println("Falha na conexão.");
				e.printStackTrace();
			}

			Map<AlunoDados, Integer> contagemDeAlunos = new HashMap<>();

			for (AlunoDados aluno : estudantes) {
				contagemDeAlunos.put(aluno, contagemDeAlunos.getOrDefault(aluno, 0) + 1);
			}
			
			AlunoDados alunoQueMaisJogou = null;
			int frequencia = 0;

			for (Map.Entry<AlunoDados, Integer> entry : contagemDeAlunos.entrySet()) {
				if (entry.getValue() > frequencia) {
					frequencia = entry.getValue();
					alunoQueMaisJogou = entry.getKey();
				}
			}
			
			return alunoQueMaisJogou;
		}
		
		public String PlanetaQueMaisMorreu() {

			ArrayList<String> PlanetasMortos = new ArrayList<String>();
			try {
				ResultSet resultados = getData();

				while (resultados.next()) {

					if (resultados.getInt("v_python") == 0) {
						PlanetasMortos.add("Python");
					}
					if (resultados.getInt("v_javascript") == 0) {
						PlanetasMortos.add("JavaScript");					
					}
					if (resultados.getInt("v_ruby") == 0) {
						PlanetasMortos.add("Ruby On Rails");
					}
					if (resultados.getInt("v_php") == 0) {
						PlanetasMortos.add("PHP");
					}
					if (resultados.getInt("v_csharp") == 0) {
						PlanetasMortos.add("C#");
					}
					if (resultados.getInt("v_cmais") == 0) {
						PlanetasMortos.add("C++");					
					}
					if (resultados.getInt("v_c") == 0) {
						PlanetasMortos.add("C");
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			Map<String, Integer> map = new HashMap<String, Integer>();

			for (String planeta : PlanetasMortos) {
				Integer contando = map.get(planeta);
				map.put(planeta, (contando == null) ? 1 : contando + 1);
			}

			String nomeDoPlaneta = "";
			int maiorValorNoMap = 0;

			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() > maiorValorNoMap) {
					maiorValorNoMap = entry.getValue();
					nomeDoPlaneta = entry.getKey();
				}
			}

			return nomeDoPlaneta;
		}
		
		public String PlanetaComMaisVida() {
			try {
				ResultSet resultados = getData();

				int[] planetas = { 0, 0, 0, 0, 0, 0, 0 };
				int Valormaximo = 0;
				int planeta = 0;

				while (resultados.next()) {
					planetas[0] += resultados.getInt("v_python");
					planetas[1] += resultados.getInt("v_javascript");
					planetas[2] += resultados.getInt("v_ruby");
					planetas[3] += resultados.getInt("v_php");
					planetas[4] += resultados.getInt("v_csharp");
					planetas[5] += resultados.getInt("v_cmais");
					planetas[6] += resultados.getInt("v_c");
				}

				for (int i = 0; i < planetas.length; i++) {
					if (planetas[i] > Valormaximo) {
						Valormaximo = planetas[i];
						planeta = i + 1;
					}
				}

				switch (planeta) {
				case 1:
					return "Python";
				case 2:
					return "JavaScript";
				case 3:
					return "Ruby On Rails";
				case 4:
					return "PHP";
				case 5:
					return "C#";
				case 6:
					return "C++";
				case 7:
					return "C";
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			return null;
		}
		
		public int QuadranteComMaisBugs() {

			int[] quadrantes = { 0, 0, 0, 0 };
			int valorMAX = 0;
			int quadrante = 0;

			try {

				ResultSet resultado = getData();
				while (resultado.next()) {
					quadrantes[0] += resultado.getInt("bug_q1");
					quadrantes[1] += resultado.getInt("bug_q2");
					quadrantes[2] += resultado.getInt("bug_q3");
					quadrantes[3] += resultado.getInt("bug_q4");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}


			for (int i = 0; i < quadrantes.length; i++) {
				if (quadrantes[i] > valorMAX) {
					valorMAX = quadrantes[i];
					quadrante = i + 1;
				}
			}

			return quadrante;
		}

		public int QuadranteComMaisDevs() {

			int[] quadrantes = { 0, 0, 0, 0 };
			int valorMAX = 0;
			int quadrante = 0;

			try {

				ResultSet resultado = getData();
				while (resultado.next()) {
					quadrantes[0] += resultado.getInt("dev_q1");
					quadrantes[1] += resultado.getInt("dev_q2");
					quadrantes[2] += resultado.getInt("dev_q3");
					quadrantes[3] += resultado.getInt("dev_q4");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}


			for (int i = 0; i < quadrantes.length; i++) {
				if (quadrantes[i] > valorMAX) {
					valorMAX = quadrantes[i];
					quadrante = i + 1;
				}
			}

			return quadrante;
		}
		
		public int QuantidadeDeInstantesAnalizados() {
			
			try {
				ResultSet resultado = getData();

				int quantidadeInstantes = 0;

				while (resultado.next()) {
					quantidadeInstantes++;
				}

				return quantidadeInstantes;
			} catch (Exception e) {
				e.printStackTrace();
			}

			return 0;
		}
		
		public double[] VelocidadeMedia() {

			int[] velocidades = { 0, 0, 0, 0, 0, 0, 0 };
			int ocorrencias = QuantidadeDeInstantesAnalizados();

			try {
				ResultSet resultado = getData();

				while (resultado.next()) {
					velocidades[0] += resultado.getInt("v_python");
					velocidades[1] += resultado.getInt("v_javascript");
					velocidades[2] += resultado.getInt("v_ruby");
					velocidades[3] += resultado.getInt("v_php");
					velocidades[4] += resultado.getInt("v_csharp");
					velocidades[5] += resultado.getInt("v_cmais");
					velocidades[6] += resultado.getInt("v_c");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			double[] velocidadeMedia = new double[velocidades.length];

			for (int i = 0; i < velocidades.length; i++) {
				velocidadeMedia[i] = velocidades[i] / (double) ocorrencias;
			}

			return velocidadeMedia;
		}
		
		public int QuantidadeDeBugs() {
		    int quantidadeBugs = 0;

		    try {
		        ResultSet resultado = getData();

		        while (resultado.next()) {
		            quantidadeBugs += resultado.getInt("bug_python")
		                             + resultado.getInt("bug_javascript")
		                             + resultado.getInt("bug_ruby")
		                             + resultado.getInt("bug_php")
		                             + resultado.getInt("bug_csharp")
		                             + resultado.getInt("bug_cmais")
		                             + resultado.getInt("bug_c");
		        }

		      return quantidadeBugs;
		    } catch (Exception e) {
		      e.printStackTrace();
		      return 0;
		    }
		}

		public int QuantidadeDeDevs() {
			
			try {
				ResultSet resultado = getData();

				int quantidadeDevs = 0;

				 while (resultado.next()) {
			            quantidadeDevs += resultado.getInt("dev_python")
			                             + resultado.getInt("dev_javascript")
			                             + resultado.getInt("dev_ruby")
			                             + resultado.getInt("dev_php")
			                             + resultado.getInt("dev_csharp")
			                             + resultado.getInt("dev_cmais")
			                             + resultado.getInt("dev_c");
			        }


			  return quantidadeDevs;
			} catch (Exception e) {
			  e.printStackTrace();
			}

			return 0;
		}
		
		public int QuantidadeHoras() {
			
		    int quantidadeHoras = 0;

		    try {
		        ResultSet resultado = getData();

		        while (resultado.next()) {
		            quantidadeHoras += resultado.getInt("d_python")
		                             + resultado.getInt("d_javascript")
		                             + resultado.getInt("d_ruby")
		                             + resultado.getInt("d_php")
		                             + resultado.getInt("d_csharp")
		                             + resultado.getInt("d_cmais")
		                             + resultado.getInt("d_c");
		        }

		      return quantidadeHoras;
		    } catch (Exception e) {
		      e.printStackTrace();
		      return 0;
		    }
		}
		
		public int QuantidadeAnos() {
		    try {
		        ResultSet resultado = getData();
		        int quantidadeAnos = 0;

		        String[] planetas = {"a_python", "a_javascript", "a_ruby", "a_php", "a_csharp", "a_cmais", "a_c"};

		        while (resultado.next()) {
		            for (String planeta : planetas) {
		                quantidadeAnos += resultado.getInt(planeta);
		            }
		        }

		        return quantidadeAnos;
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return 0;
		}
	}
