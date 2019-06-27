package br.edu.ifsc.db;

import java.util.List;
import br.edu.ifsc.entities.Veiculo;

public interface VeiculoDBInterface {

	public Veiculo getVeiculo(String placa);

	public List<Veiculo> getVeiculos();
	
	public void addVeiculo(String marca, String modelo, String placa);
}

