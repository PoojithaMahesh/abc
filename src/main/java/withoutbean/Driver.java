package withoutbean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {

	ApplicationContext context=new ClassPathXmlApplicationContext("withoutbean.xml");
	Laptop laptop=context.getBean("laptop",Laptop.class);
	Charger charger=context.getBean("charger",Charger.class);
	System.out.println(laptop);
	System.out.println(charger);
	
}
}
