package br.edu.ifsc.util;

import br.edu.ifsc.db.MoradorDBInterface;
import br.edu.ifsc.db.MoradorJson;

import br.edu.ifsc.db.UserDBInterface;

import br.edu.ifsc.db.UserJson;
import br.edu.ifsc.db.VeiculoDBInterface;
import br.edu.ifsc.db.VeiculoJson;

public class DB {

	public static UserDBInterface users = new UserJson();
	public static MoradorDBInterface moradores = new MoradorJson();
	public static VeiculoDBInterface veiculos = new VeiculoJson();

}
