package dao;

import java.util.List;

import domain.User;

public interface UserDao {

	void save(String firstname, String lastname, String username, String password);
	List<User> allUser();
}
