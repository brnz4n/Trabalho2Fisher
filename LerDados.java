package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerDados {

	public ArrayList<String> dados;
	
	public String[] Separar(String linha) {
		return linha.split("\t");
	}
	
	public List<String> leituraDeDados(String diretorio) throws FileNotFoundException, IOException {
	    List<String> dados = new ArrayList<>();

	    try (BufferedReader leitura = new BufferedReader(new FileReader(diretorio))) {
	        leitura.readLine(); 

	        while (leitura.ready()) {
	            String linha = leitura.readLine();
	            dados.add(linha);
	        }
	    } catch (IOException e) {
	        e.printStackTrace(); 
	    }

	    return dados;
	}
}