package br.edu.ifsc.util;

import br.edu.ifsc.db.MoradorDBInterface;
import br.edu.ifsc.db.MoradorJson;
import br.edu.ifsc.db.UserInterface;
import br.edu.ifsc.db.UserJson;

public class DB {
	public static UserInterface users = new UserJson();
	public static MoradorDBInterface moradores = new MoradorJson();
}
