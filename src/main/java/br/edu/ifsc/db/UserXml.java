package br.edu.ifsc.db;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsc.entities.User;

public class UserXml implements UserInterface {

	@Override
	public User getUser(String username) {

		if (username.equals("xml"))
			return new User("xml", "123");
		if (username.equals("admin"))
			return new User("admin","123");
		else
			return null;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User("xml1", "123"));
		users.add(new User("xml2", "123"));
		return users;
	}

}
