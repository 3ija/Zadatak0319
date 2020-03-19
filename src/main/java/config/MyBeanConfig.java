package config;

import org.springframework.context.annotation.Bean;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.User;

public class MyBeanConfig {
	
	@Bean(name = "user")
	public User getUser() {
		return new User();
	}
	
	@Bean(name = "userDao")
	public UserDao getUserDao() {
		return new UserDaoImpl();
	}
}
