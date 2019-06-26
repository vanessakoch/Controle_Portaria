package br.edu.ifsc.db;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsc.entities.User;

public class UserJson implements UserInterface {

	@Override
	public User getUser(String username) {
		
		if (username.equals("json"))
			return new User("json", "123");
		else
			return null;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User("json1", "123"));
		users.add(new User("json2", "123"));
		return users;
	}

}
