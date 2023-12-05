package zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;

public class Driver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
    Zoo zoo=applicationContext.getBean("zoo",Zoo.class);
    zoo.zooSound();
}
}
