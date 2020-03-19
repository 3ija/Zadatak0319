package config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cont {

	public static BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);
}
