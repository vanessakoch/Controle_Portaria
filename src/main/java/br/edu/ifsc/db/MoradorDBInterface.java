package br.edu.ifsc.db;

import br.edu.ifsc.entities.Morador;
import javafx.collections.ObservableList;

public interface MoradorDBInterface {


	public Morador getMorador(String username);

	public ObservableList<Morador> getMoradores();
	
	public void addMorador(String nome, String cpf, String dataNasc, String telefone, int apartamento, String bloco,
			int qtdMoradores, String vagaGaragem, String entrada, boolean menorIdade);
		
		
	

}
