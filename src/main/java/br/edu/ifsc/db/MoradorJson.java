package br.edu.ifsc.db;

import java.util.ArrayList;

import br.edu.ifsc.entities.Morador;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MoradorJson implements MoradorDBInterface {
	private static ObservableList<Morador> moradores;

	@Override
	public Morador getMorador(String username) {
		moradores = getMoradores();
		for (Morador morador : moradores)
			if (morador.getNome().contentEquals(username))
				return morador;
		return null;
	}

	public ObservableList<Morador> getMoradores() {
		if (moradores == null) {
			moradores = FXCollections.observableArrayList(new ArrayList<Morador>());
			moradores.add(new Morador("A", "B", null, null, 0, null, 0, null, false));
		}
		return moradores;
	}

	@Override
	public void addMorador(String nome, String cpf, String dataNasc, String telefone, int apartamento, String bloco,
			int qtdMoradores, String vagaGaragem, String entrada, boolean menorIdade) {
		getMoradores().add(new Morador(nome, cpf, dataNasc, telefone, apartamento, bloco, qtdMoradores, vagaGaragem,
				entrada, menorIdade));
	}

}
