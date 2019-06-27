package br.edu.ifsc.db;

import java.util.List;
import br.edu.ifsc.entities.User;

public interface UserDBInterface {

	public User getUser(String username);

	public List<User> getUsers();
}
