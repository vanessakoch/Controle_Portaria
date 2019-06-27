package br.edu.ifsc.db;

import java.util.ArrayList;
import br.edu.ifsc.entities.Veiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class VeiculoJson implements VeiculoDBInterface{
	
	private static ObservableList<Veiculo> veiculos;

	public Veiculo getVeiculo(String placa) {
		veiculos = getVeiculos();
		for (Veiculo veiculo : veiculos)
			if (veiculo.getPlaca().equals(placa))
				return veiculo;
		return null;
	}

	@Override
	public ObservableList<Veiculo> getVeiculos() {
		if (veiculos == null) {
			veiculos = FXCollections.observableArrayList(new ArrayList<Veiculo>());
			veiculos.add(new Veiculo("Kwid","Zen", "KIP-8844"));
			veiculos.add(new Veiculo("Ford", "Ka", "AMD-4457"));

		}
		return veiculos;
	}

	@Override
	public void addVeiculo(String marca, String modelo, String placa) {
		getVeiculos().add(new Veiculo(marca, modelo, placa));
	}

}
