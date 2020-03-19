package service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Cont;
import config.MyBeanConfig;
import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.User;

public class UserService {
	
	private UserDao userDao;
	
	
	public void unosUser() {
		Scanner s = new Scanner(System.in);
		System.out.println("___________________");
		System.out.println("Unos Usera pocinje.");
		System.out.println();
		System.out.println("Unesite ime: ");
		String firstname = s.nextLine();
		System.out.println("Unesite prezime: ");
		String lastname = s.nextLine();
		System.out.println("Unesite username: ");
		String username = s.nextLine();
		System.out.println("Unesite password: ");
		String password = s.nextLine();
		System.out.println("Unos Usera zavrsen.");
		System.out.println("___________________");
		
		//UserDao userDao = (UserDao) Cont.container.getBean("userDao");
		userDao.save(firstname, lastname, username, password);
		System.out.println("Kraj.");
	}
	
	@Autowired
	@Qualifier(value = "auserDao")
	public void setUserDao(UserDao auserDao) {
		this.userDao = auserDao;
	}
	
	public void prikazUser() {
		
		List<User> users = userDao.allUser();
		System.out.println("POCETAK ISPISA USERA");
		System.out.println("#########################");
		for(User user : users) {
			System.out.println(user);
		}
		System.out.println("#########################");
		System.out.println("KRAJ");
	}

}
