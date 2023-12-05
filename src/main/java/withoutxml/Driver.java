package withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
	Laptop laptop=applicationContext.getBean("laptop",Laptop.class);
	Charger charger=applicationContext.getBean("charger",Charger.class);
	System.out.println(laptop);
	System.out.println(charger);
}
}
