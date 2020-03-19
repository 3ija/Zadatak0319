package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyBeanConfig;
import dao.UserDao;
import domain.User;

public class UserDaoImpl2 implements UserDao {

	public static List<User> users = new ArrayList<User>();

	public void save(String firstname, String lastname, String username, String password) {

		BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		User user = (User) container.getBean("user");
		
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setUsername(username);
		user.setPassword(password);
		
		users.add(user);
		
	}
	
	
	public void printList() {
		for(User user : users) {
			System.out.println(user);
		}
	}

	public List<User> allUser() {
		return users;
	}
	
	
}
